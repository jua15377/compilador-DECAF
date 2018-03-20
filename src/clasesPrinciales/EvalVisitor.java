package clasesPrinciales;
import generateClass.*;


public class EvalVisitor extends ProgramBaseVisitor<String>  {

    @Override
    public String visitProgDeclarattion(ProgramParser.ProgDeclarattionContext ctx) {

        return visitChildren(ctx);
    }
}
