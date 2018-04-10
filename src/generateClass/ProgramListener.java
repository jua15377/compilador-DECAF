// Generated from Program.g4 by ANTLR 4.7.1
package generateClass;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code progDeclarattion}
	 * labeled alternative in {@link ProgramParser#proram}.
	 * @param ctx the parse tree
	 */
	void enterProgDeclarattion(ProgramParser.ProgDeclarattionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progDeclarattion}
	 * labeled alternative in {@link ProgramParser#proram}.
	 * @param ctx the parse tree
	 */
	void exitProgDeclarattion(ProgramParser.ProgDeclarattionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aStructDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAStructDec(ProgramParser.AStructDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aStructDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAStructDec(ProgramParser.AStructDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aVarDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAVarDec(ProgramParser.AVarDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aVarDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAVarDec(ProgramParser.AVarDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aMethodDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAMethodDec(ProgramParser.AMethodDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aMethodDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAMethodDec(ProgramParser.AMethodDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleVarTyoe}
	 * labeled alternative in {@link ProgramParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVarTyoe(ProgramParser.SimpleVarTyoeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleVarTyoe}
	 * labeled alternative in {@link ProgramParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVarTyoe(ProgramParser.SimpleVarTyoeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVarType}
	 * labeled alternative in {@link ProgramParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayVarType(ProgramParser.ArrayVarTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVarType}
	 * labeled alternative in {@link ProgramParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayVarType(ProgramParser.ArrayVarTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStruct}
	 * labeled alternative in {@link ProgramParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStruct(ProgramParser.DeclarationStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStruct}
	 * labeled alternative in {@link ProgramParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStruct(ProgramParser.DeclarationStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vartypeInt}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVartypeInt(ProgramParser.VartypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vartypeInt}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVartypeInt(ProgramParser.VartypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vartypeChar}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVartypeChar(ProgramParser.VartypeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vartypeChar}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVartypeChar(ProgramParser.VartypeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vartypeBoolean}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVartypeBoolean(ProgramParser.VartypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vartypeBoolean}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVartypeBoolean(ProgramParser.VartypeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vartypestrucID}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVartypestrucID(ProgramParser.VartypestrucIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vartypestrucID}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVartypestrucID(ProgramParser.VartypestrucIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vartypestruc}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVartypestruc(ProgramParser.VartypestrucContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vartypestruc}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVartypestruc(ProgramParser.VartypestrucContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vartypeVoid}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVartypeVoid(ProgramParser.VartypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vartypeVoid}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVartypeVoid(ProgramParser.VartypeVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link ProgramParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(ProgramParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link ProgramParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(ProgramParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodTypeInt}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeInt(ProgramParser.MethodTypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodTypeInt}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeInt(ProgramParser.MethodTypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodTypeChar}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeChar(ProgramParser.MethodTypeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodTypeChar}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeChar(ProgramParser.MethodTypeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodTypeBoolean}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeBoolean(ProgramParser.MethodTypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodTypeBoolean}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeBoolean(ProgramParser.MethodTypeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodTypeIntVoid}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeIntVoid(ProgramParser.MethodTypeIntVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodTypeIntVoid}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeIntVoid(ProgramParser.MethodTypeIntVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterID}
	 * labeled alternative in {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameterID(ProgramParser.ParameterIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterID}
	 * labeled alternative in {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameterID(ProgramParser.ParameterIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterArray}
	 * labeled alternative in {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameterArray(ProgramParser.ParameterArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterArray}
	 * labeled alternative in {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameterArray(ProgramParser.ParameterArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterTypeInt}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeInt(ProgramParser.ParameterTypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterTypeInt}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeInt(ProgramParser.ParameterTypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterTypeChar}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeChar(ProgramParser.ParameterTypeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterTypeChar}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeChar(ProgramParser.ParameterTypeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterTypeBoolean}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeBoolean(ProgramParser.ParameterTypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterTypeBoolean}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeBoolean(ProgramParser.ParameterTypeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockDeclaration}
	 * labeled alternative in {@link ProgramParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(ProgramParser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockDeclaration}
	 * labeled alternative in {@link ProgramParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(ProgramParser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIF}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIF(ProgramParser.StatementIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIF}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIF(ProgramParser.StatementIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(ProgramParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(ProgramParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(ProgramParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(ProgramParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethodCall(ProgramParser.StatementMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethodCall(ProgramParser.StatementMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(ProgramParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(ProgramParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementLocation}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementLocation(ProgramParser.StatementLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementLocation}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementLocation(ProgramParser.StatementLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ProgramParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ProgramParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statemElse}
	 * labeled alternative in {@link ProgramParser#statementElse}.
	 * @param ctx the parse tree
	 */
	void enterStatemElse(ProgramParser.StatemElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statemElse}
	 * labeled alternative in {@link ProgramParser#statementElse}.
	 * @param ctx the parse tree
	 */
	void exitStatemElse(ProgramParser.StatemElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(ProgramParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(ProgramParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExprCondOpAnd}
	 * labeled alternative in {@link ProgramParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExprCondOpAnd(ProgramParser.AndExprCondOpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExprCondOpAnd}
	 * labeled alternative in {@link ProgramParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExprCondOpAnd(ProgramParser.AndExprCondOpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExprEqExpr}
	 * labeled alternative in {@link ProgramParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExprEqExpr(ProgramParser.AndExprEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExprEqExpr}
	 * labeled alternative in {@link ProgramParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExprEqExpr(ProgramParser.AndExprEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExprRelationExpr}
	 * labeled alternative in {@link ProgramParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExprRelationExpr(ProgramParser.EqExprRelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExprRelationExpr}
	 * labeled alternative in {@link ProgramParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExprRelationExpr(ProgramParser.EqExprRelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExprEqOp}
	 * labeled alternative in {@link ProgramParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExprEqOp(ProgramParser.EqExprEqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExprEqOp}
	 * labeled alternative in {@link ProgramParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExprEqOp(ProgramParser.EqExprEqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(ProgramParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(ProgramParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExprMultExpr}
	 * labeled alternative in {@link ProgramParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExprMultExpr(ProgramParser.AddExprMultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExprMultExpr}
	 * labeled alternative in {@link ProgramParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExprMultExpr(ProgramParser.AddExprMultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExprMinusPlusOp}
	 * labeled alternative in {@link ProgramParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExprMinusPlusOp(ProgramParser.AddExprMinusPlusOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExprMinusPlusOp}
	 * labeled alternative in {@link ProgramParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExprMinusPlusOp(ProgramParser.AddExprMinusPlusOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExprUnary}
	 * labeled alternative in {@link ProgramParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExprUnary(ProgramParser.MultExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExprUnary}
	 * labeled alternative in {@link ProgramParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExprUnary(ProgramParser.MultExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExprMultDivOp}
	 * labeled alternative in {@link ProgramParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExprMultDivOp(ProgramParser.MultExprMultDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExprMultDivOp}
	 * labeled alternative in {@link ProgramParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExprMultDivOp(ProgramParser.MultExprMultDivOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ProgramParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ProgramParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueLocation}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueLocation(ProgramParser.ValueLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueLocation}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueLocation(ProgramParser.ValueLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueMethodCall}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueMethodCall(ProgramParser.ValueMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueMethodCall}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueMethodCall(ProgramParser.ValueMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueLiteral}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueLiteral(ProgramParser.ValueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueLiteral}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueLiteral(ProgramParser.ValueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExprWithParent}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueExprWithParent(ProgramParser.ValueExprWithParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExprWithParent}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueExprWithParent(ProgramParser.ValueExprWithParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCalldecl}
	 * labeled alternative in {@link ProgramParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCalldecl(ProgramParser.MethodCalldeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCalldecl}
	 * labeled alternative in {@link ProgramParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCalldecl(ProgramParser.MethodCalldeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(ProgramParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(ProgramParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#minusplus_op}.
	 * @param ctx the parse tree
	 */
	void enterMinusplus_op(ProgramParser.Minusplus_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#minusplus_op}.
	 * @param ctx the parse tree
	 */
	void exitMinusplus_op(ProgramParser.Minusplus_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#multdiv_op}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv_op(ProgramParser.Multdiv_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#multdiv_op}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv_op(ProgramParser.Multdiv_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#powmod_op}.
	 * @param ctx the parse tree
	 */
	void enterPowmod_op(ProgramParser.Powmod_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#powmod_op}.
	 * @param ctx the parse tree
	 */
	void exitPowmod_op(ProgramParser.Powmod_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(ProgramParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(ProgramParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(ProgramParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(ProgramParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#cond_op_or}.
	 * @param ctx the parse tree
	 */
	void enterCond_op_or(ProgramParser.Cond_op_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#cond_op_or}.
	 * @param ctx the parse tree
	 */
	void exitCond_op_or(ProgramParser.Cond_op_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#cond_op_and}.
	 * @param ctx the parse tree
	 */
	void enterCond_op_and(ProgramParser.Cond_op_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#cond_op_and}.
	 * @param ctx the parse tree
	 */
	void exitCond_op_and(ProgramParser.Cond_op_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ProgramParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ProgramParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(ProgramParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(ProgramParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(ProgramParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(ProgramParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(ProgramParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(ProgramParser.Boolean_literalContext ctx);
}