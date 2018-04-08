grammar Program;


STRUCT :  'struct' ;
TRUE :    'true' ;
FALSE :   'false' ;
VOID :    'void' ;
IF :      'if' ;
ELSE :    'else' ;
WHILE :   'while' ;
RETURN :  'return' ;
INT :     'int' ;
CHAR :    'char' ;
BOOLEAN : 'boolean' ;

fragment LETTER : ('a'..'z'|'A'..'Z') ;
fragment DIGIT :'0'..'9' ;


ID : LETTER ( LETTER | DIGIT )* ;
NUM : DIGIT ( DIGIT )* ;
Char : LETTER;


WS : 
    [\t\r\n\f ]+ -> skip
    ;


program
	: 'class' ID '{' (declaration)* '}'				#progDeclarattion
	;

declaration
	:	structDeclaration							#aStructDec
	|	varDeclaration								#aVarDec
	|	methodDeclaration							#aMethodDec
	;
	
varDeclaration	
	: 	varType ID ';'						#simpleVarTyoe
	| 	varType ID '[' NUM ']' ';'  				#arrayVarType
	;


structDeclaration
	:	STRUCT ID '{' (varDeclaration)* '}'			#declarationStruct	
	;

varType                                         
	: 	INT				                    #vartypeInt
	|	CHAR				                #vartypeChar
	|	BOOLEAN				                #vartypeBoolean
	|	STRUCT ID			                #vartypestrucID
	|	structDeclaration                   #vartypestruc
	| 	VOID	                            #vartypeVoid
	;


methodDeclaration
	:	methodType ID '(' (parameter |( parameter (',' parameter)*))? ')' block     #methodDecl
	;

	
methodType
	:	INT				                #methodTypeInt
	|	CHAR				            #methodTypeChar
	|	BOOLEAN				            #methodTypeBoolean
	|	VOID				            #methodTypeIntVoid
	;

parameter
	: 	parameterType ID		#parameterID
	|	parameterType ID '[' NUM ']'	#parameterArray
	;
	
parameterType
	:	INT				    #parameterTypeInt
	|	CHAR				#parameterTypeChar
	|	BOOLEAN				#parameterTypeBoolean
	;
	

block
	:	'{' (varDeclaration)*(statement)* '}'
	;

statement
	:	'if' '(' expression ')' block (statementElse)?	#statementIF
	|	WHILE '(' expression ')' block			#statementWhile
	|	'return' (expression | ) ';'			#statementReturn
	|	methodCall ';'					#statementMethodCall
	| 	block						#statementBlock				
	|	location '=' expression ';'			#statementLocation
	|	(expression)?';'				#statementExpression
	;

statementElse
    :
        ELSE block  	#statemElse
    ;
	
location 
	: ID | ID '[' expression ']'
	|  '.' location 
	;


expression 
	:	andExpr
	| 	expression cond_op_or andExpr
	;


andExpr
	: 	eqExpr				#andExprEqExpr 
	| 	andExpr cond_op_and eqExpr 	#andExprCondOpAnd
	;

eqExpr
	: 	relationExpr 			#eqExprRelationExpr
	| 	eqExpr eq_op relationExpr 	#eqExprEqOp
	;

relationExpr
	: 	addExpr 			
	| 	relationExpr rel_op addExpr 	
	;


addExpr
	: 	multExpr 			#addExprMultExpr
	| 	addExpr minusplus_op multExpr 	#addExprMinusPlusOp
	;

multExpr
	: 	unaryExpr 			#multExprUnary
	| 	multExpr multdiv_op unaryExpr 	#multExprMultDivOp
	;


unaryExpr
	:  	'('(INT|CHAR)')'  value		
	| 	'-' value 			
	|	'!' value 			
	|	value   	    
	;

value
	:	location			#valueLocation
	|	methodCall			#valueMethodCall
	|	literal				#valueLiteral
	|	'(' expression ')'		#valueExprWithParent
	;


	
methodCall
	:	ID '(' (arg (',' arg)*)? ')' #methodCalldecl
	;
	
arg
	:	expression
	;

minusplus_op	
	:	'+'
	| 	'-'
	;

multdiv_op
	:	'*'
	|	'/'
	|	'%'
	;

powmod_op
	:	'%'
	;
	
rel_op
	:	'<'
	|	'>'
	| 	'<='
	|	'>='
	;
	
eq_op
	:	'=='
	|	'!='
	;
	
cond_op_or : '||';
cond_op_and: '&&';


literal
	:	int_literal
	|	char_literal
	|	boolean_literal
	;
	
int_literal
	:	NUM
	;

char_literal
	:	Char 
	;
	
boolean_literal
	:	'true'
	|	'false'
	;