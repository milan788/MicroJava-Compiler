package rs.ac.bg.etf.pp1;

import java_cup.runtime.Symbol;

%%

%{

	// ukljucivanje informacije o poziciji tokena
	private Symbol new_symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	// ukljucivanje informacije o poziciji tokena
	private Symbol new_symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn, value);
	}

%}

%cup
%line
%column

%xstate COMMENT

%eofval{
	return new_symbol(sym.EOF);
%eofval}

%%

" "		{ }
"\b"	{ }
"\t"	{ }
"\r\n"	{ }
"\f"	{ }

"program"	{ return new_symbol(sym.PROG, yytext()); }

"const" 	{ return new_symbol(sym.CONST, yytext()); }

"read" 		{ return new_symbol(sym.READ, yytext()); }
"print" 	{ return new_symbol(sym.PRINT, yytext()); }

"+" 		{ return new_symbol(sym.ADD, yytext()); }
"-" 		{ return new_symbol(sym.SUB, yytext()); }

"*" 		{ return new_symbol(sym.MUL, yytext()); }
"/" 		{ return new_symbol(sym.DIV, yytext()); }
"%" 		{ return new_symbol(sym.MOD, yytext()); }

"==" 		{ return new_symbol(sym.EQ, yytext()); }
"!=" 		{ return new_symbol(sym.NE, yytext()); }
">"			{ return new_symbol(sym.GT, yytext()); }
">=" 		{ return new_symbol(sym.GE, yytext()); }
"<" 		{ return new_symbol(sym.LT, yytext()); }
"<=" 		{ return new_symbol(sym.LE, yytext()); }

"=" 		{ return new_symbol(sym.ASSIGN, yytext()); }

"++" 		{ return new_symbol(sym.INC, yytext()); }
"--"		{ return new_symbol(sym.DEC, yytext()); }

";" 		{ return new_symbol(sym.SEMI, yytext()); }
"?"			{ return new_symbol(sym.QMARK, yytext()); }
":"			{ return new_symbol(sym.COLON, yytext()); }
"," 		{ return new_symbol(sym.COMMA, yytext()); }

"new"	 	{ return new_symbol(sym.NEW, yytext()); }

"{" 		{ return new_symbol(sym.LCURLY, yytext()); }
"}"			{ return new_symbol(sym.RCURLY, yytext()); }

"[" 		{ return new_symbol(sym.LSQUARE, yytext()); }
"]" 		{ return new_symbol(sym.RSQUARE, yytext()); }

"(" 		{ return new_symbol(sym.LROUND, yytext()); }
")" 		{ return new_symbol(sym.RROUND, yytext()); }

"void" 		{ return new_symbol(sym.VOID, yytext()); }
"return" 	{ return new_symbol(sym.RETURN, yytext()); }

"true" { return new_symbol(sym.BOOL, Boolean.valueOf(yytext())); }
"false" { return new_symbol(sym.BOOL, Boolean.valueOf(yytext())); }

"//" { yybegin(COMMENT); }
<COMMENT> . { yybegin(COMMENT); }
<COMMENT> "\r\n" { yybegin(YYINITIAL); }

[0-9]+  { return new_symbol(sym.NUM, new Integer (yytext())); }

([a-z]|[A-Z])[a-z|A-Z|0-9|_]* 	{return new_symbol (sym.IDENT, yytext()); }

(\'[\040-\176]\') { return new_symbol(sym.CHAR, new Character (yycharat(1))); }

. { System.err.println("Leksicka greska ("+yytext()+") u liniji "+(yyline+1)); }






