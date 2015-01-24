// Generated from JC.g4 by ANTLR 4.2
package dhbw.dev.compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JCParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, IF=28, ELSE=29, DO=30, WHILE=31, CMD=32, BLOCKOPEN=33, 
		BLOCKCLOSE=34, BRACKETOPEN=35, BRACKETCLOSE=36, COMMANDEND=37, INTEGER=38, 
		DOUBLE=39, BOOL=40, STRING=41, COMMENTBLOCK=42, COMMENTLINE=43, WHITESPACE=44, 
		NUMBER=45, IDENTIFIER=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'main'", "'return'", "'!='", "'||'", "'&&'", "'='", 
		"'^'", "'?'", "'<='", "'[]'", "'$'", "'*'", "','", "'.'", "'>='", "'<'", 
		"'=='", "'%%'", "'>'", "'~'", "'!'", "'#'", "'%'", "'§'", "'+'", "'-'", 
		"'if'", "'else'", "'do'", "'while'", "'cmd'", "'{'", "'}'", "'('", "')'", 
		"';'", "INTEGER", "DOUBLE", "BOOL", "STRING", "COMMENTBLOCK", "COMMENTLINE", 
		"WHITESPACE", "NUMBER", "IDENTIFIER"
	};
	public static final int
		RULE_start = 0, RULE_mainMethod = 1, RULE_method = 2, RULE_methodCall = 3, 
		RULE_function = 4, RULE_functionInt = 5, RULE_functionBool = 6, RULE_functionString = 7, 
		RULE_functionCall = 8, RULE_functionCallInt = 9, RULE_functionCallBool = 10, 
		RULE_functionCallString = 11, RULE_innerMethod = 12, RULE_ifBlock = 13, 
		RULE_whileBlock = 14, RULE_doBlock = 15, RULE_command = 16, RULE_array = 17, 
		RULE_varType = 18, RULE_declaration = 19, RULE_assignment = 20, RULE_expression = 21, 
		RULE_calcDouble = 22, RULE_calcInt = 23, RULE_comparison = 24, RULE_concatenation = 25, 
		RULE_cmd = 26;
	public static final String[] ruleNames = {
		"start", "mainMethod", "method", "methodCall", "function", "functionInt", 
		"functionBool", "functionString", "functionCall", "functionCallInt", "functionCallBool", 
		"functionCallString", "innerMethod", "ifBlock", "whileBlock", "doBlock", 
		"command", "array", "varType", "declaration", "assignment", "expression", 
		"calcDouble", "calcInt", "comparison", "concatenation", "cmd"
	};

	@Override
	public String getGrammarFileName() { return "JC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(56);
					switch (_input.LA(1)) {
					case 22:
						{
						setState(54); method();
						}
						break;
					case 9:
						{
						setState(55); function();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(61); mainMethod();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9 || _la==22) {
				{
				setState(64);
				switch (_input.LA(1)) {
				case 22:
					{
					setState(62); method();
					}
					break;
				case 9:
					{
					setState(63); function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainMethodContext extends ParserRuleContext {
		public Token methodName;
		public InnerMethodContext body;
		public TerminalNode BLOCKOPEN() { return getToken(JCParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(JCParser.BLOCKCLOSE, 0); }
		public InnerMethodContext innerMethod() {
			return getRuleContext(InnerMethodContext.class,0);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(22);
			setState(70); ((MainMethodContext)_localctx).methodName = match(2);
			setState(71); match(BLOCKOPEN);
			setState(72); ((MainMethodContext)_localctx).body = innerMethod();
			setState(73); match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public Token methodName;
		public DeclarationContext declaration;
		public List<DeclarationContext> parameters = new ArrayList<DeclarationContext>();
		public InnerMethodContext body;
		public TerminalNode BLOCKOPEN() { return getToken(JCParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(JCParser.BLOCKCLOSE, 0); }
		public InnerMethodContext innerMethod() {
			return getRuleContext(InnerMethodContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(22);
			setState(76); ((MethodContext)_localctx).methodName = match(IDENTIFIER);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 19) | (1L << 23) | (1L << 25))) != 0)) {
				{
				{
				setState(77); ((MethodContext)_localctx).declaration = declaration();
				((MethodContext)_localctx).parameters.add(((MethodContext)_localctx).declaration);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); match(BLOCKOPEN);
			setState(84); ((MethodContext)_localctx).body = innerMethod();
			setState(85); match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public Token methodName;
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(22);
			setState(88); ((MethodCallContext)_localctx).methodName = match(IDENTIFIER);
			setState(89); match(BRACKETOPEN);
			setState(98);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 12) | (1L << 23) | (1L << 25) | (1L << 27) | (1L << BRACKETOPEN) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(90); ((MethodCallContext)_localctx).expression = expression();
				((MethodCallContext)_localctx).parameters.add(((MethodCallContext)_localctx).expression);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(91); match(14);
					setState(92); ((MethodCallContext)_localctx).expression = expression();
					((MethodCallContext)_localctx).parameters.add(((MethodCallContext)_localctx).expression);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100); match(BRACKETCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionIntContext functionInt() {
			return getRuleContext(FunctionIntContext.class,0);
		}
		public FunctionBoolContext functionBool() {
			return getRuleContext(FunctionBoolContext.class,0);
		}
		public FunctionStringContext functionString() {
			return getRuleContext(FunctionStringContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); functionInt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); functionBool();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); functionString();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIntContext extends ParserRuleContext {
		public Token returnType;
		public Token functionName;
		public DeclarationContext declaration;
		public List<DeclarationContext> parameters = new ArrayList<DeclarationContext>();
		public InnerMethodContext body;
		public CalcIntContext returnValue;
		public TerminalNode BLOCKOPEN() { return getToken(JCParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(JCParser.BLOCKCLOSE, 0); }
		public InnerMethodContext innerMethod() {
			return getRuleContext(InnerMethodContext.class,0);
		}
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public FunctionIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitFunctionInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIntContext functionInt() throws RecognitionException {
		FunctionIntContext _localctx = new FunctionIntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(9);
			setState(108); ((FunctionIntContext)_localctx).returnType = match(23);
			setState(109); ((FunctionIntContext)_localctx).functionName = match(IDENTIFIER);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 19) | (1L << 23) | (1L << 25))) != 0)) {
				{
				{
				setState(110); ((FunctionIntContext)_localctx).declaration = declaration();
				((FunctionIntContext)_localctx).parameters.add(((FunctionIntContext)_localctx).declaration);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116); match(BLOCKOPEN);
			setState(117); ((FunctionIntContext)_localctx).body = innerMethod();
			setState(118); match(3);
			setState(119); ((FunctionIntContext)_localctx).returnValue = calcInt(0);
			setState(120); match(COMMANDEND);
			setState(121); match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBoolContext extends ParserRuleContext {
		public Token returnType;
		public Token functionName;
		public DeclarationContext declaration;
		public List<DeclarationContext> parameters = new ArrayList<DeclarationContext>();
		public InnerMethodContext body;
		public ComparisonContext returnValue;
		public TerminalNode BLOCKOPEN() { return getToken(JCParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(JCParser.BLOCKCLOSE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public InnerMethodContext innerMethod() {
			return getRuleContext(InnerMethodContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public FunctionBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitFunctionBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBoolContext functionBool() throws RecognitionException {
		FunctionBoolContext _localctx = new FunctionBoolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(9);
			setState(124); ((FunctionBoolContext)_localctx).returnType = match(12);
			setState(125); ((FunctionBoolContext)_localctx).functionName = match(IDENTIFIER);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 19) | (1L << 23) | (1L << 25))) != 0)) {
				{
				{
				setState(126); ((FunctionBoolContext)_localctx).declaration = declaration();
				((FunctionBoolContext)_localctx).parameters.add(((FunctionBoolContext)_localctx).declaration);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132); match(BLOCKOPEN);
			setState(133); ((FunctionBoolContext)_localctx).body = innerMethod();
			setState(134); match(3);
			setState(135); ((FunctionBoolContext)_localctx).returnValue = comparison(0);
			setState(136); match(COMMANDEND);
			setState(137); match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStringContext extends ParserRuleContext {
		public Token returnType;
		public Token functionName;
		public DeclarationContext declaration;
		public List<DeclarationContext> parameters = new ArrayList<DeclarationContext>();
		public InnerMethodContext body;
		public ConcatenationContext returnValue;
		public TerminalNode BLOCKOPEN() { return getToken(JCParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(JCParser.BLOCKCLOSE, 0); }
		public InnerMethodContext innerMethod() {
			return getRuleContext(InnerMethodContext.class,0);
		}
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public FunctionStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitFunctionString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStringContext functionString() throws RecognitionException {
		FunctionStringContext _localctx = new FunctionStringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(9);
			setState(140); ((FunctionStringContext)_localctx).returnType = match(25);
			setState(141); ((FunctionStringContext)_localctx).functionName = match(IDENTIFIER);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 19) | (1L << 23) | (1L << 25))) != 0)) {
				{
				{
				setState(142); ((FunctionStringContext)_localctx).declaration = declaration();
				((FunctionStringContext)_localctx).parameters.add(((FunctionStringContext)_localctx).declaration);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148); match(BLOCKOPEN);
			setState(149); ((FunctionStringContext)_localctx).body = innerMethod();
			setState(150); match(3);
			setState(151); ((FunctionStringContext)_localctx).returnValue = concatenation(0);
			setState(152); match(COMMANDEND);
			setState(153); match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallIntContext functionCallInt() {
			return getRuleContext(FunctionCallIntContext.class,0);
		}
		public FunctionCallStringContext functionCallString() {
			return getRuleContext(FunctionCallStringContext.class,0);
		}
		public FunctionCallBoolContext functionCallBool() {
			return getRuleContext(FunctionCallBoolContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); functionCallInt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); functionCallBool();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); functionCallString();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallIntContext extends ParserRuleContext {
		public Token returnType;
		public Token functionName;
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallInt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitFunctionCallInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallIntContext functionCallInt() throws RecognitionException {
		FunctionCallIntContext _localctx = new FunctionCallIntContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCallInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(9);
			setState(161); ((FunctionCallIntContext)_localctx).returnType = match(23);
			setState(162); ((FunctionCallIntContext)_localctx).functionName = match(IDENTIFIER);
			setState(163); match(BRACKETOPEN);
			setState(172);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 12) | (1L << 23) | (1L << 25) | (1L << 27) | (1L << BRACKETOPEN) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(164); ((FunctionCallIntContext)_localctx).expression = expression();
				((FunctionCallIntContext)_localctx).parameters.add(((FunctionCallIntContext)_localctx).expression);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(165); match(14);
					setState(166); ((FunctionCallIntContext)_localctx).expression = expression();
					((FunctionCallIntContext)_localctx).parameters.add(((FunctionCallIntContext)_localctx).expression);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(174); match(BRACKETCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallBoolContext extends ParserRuleContext {
		public Token returnType;
		public Token functionName;
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitFunctionCallBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallBoolContext functionCallBool() throws RecognitionException {
		FunctionCallBoolContext _localctx = new FunctionCallBoolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCallBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(9);
			setState(177); ((FunctionCallBoolContext)_localctx).returnType = match(12);
			setState(178); ((FunctionCallBoolContext)_localctx).functionName = match(IDENTIFIER);
			setState(179); match(BRACKETOPEN);
			setState(188);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 12) | (1L << 23) | (1L << 25) | (1L << 27) | (1L << BRACKETOPEN) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(180); ((FunctionCallBoolContext)_localctx).expression = expression();
				((FunctionCallBoolContext)_localctx).parameters.add(((FunctionCallBoolContext)_localctx).expression);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(181); match(14);
					setState(182); ((FunctionCallBoolContext)_localctx).expression = expression();
					((FunctionCallBoolContext)_localctx).parameters.add(((FunctionCallBoolContext)_localctx).expression);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(190); match(BRACKETCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallStringContext extends ParserRuleContext {
		public Token returnType;
		public Token functionName;
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitFunctionCallString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStringContext functionCallString() throws RecognitionException {
		FunctionCallStringContext _localctx = new FunctionCallStringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCallString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(9);
			setState(193); ((FunctionCallStringContext)_localctx).returnType = match(25);
			setState(194); ((FunctionCallStringContext)_localctx).functionName = match(IDENTIFIER);
			setState(195); match(BRACKETOPEN);
			setState(204);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 12) | (1L << 23) | (1L << 25) | (1L << 27) | (1L << BRACKETOPEN) | (1L << INTEGER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(196); ((FunctionCallStringContext)_localctx).expression = expression();
				((FunctionCallStringContext)_localctx).parameters.add(((FunctionCallStringContext)_localctx).expression);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(197); match(14);
					setState(198); ((FunctionCallStringContext)_localctx).expression = expression();
					((FunctionCallStringContext)_localctx).parameters.add(((FunctionCallStringContext)_localctx).expression);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(206); match(BRACKETCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerMethodContext extends ParserRuleContext {
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public DoBlockContext doBlock(int i) {
			return getRuleContext(DoBlockContext.class,i);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public List<DoBlockContext> doBlock() {
			return getRuleContexts(DoBlockContext.class);
		}
		public TerminalNode COMMANDEND(int i) {
			return getToken(JCParser.COMMANDEND, i);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> COMMANDEND() { return getTokens(JCParser.COMMANDEND); }
		public InnerMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitInnerMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerMethodContext innerMethod() throws RecognitionException {
		InnerMethodContext _localctx = new InnerMethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_innerMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 12) | (1L << 19) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << CMD))) != 0)) {
				{
				setState(214);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(208); ifBlock();
					}
					break;

				case 2:
					{
					setState(209); whileBlock();
					}
					break;

				case 3:
					{
					setState(210); doBlock();
					}
					break;

				case 4:
					{
					setState(211); command();
					setState(212); match(COMMANDEND);
					}
					break;
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public ComparisonContext condition;
		public InnerMethodContext bodyif;
		public InnerMethodContext bodyelse;
		public List<TerminalNode> BLOCKOPEN() { return getTokens(JCParser.BLOCKOPEN); }
		public TerminalNode BLOCKOPEN(int i) {
			return getToken(JCParser.BLOCKOPEN, i);
		}
		public List<TerminalNode> BLOCKCLOSE() { return getTokens(JCParser.BLOCKCLOSE); }
		public TerminalNode ELSE() { return getToken(JCParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(JCParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<InnerMethodContext> innerMethod() {
			return getRuleContexts(InnerMethodContext.class);
		}
		public TerminalNode BLOCKCLOSE(int i) {
			return getToken(JCParser.BLOCKCLOSE, i);
		}
		public InnerMethodContext innerMethod(int i) {
			return getRuleContext(InnerMethodContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(IF);
			setState(220); ((IfBlockContext)_localctx).condition = comparison(0);
			setState(221); match(BLOCKOPEN);
			setState(222); ((IfBlockContext)_localctx).bodyif = innerMethod();
			setState(223); match(BLOCKCLOSE);
			setState(229);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(224); match(ELSE);
				setState(225); match(BLOCKOPEN);
				setState(226); ((IfBlockContext)_localctx).bodyelse = innerMethod();
				setState(227); match(BLOCKCLOSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public ComparisonContext condition;
		public InnerMethodContext body;
		public TerminalNode BLOCKOPEN() { return getToken(JCParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(JCParser.BLOCKCLOSE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public InnerMethodContext innerMethod() {
			return getRuleContext(InnerMethodContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JCParser.WHILE, 0); }
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(WHILE);
			setState(232); ((WhileBlockContext)_localctx).condition = comparison(0);
			setState(233); match(BLOCKOPEN);
			setState(234); ((WhileBlockContext)_localctx).body = innerMethod();
			setState(235); match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoBlockContext extends ParserRuleContext {
		public InnerMethodContext body;
		public ComparisonContext condition;
		public TerminalNode BLOCKOPEN() { return getToken(JCParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(JCParser.BLOCKCLOSE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode DO() { return getToken(JCParser.DO, 0); }
		public InnerMethodContext innerMethod() {
			return getRuleContext(InnerMethodContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JCParser.WHILE, 0); }
		public DoBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitDoBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoBlockContext doBlock() throws RecognitionException {
		DoBlockContext _localctx = new DoBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(DO);
			setState(238); match(BLOCKOPEN);
			setState(239); ((DoBlockContext)_localctx).body = innerMethod();
			setState(240); match(BLOCKCLOSE);
			setState(241); match(WHILE);
			setState(242); ((DoBlockContext)_localctx).condition = comparison(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DoBlockContext doBlock() {
			return getRuleContext(DoBlockContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_command);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); assignment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246); doBlock();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247); cmd();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248); methodCall();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(249); functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public VarTypeContext type;
		public Token varName;
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); ((ArrayContext)_localctx).type = varType();
			setState(253); ((ArrayContext)_localctx).varName = match(IDENTIFIER);
			setState(254); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 19) | (1L << 23) | (1L << 25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VarTypeContext type;
		public Token varName;
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); ((DeclarationContext)_localctx).type = varType();
			setState(259); ((DeclarationContext)_localctx).varName = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentBoolContext extends AssignmentContext {
		public DeclarationContext decl;
		public ComparisonContext comp;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentBoolContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitAssignmentBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentDoubleContext extends AssignmentContext {
		public DeclarationContext decl;
		public CalcDoubleContext calc;
		public CalcDoubleContext calcDouble() {
			return getRuleContext(CalcDoubleContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentDoubleContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitAssignmentDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentStringContext extends AssignmentContext {
		public DeclarationContext decl;
		public ConcatenationContext conc;
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentStringContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitAssignmentString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentIntContext extends AssignmentContext {
		public DeclarationContext decl;
		public CalcIntContext calc;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public AssignmentIntContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitAssignmentInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AssignmentIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261); ((AssignmentIntContext)_localctx).decl = declaration();
				setState(262); match(7);
				setState(263); ((AssignmentIntContext)_localctx).calc = calcInt(0);
				}
				break;

			case 2:
				_localctx = new AssignmentDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265); ((AssignmentDoubleContext)_localctx).decl = declaration();
				setState(266); match(7);
				setState(267); ((AssignmentDoubleContext)_localctx).calc = calcDouble(0);
				}
				break;

			case 3:
				_localctx = new AssignmentBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(269); ((AssignmentBoolContext)_localctx).decl = declaration();
				setState(270); match(7);
				setState(271); ((AssignmentBoolContext)_localctx).comp = comparison(0);
				}
				break;

			case 4:
				_localctx = new AssignmentStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(273); ((AssignmentStringContext)_localctx).decl = declaration();
				setState(274); match(7);
				setState(275); ((AssignmentStringContext)_localctx).conc = concatenation(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); calcInt(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); comparison(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281); concatenation(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcDoubleContext extends ParserRuleContext {
		public CalcDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcDouble; }
	 
		public CalcDoubleContext() { }
		public void copyFrom(CalcDoubleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntToDoubleContext extends CalcDoubleContext {
		public CalcIntContext from;
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public IntToDoubleContext(CalcDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIntToDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringToDoubleContext extends CalcDoubleContext {
		public ConcatenationContext from;
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public StringToDoubleContext(CalcDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitStringToDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolToDoubleContext extends CalcDoubleContext {
		public ComparisonContext from;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public BoolToDoubleContext(CalcDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitBoolToDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends CalcDoubleContext {
		public CalcDoubleContext left;
		public CalcDoubleContext right;
		public List<CalcDoubleContext> calcDouble() {
			return getRuleContexts(CalcDoubleContext.class);
		}
		public CalcDoubleContext calcDouble(int i) {
			return getRuleContext(CalcDoubleContext.class,i);
		}
		public PowContext(CalcDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDoubleContext extends CalcDoubleContext {
		public Token type;
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public VariableDoubleContext(CalcDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitVariableDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends CalcDoubleContext {
		public Token dbl;
		public TerminalNode DOUBLE() { return getToken(JCParser.DOUBLE, 0); }
		public DoubleContext(CalcDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcDoubleContext calcDouble() throws RecognitionException {
		return calcDouble(0);
	}

	private CalcDoubleContext calcDouble(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalcDoubleContext _localctx = new CalcDoubleContext(_ctx, _parentState);
		CalcDoubleContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_calcDouble, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(285); ((DoubleContext)_localctx).dbl = match(DOUBLE);
				}
				break;

			case 2:
				{
				_localctx = new VariableDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286); ((VariableDoubleContext)_localctx).type = match(19);
				setState(287); ((VariableDoubleContext)_localctx).varName = match(IDENTIFIER);
				}
				break;

			case 3:
				{
				_localctx = new IntToDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288); match(19);
				setState(289); match(21);
				setState(290); ((IntToDoubleContext)_localctx).from = calcInt(0);
				}
				break;

			case 4:
				{
				_localctx = new BoolToDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291); match(19);
				setState(292); match(21);
				setState(293); ((BoolToDoubleContext)_localctx).from = comparison(0);
				}
				break;

			case 5:
				{
				_localctx = new StringToDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294); match(19);
				setState(295); match(21);
				setState(296); ((StringToDoubleContext)_localctx).from = concatenation(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowContext(new CalcDoubleContext(_parentctx, _parentState));
					((PowContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_calcDouble);
					setState(299);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(300); match(8);
					setState(301); ((PowContext)_localctx).right = calcDouble(5);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CalcIntContext extends ParserRuleContext {
		public CalcIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcInt; }
	 
		public CalcIntContext() { }
		public void copyFrom(CalcIntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends CalcIntContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public AddContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends CalcIntContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public SubContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends CalcIntContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public ModContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationContext extends CalcIntContext {
		public CalcIntContext calc;
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public NegationContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableIntContext extends CalcIntContext {
		public Token type;
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public VariableIntContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitVariableInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringToIntContext extends CalcIntContext {
		public ConcatenationContext from;
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public StringToIntContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitStringToInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsCalcContext extends CalcIntContext {
		public TerminalNode BRACKETOPEN() { return getToken(JCParser.BRACKETOPEN, 0); }
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public TerminalNode BRACKETCLOSE() { return getToken(JCParser.BRACKETCLOSE, 0); }
		public BracketsCalcContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitBracketsCalc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends CalcIntContext {
		public Token integer;
		public TerminalNode INTEGER() { return getToken(JCParser.INTEGER, 0); }
		public IntegerContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends CalcIntContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public DivContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolToIntContext extends CalcIntContext {
		public ComparisonContext from;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public BoolToIntContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitBoolToInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends CalcIntContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public MultContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleToIntContext extends CalcIntContext {
		public CalcDoubleContext from;
		public CalcDoubleContext calcDouble() {
			return getRuleContext(CalcDoubleContext.class,0);
		}
		public DoubleToIntContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitDoubleToInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalcIntFunctionContext extends CalcIntContext {
		public FunctionCallIntContext functionCallInt() {
			return getRuleContext(FunctionCallIntContext.class,0);
		}
		public CalcIntFunctionContext(CalcIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitCalcIntFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcIntContext calcInt() throws RecognitionException {
		return calcInt(0);
	}

	private CalcIntContext calcInt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalcIntContext _localctx = new CalcIntContext(_ctx, _parentState);
		CalcIntContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_calcInt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(308); match(27);
				setState(309); ((NegationContext)_localctx).calc = calcInt(11);
				}
				break;

			case 2:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310); ((IntegerContext)_localctx).integer = match(INTEGER);
				}
				break;

			case 3:
				{
				_localctx = new VariableIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311); ((VariableIntContext)_localctx).type = match(23);
				setState(312); ((VariableIntContext)_localctx).varName = match(IDENTIFIER);
				}
				break;

			case 4:
				{
				_localctx = new BracketsCalcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313); match(BRACKETOPEN);
				setState(314); calcInt(0);
				setState(315); match(BRACKETCLOSE);
				}
				break;

			case 5:
				{
				_localctx = new DoubleToIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317); match(23);
				setState(318); match(21);
				setState(319); ((DoubleToIntContext)_localctx).from = calcDouble(0);
				}
				break;

			case 6:
				{
				_localctx = new BoolToIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320); match(23);
				setState(321); match(21);
				setState(322); ((BoolToIntContext)_localctx).from = comparison(0);
				}
				break;

			case 7:
				{
				_localctx = new StringToIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323); match(23);
				setState(324); match(21);
				setState(325); ((StringToIntContext)_localctx).from = concatenation(0);
				}
				break;

			case 8:
				{
				_localctx = new CalcIntFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326); functionCallInt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(344);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new CalcIntContext(_parentctx, _parentState));
						((MultContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calcInt);
						setState(329);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(330); match(13);
						setState(331); ((MultContext)_localctx).right = calcInt(10);
						}
						break;

					case 2:
						{
						_localctx = new DivContext(new CalcIntContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calcInt);
						setState(332);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(333); match(1);
						setState(334); ((DivContext)_localctx).right = calcInt(9);
						}
						break;

					case 3:
						{
						_localctx = new ModContext(new CalcIntContext(_parentctx, _parentState));
						((ModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calcInt);
						setState(335);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(336); match(24);
						setState(337); ((ModContext)_localctx).right = calcInt(8);
						}
						break;

					case 4:
						{
						_localctx = new AddContext(new CalcIntContext(_parentctx, _parentState));
						((AddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calcInt);
						setState(338);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(339); match(26);
						setState(340); ((AddContext)_localctx).right = calcInt(7);
						}
						break;

					case 5:
						{
						_localctx = new SubContext(new CalcIntContext(_parentctx, _parentState));
						((SubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_calcInt);
						setState(341);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(342); match(27);
						setState(343); ((SubContext)_localctx).right = calcInt(6);
						}
						break;
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringToBoolContext extends ComparisonContext {
		public ConcatenationContext from;
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public StringToBoolContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitStringToBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ComparisonContext {
		public ComparisonContext left;
		public ComparisonContext right;
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public OrContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LighterThanContext extends ComparisonContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public LighterThanContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitLighterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNotStrContext extends ComparisonContext {
		public ConcatenationContext left;
		public ConcatenationContext right;
		public ConcatenationContext concatenation(int i) {
			return getRuleContext(ConcatenationContext.class,i);
		}
		public List<ConcatenationContext> concatenation() {
			return getRuleContexts(ConcatenationContext.class);
		}
		public IsNotStrContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIsNotStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LighterOrEqualsContext extends ComparisonContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public LighterOrEqualsContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitLighterOrEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNotIntContext extends ComparisonContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public IsNotIntContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIsNotInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFunctionContext extends ComparisonContext {
		public FunctionCallBoolContext functionCallBool() {
			return getRuleContext(FunctionCallBoolContext.class,0);
		}
		public BoolFunctionContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitBoolFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsContext extends ComparisonContext {
		public ComparisonContext left;
		public ComparisonContext right;
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public IsContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableBoolContext extends ComparisonContext {
		public Token type;
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public VariableBoolContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitVariableBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvertationContext extends ComparisonContext {
		public ComparisonContext comp;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public InvertationContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitInvertation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsCompContext extends ComparisonContext {
		public TerminalNode BRACKETOPEN() { return getToken(JCParser.BRACKETOPEN, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BRACKETCLOSE() { return getToken(JCParser.BRACKETCLOSE, 0); }
		public BracketsCompContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitBracketsComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNotContext extends ComparisonContext {
		public ComparisonContext left;
		public ComparisonContext right;
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public IsNotContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIsNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ComparisonContext {
		public Token value;
		public TerminalNode BOOL() { return getToken(JCParser.BOOL, 0); }
		public BoolContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ComparisonContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public GreaterThanContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ComparisonContext {
		public ComparisonContext left;
		public ComparisonContext right;
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public AndContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterOrEqualsContext extends ComparisonContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public GreaterOrEqualsContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitGreaterOrEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsStrContext extends ComparisonContext {
		public ConcatenationContext left;
		public ConcatenationContext right;
		public ConcatenationContext concatenation(int i) {
			return getRuleContext(ConcatenationContext.class,i);
		}
		public List<ConcatenationContext> concatenation() {
			return getRuleContexts(ConcatenationContext.class);
		}
		public IsStrContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIsStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntToBoolContext extends ComparisonContext {
		public CalcIntContext from;
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public IntToBoolContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIntToBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsIntContext extends ComparisonContext {
		public CalcIntContext left;
		public CalcIntContext right;
		public List<CalcIntContext> calcInt() {
			return getRuleContexts(CalcIntContext.class);
		}
		public CalcIntContext calcInt(int i) {
			return getRuleContext(CalcIntContext.class,i);
		}
		public IsIntContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIsInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		return comparison(0);
	}

	private ComparisonContext comparison(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonContext _localctx = new ComparisonContext(_ctx, _parentState);
		ComparisonContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_comparison, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(350); ((BoolContext)_localctx).value = match(BOOL);
				}
				break;

			case 2:
				{
				_localctx = new VariableBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351); ((VariableBoolContext)_localctx).type = match(12);
				setState(352); ((VariableBoolContext)_localctx).varName = match(IDENTIFIER);
				}
				break;

			case 3:
				{
				_localctx = new BracketsCompContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353); match(BRACKETOPEN);
				setState(354); comparison(0);
				setState(355); match(BRACKETCLOSE);
				}
				break;

			case 4:
				{
				_localctx = new LighterThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357); ((LighterThanContext)_localctx).left = calcInt(0);
				setState(358); match(17);
				setState(359); ((LighterThanContext)_localctx).right = calcInt(0);
				}
				break;

			case 5:
				{
				_localctx = new GreaterThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361); ((GreaterThanContext)_localctx).left = calcInt(0);
				setState(362); match(20);
				setState(363); ((GreaterThanContext)_localctx).right = calcInt(0);
				}
				break;

			case 6:
				{
				_localctx = new LighterOrEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365); ((LighterOrEqualsContext)_localctx).left = calcInt(0);
				setState(366); match(10);
				setState(367); ((LighterOrEqualsContext)_localctx).right = calcInt(0);
				}
				break;

			case 7:
				{
				_localctx = new GreaterOrEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(369); ((GreaterOrEqualsContext)_localctx).left = calcInt(0);
				setState(370); match(16);
				setState(371); ((GreaterOrEqualsContext)_localctx).right = calcInt(0);
				}
				break;

			case 8:
				{
				_localctx = new IsIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(373); ((IsIntContext)_localctx).left = calcInt(0);
				setState(374); match(18);
				setState(375); ((IsIntContext)_localctx).right = calcInt(0);
				}
				break;

			case 9:
				{
				_localctx = new IsNotIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(377); ((IsNotIntContext)_localctx).left = calcInt(0);
				setState(378); match(4);
				setState(379); ((IsNotIntContext)_localctx).right = calcInt(0);
				}
				break;

			case 10:
				{
				_localctx = new IsStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(381); ((IsStrContext)_localctx).left = concatenation(0);
				setState(382); match(18);
				setState(383); ((IsStrContext)_localctx).right = concatenation(0);
				}
				break;

			case 11:
				{
				_localctx = new IsNotStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385); ((IsNotStrContext)_localctx).left = concatenation(0);
				setState(386); match(4);
				setState(387); ((IsNotStrContext)_localctx).right = concatenation(0);
				}
				break;

			case 12:
				{
				_localctx = new IntToBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389); match(12);
				setState(390); match(21);
				setState(391); ((IntToBoolContext)_localctx).from = calcInt(0);
				}
				break;

			case 13:
				{
				_localctx = new StringToBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(392); match(12);
				setState(393); match(21);
				setState(394); ((StringToBoolContext)_localctx).from = concatenation(0);
				}
				break;

			case 14:
				{
				_localctx = new BoolFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(395); functionCallBool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(412);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new IsContext(new ComparisonContext(_parentctx, _parentState));
						((IsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_comparison);
						setState(398);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(399); match(18);
						setState(400); ((IsContext)_localctx).right = comparison(16);
						}
						break;

					case 2:
						{
						_localctx = new IsNotContext(new ComparisonContext(_parentctx, _parentState));
						((IsNotContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_comparison);
						setState(401);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(402); match(4);
						setState(403); ((IsNotContext)_localctx).right = comparison(15);
						}
						break;

					case 3:
						{
						_localctx = new AndContext(new ComparisonContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_comparison);
						setState(404);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(405); match(6);
						setState(406); ((AndContext)_localctx).right = comparison(14);
						}
						break;

					case 4:
						{
						_localctx = new OrContext(new ComparisonContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_comparison);
						setState(407);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(408); match(5);
						setState(409); ((OrContext)_localctx).right = comparison(13);
						}
						break;

					case 5:
						{
						_localctx = new InvertationContext(new ComparisonContext(_parentctx, _parentState));
						((InvertationContext)_localctx).comp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_comparison);
						setState(410);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(411); match(22);
						}
						break;
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConcatenationContext extends ParserRuleContext {
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
	 
		public ConcatenationContext() { }
		public void copyFrom(ConcatenationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcatContext extends ConcatenationContext {
		public ConcatenationContext left;
		public ConcatenationContext right;
		public ConcatenationContext concatenation(int i) {
			return getRuleContext(ConcatenationContext.class,i);
		}
		public List<ConcatenationContext> concatenation() {
			return getRuleContexts(ConcatenationContext.class);
		}
		public ConcatContext(ConcatenationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntToStringContext extends ConcatenationContext {
		public CalcIntContext from;
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public IntToStringContext(ConcatenationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitIntToString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFunctionContext extends ConcatenationContext {
		public FunctionCallStringContext functionCallString() {
			return getRuleContext(FunctionCallStringContext.class,0);
		}
		public StringFunctionContext(ConcatenationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitStringFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableStringContext extends ConcatenationContext {
		public Token type;
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public VariableStringContext(ConcatenationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitVariableString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ConcatenationContext {
		public Token string;
		public TerminalNode STRING() { return getToken(JCParser.STRING, 0); }
		public StringContext(ConcatenationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolToStringContext extends ConcatenationContext {
		public ComparisonContext from;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public BoolToStringContext(ConcatenationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitBoolToString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		return concatenation(0);
	}

	private ConcatenationContext concatenation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, _parentState);
		ConcatenationContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_concatenation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(418); ((StringContext)_localctx).string = match(STRING);
				}
				break;

			case 2:
				{
				_localctx = new VariableStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(419); ((VariableStringContext)_localctx).type = match(25);
				setState(420); ((VariableStringContext)_localctx).varName = match(IDENTIFIER);
				}
				break;

			case 3:
				{
				_localctx = new IntToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(421); match(25);
				setState(422); match(21);
				setState(423); ((IntToStringContext)_localctx).from = calcInt(0);
				}
				break;

			case 4:
				{
				_localctx = new BoolToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424); match(25);
				setState(425); match(21);
				setState(426); ((BoolToStringContext)_localctx).from = comparison(0);
				}
				break;

			case 5:
				{
				_localctx = new StringFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(427); functionCallString();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(new ConcatenationContext(_parentctx, _parentState));
					((ConcatContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_concatenation);
					setState(430);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(431); match(15);
					setState(432); ((ConcatContext)_localctx).right = concatenation(7);
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OutputIntContext extends CmdContext {
		public CalcIntContext value;
		public TerminalNode CMD() { return getToken(JCParser.CMD, 0); }
		public CalcIntContext calcInt() {
			return getRuleContext(CalcIntContext.class,0);
		}
		public OutputIntContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitOutputInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputContext extends CmdContext {
		public Token varName;
		public TerminalNode CMD() { return getToken(JCParser.CMD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JCParser.IDENTIFIER, 0); }
		public InputContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputStringContext extends CmdContext {
		public ConcatenationContext value;
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public TerminalNode CMD() { return getToken(JCParser.CMD, 0); }
		public OutputStringContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitOutputString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputBoolContext extends CmdContext {
		public ComparisonContext value;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode CMD() { return getToken(JCParser.CMD, 0); }
		public OutputBoolContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitOutputBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputDoubleContext extends CmdContext {
		public CalcDoubleContext value;
		public CalcDoubleContext calcDouble() {
			return getRuleContext(CalcDoubleContext.class,0);
		}
		public TerminalNode CMD() { return getToken(JCParser.CMD, 0); }
		public OutputDoubleContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JCVisitor ) return ((JCVisitor<? extends T>)visitor).visitOutputDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new OutputIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(438); match(CMD);
				setState(439); match(17);
				setState(440); ((OutputIntContext)_localctx).value = calcInt(0);
				}
				break;

			case 2:
				_localctx = new OutputBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(441); match(CMD);
				setState(442); match(17);
				setState(443); ((OutputBoolContext)_localctx).value = comparison(0);
				}
				break;

			case 3:
				_localctx = new OutputStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(444); match(CMD);
				setState(445); match(17);
				setState(446); ((OutputStringContext)_localctx).value = concatenation(0);
				}
				break;

			case 4:
				_localctx = new OutputDoubleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(447); match(CMD);
				setState(448); match(17);
				setState(449); ((OutputDoubleContext)_localctx).value = calcDouble(0);
				}
				break;

			case 5:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(450); match(CMD);
				setState(451); match(20);
				setState(452); match(25);
				setState(453); ((InputContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22: return calcDouble_sempred((CalcDoubleContext)_localctx, predIndex);

		case 23: return calcInt_sempred((CalcIntContext)_localctx, predIndex);

		case 24: return comparison_sempred((ComparisonContext)_localctx, predIndex);

		case 25: return concatenation_sempred((ConcatenationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean comparison_sempred(ComparisonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 15);

		case 7: return precpred(_ctx, 14);

		case 8: return precpred(_ctx, 13);

		case 9: return precpred(_ctx, 12);

		case 10: return precpred(_ctx, 19);
		}
		return true;
	}
	private boolean concatenation_sempred(ConcatenationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean calcInt_sempred(CalcIntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 9);

		case 2: return precpred(_ctx, 8);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean calcDouble_sempred(CalcDoubleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u01cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4Q"+
		"\n\4\f\4\16\4T\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f"+
		"\5\16\5c\13\5\5\5e\n\5\3\5\3\5\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\7"+
		"\7r\n\7\f\7\16\7u\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b"+
		"\u0082\n\b\f\b\16\b\u0085\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\5\n\u00a1\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00aa\n"+
		"\13\f\13\16\13\u00ad\13\13\5\13\u00af\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00ba\n\f\f\f\16\f\u00bd\13\f\5\f\u00bf\n\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r\5\r\u00cf\n"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d9\n\16\f\16\16\16\u00dc"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fd\n\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0118\n\26\3\27\3\27\3\27\5\27\u011d"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u012c\n\30\3\30\3\30\3\30\7\30\u0131\n\30\f\30\16\30\u0134\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014a\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u015b\n\31\f\31"+
		"\16\31\u015e\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u018f\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u019f"+
		"\n\32\f\32\16\32\u01a2\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u01af\n\33\3\33\3\33\3\33\7\33\u01b4\n\33\f\33\16\33"+
		"\u01b7\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u01c9\n\34\3\34\2\6.\60\62\64\35\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\6\2\16\16\25"+
		"\25\31\31\33\33\u01fe\2<\3\2\2\2\4G\3\2\2\2\6M\3\2\2\2\bY\3\2\2\2\nk\3"+
		"\2\2\2\fm\3\2\2\2\16}\3\2\2\2\20\u008d\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2"+
		"\3\2\2\2\26\u00b2\3\2\2\2\30\u00c2\3\2\2\2\32\u00da\3\2\2\2\34\u00dd\3"+
		"\2\2\2\36\u00e9\3\2\2\2 \u00ef\3\2\2\2\"\u00fc\3\2\2\2$\u00fe\3\2\2\2"+
		"&\u0102\3\2\2\2(\u0104\3\2\2\2*\u0117\3\2\2\2,\u011c\3\2\2\2.\u012b\3"+
		"\2\2\2\60\u0149\3\2\2\2\62\u018e\3\2\2\2\64\u01ae\3\2\2\2\66\u01c8\3\2"+
		"\2\28;\5\6\4\29;\5\n\6\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=?\3\2\2\2><\3\2\2\2?D\5\4\3\2@C\5\6\4\2AC\5\n\6\2B@\3\2\2\2BA\3\2"+
		"\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2\2FD\3\2\2\2GH\7\30\2\2HI\7"+
		"\4\2\2IJ\7#\2\2JK\5\32\16\2KL\7$\2\2L\5\3\2\2\2MN\7\30\2\2NR\7\60\2\2"+
		"OQ\5(\25\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2"+
		"UV\7#\2\2VW\5\32\16\2WX\7$\2\2X\7\3\2\2\2YZ\7\30\2\2Z[\7\60\2\2[d\7%\2"+
		"\2\\a\5,\27\2]^\7\20\2\2^`\5,\27\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2be\3\2\2\2ca\3\2\2\2d\\\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7&\2\2g\t\3"+
		"\2\2\2hl\5\f\7\2il\5\16\b\2jl\5\20\t\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l"+
		"\13\3\2\2\2mn\7\13\2\2no\7\31\2\2os\7\60\2\2pr\5(\25\2qp\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7#\2\2wx\5\32\16\2xy\7"+
		"\5\2\2yz\5\60\31\2z{\7\'\2\2{|\7$\2\2|\r\3\2\2\2}~\7\13\2\2~\177\7\16"+
		"\2\2\177\u0083\7\60\2\2\u0080\u0082\5(\25\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7#\2\2\u0087\u0088\5\32\16\2\u0088"+
		"\u0089\7\5\2\2\u0089\u008a\5\62\32\2\u008a\u008b\7\'\2\2\u008b\u008c\7"+
		"$\2\2\u008c\17\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7\33\2\2\u008f"+
		"\u0093\7\60\2\2\u0090\u0092\5(\25\2\u0091\u0090\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7#\2\2\u0097\u0098\5\32\16\2\u0098\u0099\7"+
		"\5\2\2\u0099\u009a\5\64\33\2\u009a\u009b\7\'\2\2\u009b\u009c\7$\2\2\u009c"+
		"\21\3\2\2\2\u009d\u00a1\5\24\13\2\u009e\u00a1\5\26\f\2\u009f\u00a1\5\30"+
		"\r\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\23\3\2\2\2\u00a2\u00a3\7\13\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\7\60"+
		"\2\2\u00a5\u00ae\7%\2\2\u00a6\u00ab\5,\27\2\u00a7\u00a8\7\20\2\2\u00a8"+
		"\u00aa\5,\27\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00a6\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7&"+
		"\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\7\16\2\2\u00b4"+
		"\u00b5\7\60\2\2\u00b5\u00be\7%\2\2\u00b6\u00bb\5,\27\2\u00b7\u00b8\7\20"+
		"\2\2\u00b8\u00ba\5,\27\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00b6\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\7&\2\2\u00c1\27\3\2\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\7\33\2"+
		"\2\u00c4\u00c5\7\60\2\2\u00c5\u00ce\7%\2\2\u00c6\u00cb\5,\27\2\u00c7\u00c8"+
		"\7\20\2\2\u00c8\u00ca\5,\27\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\7&\2\2\u00d1\31\3\2\2\2\u00d2\u00d9\5\34\17\2\u00d3\u00d9\5\36"+
		"\20\2\u00d4\u00d9\5 \21\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\7\'\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2"+
		"\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\33\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\36\2"+
		"\2\u00de\u00df\5\62\32\2\u00df\u00e0\7#\2\2\u00e0\u00e1\5\32\16\2\u00e1"+
		"\u00e7\7$\2\2\u00e2\u00e3\7\37\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\5\32"+
		"\16\2\u00e5\u00e6\7$\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00ea\7!\2\2\u00ea\u00eb\5\62\32"+
		"\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\5\32\16\2\u00ed\u00ee\7$\2\2\u00ee\37"+
		"\3\2\2\2\u00ef\u00f0\7 \2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\5\32\16\2\u00f2"+
		"\u00f3\7$\2\2\u00f3\u00f4\7!\2\2\u00f4\u00f5\5\62\32\2\u00f5!\3\2\2\2"+
		"\u00f6\u00fd\5(\25\2\u00f7\u00fd\5*\26\2\u00f8\u00fd\5 \21\2\u00f9\u00fd"+
		"\5\66\34\2\u00fa\u00fd\5\b\5\2\u00fb\u00fd\5\22\n\2\u00fc\u00f6\3\2\2"+
		"\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd#\3\2\2\2\u00fe\u00ff\5&\24\2\u00ff"+
		"\u0100\7\60\2\2\u0100\u0101\7\r\2\2\u0101%\3\2\2\2\u0102\u0103\t\2\2\2"+
		"\u0103\'\3\2\2\2\u0104\u0105\5&\24\2\u0105\u0106\7\60\2\2\u0106)\3\2\2"+
		"\2\u0107\u0108\5(\25\2\u0108\u0109\7\t\2\2\u0109\u010a\5\60\31\2\u010a"+
		"\u0118\3\2\2\2\u010b\u010c\5(\25\2\u010c\u010d\7\t\2\2\u010d\u010e\5."+
		"\30\2\u010e\u0118\3\2\2\2\u010f\u0110\5(\25\2\u0110\u0111\7\t\2\2\u0111"+
		"\u0112\5\62\32\2\u0112\u0118\3\2\2\2\u0113\u0114\5(\25\2\u0114\u0115\7"+
		"\t\2\2\u0115\u0116\5\64\33\2\u0116\u0118\3\2\2\2\u0117\u0107\3\2\2\2\u0117"+
		"\u010b\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0113\3\2\2\2\u0118+\3\2\2\2"+
		"\u0119\u011d\5\60\31\2\u011a\u011d\5\62\32\2\u011b\u011d\5\64\33\2\u011c"+
		"\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d-\3\2\2\2"+
		"\u011e\u011f\b\30\1\2\u011f\u012c\7)\2\2\u0120\u0121\7\25\2\2\u0121\u012c"+
		"\7\60\2\2\u0122\u0123\7\25\2\2\u0123\u0124\7\27\2\2\u0124\u012c\5\60\31"+
		"\2\u0125\u0126\7\25\2\2\u0126\u0127\7\27\2\2\u0127\u012c\5\62\32\2\u0128"+
		"\u0129\7\25\2\2\u0129\u012a\7\27\2\2\u012a\u012c\5\64\33\2\u012b\u011e"+
		"\3\2\2\2\u012b\u0120\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0125\3\2\2\2\u012b"+
		"\u0128\3\2\2\2\u012c\u0132\3\2\2\2\u012d\u012e\f\6\2\2\u012e\u012f\7\n"+
		"\2\2\u012f\u0131\5.\30\7\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133/\3\2\2\2\u0134\u0132\3\2\2\2"+
		"\u0135\u0136\b\31\1\2\u0136\u0137\7\35\2\2\u0137\u014a\5\60\31\r\u0138"+
		"\u014a\7(\2\2\u0139\u013a\7\31\2\2\u013a\u014a\7\60\2\2\u013b\u013c\7"+
		"%\2\2\u013c\u013d\5\60\31\2\u013d\u013e\7&\2\2\u013e\u014a\3\2\2\2\u013f"+
		"\u0140\7\31\2\2\u0140\u0141\7\27\2\2\u0141\u014a\5.\30\2\u0142\u0143\7"+
		"\31\2\2\u0143\u0144\7\27\2\2\u0144\u014a\5\62\32\2\u0145\u0146\7\31\2"+
		"\2\u0146\u0147\7\27\2\2\u0147\u014a\5\64\33\2\u0148\u014a\5\24\13\2\u0149"+
		"\u0135\3\2\2\2\u0149\u0138\3\2\2\2\u0149\u0139\3\2\2\2\u0149\u013b\3\2"+
		"\2\2\u0149\u013f\3\2\2\2\u0149\u0142\3\2\2\2\u0149\u0145\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u015c\3\2\2\2\u014b\u014c\f\13\2\2\u014c\u014d\7"+
		"\17\2\2\u014d\u015b\5\60\31\f\u014e\u014f\f\n\2\2\u014f\u0150\7\3\2\2"+
		"\u0150\u015b\5\60\31\13\u0151\u0152\f\t\2\2\u0152\u0153\7\32\2\2\u0153"+
		"\u015b\5\60\31\n\u0154\u0155\f\b\2\2\u0155\u0156\7\34\2\2\u0156\u015b"+
		"\5\60\31\t\u0157\u0158\f\7\2\2\u0158\u0159\7\35\2\2\u0159\u015b\5\60\31"+
		"\b\u015a\u014b\3\2\2\2\u015a\u014e\3\2\2\2\u015a\u0151\3\2\2\2\u015a\u0154"+
		"\3\2\2\2\u015a\u0157\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\61\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\b\32\1"+
		"\2\u0160\u018f\7*\2\2\u0161\u0162\7\16\2\2\u0162\u018f\7\60\2\2\u0163"+
		"\u0164\7%\2\2\u0164\u0165\5\62\32\2\u0165\u0166\7&\2\2\u0166\u018f\3\2"+
		"\2\2\u0167\u0168\5\60\31\2\u0168\u0169\7\23\2\2\u0169\u016a\5\60\31\2"+
		"\u016a\u018f\3\2\2\2\u016b\u016c\5\60\31\2\u016c\u016d\7\26\2\2\u016d"+
		"\u016e\5\60\31\2\u016e\u018f\3\2\2\2\u016f\u0170\5\60\31\2\u0170\u0171"+
		"\7\f\2\2\u0171\u0172\5\60\31\2\u0172\u018f\3\2\2\2\u0173\u0174\5\60\31"+
		"\2\u0174\u0175\7\22\2\2\u0175\u0176\5\60\31\2\u0176\u018f\3\2\2\2\u0177"+
		"\u0178\5\60\31\2\u0178\u0179\7\24\2\2\u0179\u017a\5\60\31\2\u017a\u018f"+
		"\3\2\2\2\u017b\u017c\5\60\31\2\u017c\u017d\7\6\2\2\u017d\u017e\5\60\31"+
		"\2\u017e\u018f\3\2\2\2\u017f\u0180\5\64\33\2\u0180\u0181\7\24\2\2\u0181"+
		"\u0182\5\64\33\2\u0182\u018f\3\2\2\2\u0183\u0184\5\64\33\2\u0184\u0185"+
		"\7\6\2\2\u0185\u0186\5\64\33\2\u0186\u018f\3\2\2\2\u0187\u0188\7\16\2"+
		"\2\u0188\u0189\7\27\2\2\u0189\u018f\5\60\31\2\u018a\u018b\7\16\2\2\u018b"+
		"\u018c\7\27\2\2\u018c\u018f\5\64\33\2\u018d\u018f\5\26\f\2\u018e\u015f"+
		"\3\2\2\2\u018e\u0161\3\2\2\2\u018e\u0163\3\2\2\2\u018e\u0167\3\2\2\2\u018e"+
		"\u016b\3\2\2\2\u018e\u016f\3\2\2\2\u018e\u0173\3\2\2\2\u018e\u0177\3\2"+
		"\2\2\u018e\u017b\3\2\2\2\u018e\u017f\3\2\2\2\u018e\u0183\3\2\2\2\u018e"+
		"\u0187\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u01a0\3\2"+
		"\2\2\u0190\u0191\f\21\2\2\u0191\u0192\7\24\2\2\u0192\u019f\5\62\32\22"+
		"\u0193\u0194\f\20\2\2\u0194\u0195\7\6\2\2\u0195\u019f\5\62\32\21\u0196"+
		"\u0197\f\17\2\2\u0197\u0198\7\b\2\2\u0198\u019f\5\62\32\20\u0199\u019a"+
		"\f\16\2\2\u019a\u019b\7\7\2\2\u019b\u019f\5\62\32\17\u019c\u019d\f\25"+
		"\2\2\u019d\u019f\7\30\2\2\u019e\u0190\3\2\2\2\u019e\u0193\3\2\2\2\u019e"+
		"\u0196\3\2\2\2\u019e\u0199\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\63\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a3\u01a4\b\33\1\2\u01a4\u01af\7+\2\2\u01a5\u01a6\7\33\2\2"+
		"\u01a6\u01af\7\60\2\2\u01a7\u01a8\7\33\2\2\u01a8\u01a9\7\27\2\2\u01a9"+
		"\u01af\5\60\31\2\u01aa\u01ab\7\33\2\2\u01ab\u01ac\7\27\2\2\u01ac\u01af"+
		"\5\62\32\2\u01ad\u01af\5\30\r\2\u01ae\u01a3\3\2\2\2\u01ae\u01a5\3\2\2"+
		"\2\u01ae\u01a7\3\2\2\2\u01ae\u01aa\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b5"+
		"\3\2\2\2\u01b0\u01b1\f\b\2\2\u01b1\u01b2\7\21\2\2\u01b2\u01b4\5\64\33"+
		"\t\u01b3\u01b0\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\65\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7\"\2\2\u01b9"+
		"\u01ba\7\23\2\2\u01ba\u01c9\5\60\31\2\u01bb\u01bc\7\"\2\2\u01bc\u01bd"+
		"\7\23\2\2\u01bd\u01c9\5\62\32\2\u01be\u01bf\7\"\2\2\u01bf\u01c0\7\23\2"+
		"\2\u01c0\u01c9\5\64\33\2\u01c1\u01c2\7\"\2\2\u01c2\u01c3\7\23\2\2\u01c3"+
		"\u01c9\5.\30\2\u01c4\u01c5\7\"\2\2\u01c5\u01c6\7\26\2\2\u01c6\u01c7\7"+
		"\33\2\2\u01c7\u01c9\7\60\2\2\u01c8\u01b8\3\2\2\2\u01c8\u01bb\3\2\2\2\u01c8"+
		"\u01be\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c9\67\3\2\2"+
		"\2%:<BDRadks\u0083\u0093\u00a0\u00ab\u00ae\u00bb\u00be\u00cb\u00ce\u00d8"+
		"\u00da\u00e7\u00fc\u0117\u011c\u012b\u0132\u0149\u015a\u015c\u018e\u019e"+
		"\u01a0\u01ae\u01b5\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}