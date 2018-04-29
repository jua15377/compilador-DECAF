// Generated from Program.g4 by ANTLR 4.7.1
package generateClass;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code progDeclarattion}
	 * labeled alternative in {@link ProgramParser#proram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgDeclarattion(ProgramParser.ProgDeclarattionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aStructDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAStructDec(ProgramParser.AStructDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aVarDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAVarDec(ProgramParser.AVarDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aMethodDec}
	 * labeled alternative in {@link ProgramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAMethodDec(ProgramParser.AMethodDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleVarTyoe}
	 * labeled alternative in {@link ProgramParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVarTyoe(ProgramParser.SimpleVarTyoeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVarType}
	 * labeled alternative in {@link ProgramParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVarType(ProgramParser.ArrayVarTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStruct}
	 * labeled alternative in {@link ProgramParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStruct(ProgramParser.DeclarationStructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vartypeInt}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartypeInt(ProgramParser.VartypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vartypeChar}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartypeChar(ProgramParser.VartypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vartypeBoolean}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartypeBoolean(ProgramParser.VartypeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vartypestrucID}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartypestrucID(ProgramParser.VartypestrucIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vartypestruc}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartypestruc(ProgramParser.VartypestrucContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vartypeVoid}
	 * labeled alternative in {@link ProgramParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVartypeVoid(ProgramParser.VartypeVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link ProgramParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(ProgramParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodTypeInt}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodTypeInt(ProgramParser.MethodTypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodTypeChar}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodTypeChar(ProgramParser.MethodTypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodTypeBoolean}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodTypeBoolean(ProgramParser.MethodTypeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodTypeIntVoid}
	 * labeled alternative in {@link ProgramParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodTypeIntVoid(ProgramParser.MethodTypeIntVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterID}
	 * labeled alternative in {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterID(ProgramParser.ParameterIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterArray}
	 * labeled alternative in {@link ProgramParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterArray(ProgramParser.ParameterArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterTypeInt}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeInt(ProgramParser.ParameterTypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterTypeChar}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeChar(ProgramParser.ParameterTypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterTypeBoolean}
	 * labeled alternative in {@link ProgramParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeBoolean(ProgramParser.ParameterTypeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockDeclaration}
	 * labeled alternative in {@link ProgramParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(ProgramParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIF}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIF(ProgramParser.StatementIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(ProgramParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(ProgramParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMethodCall(ProgramParser.StatementMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(ProgramParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementLocation}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementLocation(ProgramParser.StatementLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(ProgramParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statemElse}
	 * labeled alternative in {@link ProgramParser#statementElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatemElse(ProgramParser.StatemElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(ProgramParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ProgramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExprCondOpAnd}
	 * labeled alternative in {@link ProgramParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExprCondOpAnd(ProgramParser.AndExprCondOpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExprEqExpr}
	 * labeled alternative in {@link ProgramParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExprEqExpr(ProgramParser.AndExprEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExprRelationExpr}
	 * labeled alternative in {@link ProgramParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExprRelationExpr(ProgramParser.EqExprRelationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExprEqOp}
	 * labeled alternative in {@link ProgramParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExprEqOp(ProgramParser.EqExprEqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExprRelOp}
	 * labeled alternative in {@link ProgramParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExprRelOp(ProgramParser.RelExprRelOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExprAddExpre}
	 * labeled alternative in {@link ProgramParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExprAddExpre(ProgramParser.RelExprAddExpreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprMultExpr}
	 * labeled alternative in {@link ProgramParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprMultExpr(ProgramParser.AddExprMultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprMinusPlusOp}
	 * labeled alternative in {@link ProgramParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprMinusPlusOp(ProgramParser.AddExprMinusPlusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExprUnary}
	 * labeled alternative in {@link ProgramParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExprUnary(ProgramParser.MultExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExprMultDivOp}
	 * labeled alternative in {@link ProgramParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExprMultDivOp(ProgramParser.MultExprMultDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(ProgramParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueLocation}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLocation(ProgramParser.ValueLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueMethodCall}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueMethodCall(ProgramParser.ValueMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueLiteral}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLiteral(ProgramParser.ValueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExprWithParent}
	 * labeled alternative in {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExprWithParent(ProgramParser.ValueExprWithParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCalldecl}
	 * labeled alternative in {@link ProgramParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCalldecl(ProgramParser.MethodCalldeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(ProgramParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#minusplus_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusplus_op(ProgramParser.Minusplus_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#multdiv_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdiv_op(ProgramParser.Multdiv_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(ProgramParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(ProgramParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#cond_op_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op_or(ProgramParser.Cond_op_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#cond_op_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op_and(ProgramParser.Cond_op_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link ProgramParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralInt(ProgramParser.LiteralIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalchar}
	 * labeled alternative in {@link ProgramParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralchar(ProgramParser.LiteralcharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalboolean}
	 * labeled alternative in {@link ProgramParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralboolean(ProgramParser.LiteralbooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(ProgramParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(ProgramParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(ProgramParser.Boolean_literalContext ctx);
}