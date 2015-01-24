package dhbw.dev.compiler.compiler;

import jasmin.ClassFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import dhbw.dev.compiler.parser.JCLexer;
import dhbw.dev.compiler.parser.JCParser;

public class Main {
	
	private static String sourceFile = "Tests/provide/xXx/Code.jc";
	
	public static void main(String[] args) throws Exception {
		//ANTLRInputStream input = new ANTLRFileStream(sourceFile);
		//System.out.println(compile(input));
		

		String jasminSource = parse();
		System.out.println("#### Jasmin source:");
		System.out.println(jasminSource);
		System.out.println("#### End of Jasmin source:");
		createClassFile(jasminSource);
		executeClass();
	}
	
	public static String compile(ANTLRInputStream input) throws IOException {
		JCLexer lexer = new JCLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JCParser parser = new JCParser(tokens);
		
		ParseTree tree = parser.start();
		FunctionList definedFunctions = FunctionDefintitionFinder.findFunctions(tree);
		return new MyVisitor(definedFunctions).visit(tree);
	}
	
	private static void createClassFile(String jasminSource) throws Exception {
		ClassFile classFile = new ClassFile();
		classFile.readJasmin(new StringReader(jasminSource), "", true);
		
		final String outputFileName = Main.class.getResource("/").getFile() + classFile.getClassName() + ".class";
		//final String outputFileName = "C:/Users/Cedric/Google Drive/Studium/Semester 04/Compilerbau/J$C#_compiler/bin/" + classFile.getClassName() + ".class";
		System.out.println("Writing class to " + outputFileName);
		FileOutputStream classOut = new FileOutputStream(outputFileName);
		classFile.write(classOut);
		classOut.close();
	}

	private static void executeClass() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
			InvocationTargetException
	{
		Class<?> myClass = Class.forName("JCClass");
		System.out.println(myClass.getMethod("main", String[].class));
		System.out.println("invoking main...");
		myClass.getMethod("main", String[].class).invoke(null, (Object)null);
		System.out.println("done");
	}

	private static String parse() throws IOException
	{
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRFileStream(sourceFile);
		// create a lexer that feeds off of input CharStream
		JCLexer lexer = new JCLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		JCParser parser = new JCParser(tokens);
		ParseTree tree = parser.start(); // begin parsing at init rule

		FunctionList definedFunctions = FunctionDefintitionFinder.findFunctions(tree);
		String jasminClass = new MyVisitor(definedFunctions).visit(tree);
		return jasminClass;
	}

}
