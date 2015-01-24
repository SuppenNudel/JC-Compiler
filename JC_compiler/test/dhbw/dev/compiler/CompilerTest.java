package dhbw.dev.compiler;

import jasmin.ClassFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dhbw.dev.compiler.compiler.Main;
import dhbw.dev.compiler.compiler.exceptions.DublicateFunctionException;
import dhbw.dev.compiler.compiler.exceptions.RedefinedVariableException;
import dhbw.dev.compiler.compiler.exceptions.UndeclaredVariableException;
import dhbw.dev.compiler.compiler.exceptions.UndefinedFunctionException;

// TODO JUnit verwenden
public class CompilerTest {
	
	private Path tempDir;
	
	@BeforeMethod
	public void createTempDir() throws IOException {
		tempDir = Files.createTempDirectory("compilerTest");
	}
	
	@AfterMethod
	public void deleteTempDir() {
		deleteRecursive(tempDir.toFile());
	}

	private void deleteRecursive(File file) {
		if (file.isDirectory()) {
			for(File child : file.listFiles()) {
				deleteRecursive(child);
			}
		}
		if (!file.delete()) {
			throw new Error("Could not delete file <" + file + ">");
		}
	}

	@Test(dataProvider = "provide_code_expectedText")
	public void runningCode_outputsExpectedTest(String code, String expectedText) throws Exception {
		// execution
		String actualOutput = compileAndRun(code);
		
		// evaluation
		Assert.assertEquals(actualOutput, expectedText);
	}
	
	@Test(expectedExceptions = UndeclaredVariableException.class,
			expectedExceptionsMessageRegExp = "2:8 undeclared variable <someInt>")
	public void throws_UndeclaredVariableException() throws Exception {
		// execution
		compileAndRun(new String(Files.readAllBytes(new File("Tests/exception/undeclaredVariable/Code.jc").toPath())));
	}
	
	@Test(expectedExceptions = RedefinedVariableException.class,
			expectedExceptionsMessageRegExp = "3:2 redefined variable <someInt>")
	public void throws_RedefinedVariableException() throws Exception {
		// execution
		compileAndRun(new String(Files.readAllBytes(new File("Tests/exception/redefinedVariable/Code.jc").toPath())));		
	}
	
	@Test(expectedExceptions = DublicateFunctionException.class,
			expectedExceptionsMessageRegExp = "9:1 redefined function test \\[\\] returns VOID")
	public void throws_DublicateFunctionException() throws Exception {
		// execution
		compileAndRun(new String(Files.readAllBytes(new File("Tests/exception/dublicateFunction/Code.jc").toPath())));		
	}
	
	@Test(expectedExceptions = UndefinedFunctionException.class,
			expectedExceptionsMessageRegExp = "2:2 call to undefined function test \\[\\] returns VOID")
	public void throws_UndefinedFunctionException() throws Exception {
		// execution
		compileAndRun(new String(Files.readAllBytes(new File("Tests/exception/undefinedFunction/Code.jc").toPath())));		
	}
	
	@DataProvider
	public Object[][] provide_code_expectedText() throws IOException {
		return new Object[][] {
			{
				new String(Files.readAllBytes(new File("Tests/provide/and/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/and/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/bool/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/bool/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/calculation/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/calculation/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/cast/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/cast/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/double/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/double/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/function/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/function/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/if/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/if/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/is/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/is/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/isNot/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/isNot/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/lightergreaterThan/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/lightergreaterThan/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/loop/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/loop/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/method/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/method/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/or/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/or/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/output/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/output/Result").toPath()))
			},
			{
				new String(Files.readAllBytes(new File("Tests/provide/string/Code.jc").toPath())),
				new String(Files.readAllBytes(new File("Tests/provide/string/Result").toPath()))
			},
		};
	}

	private String compileAndRun(String code) throws Exception {
		code = Main.compile(new ANTLRInputStream(code));
		ClassFile classFile = new ClassFile();
		classFile.readJasmin(new StringReader(code), "", false);
		Path outputPath = tempDir.resolve(classFile.getClass().getSimpleName() + ".class");
		try(OutputStream outStream = Files.newOutputStream(outputPath)) {
			classFile.write(outStream);
		}
		return runJavaClass(tempDir, classFile.getClassName());
	}

	private String runJavaClass(Path dir, String className) throws Exception {
		Process process = Runtime.getRuntime().exec(new String[]{"java", "-cp", dir.toString(), className});
		try(InputStream in = process.getInputStream()) {
			try(Scanner scanner = new Scanner(in).useDelimiter("\\A")) {
				if(scanner.hasNext()) {
					return scanner.next();
				} else {
					return "";
				}
			}
		}
	}
	
}
