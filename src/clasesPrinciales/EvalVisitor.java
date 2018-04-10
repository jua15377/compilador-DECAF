package clasesPrinciales;
import generateClass.*;


public class EvalVisitor extends ProgramBaseVisitor<String>  {
    private String errorsMsg = "";
    private int ambitoActual = 0;
    private  TablaDeSimbolos laTabla = new TablaDeSimbolos();

    @Override
    public String visitProgDeclarattion(ProgramParser.ProgDeclarattionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitSimpleVarTyoe(ProgramParser.SimpleVarTyoeContext ctx) {
        String tipo = ctx.varType().getText();
        String nombre = ctx.ID().getText();
        Simbolo s = new Simbolo(nombre,tipo,ambitoActual);
        //verifica que no se haya declarado con antelacion la variable con el mismo nombre
        if(laTabla.getTabla().containsKey(s.getNombre())){
            //si tuviese el mismo ambito
            if (laTabla.getTabla().get(nombre).getAmbito() == s.getAmbito()){
                errorsMsg += "Error en linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\" Ya existe en este ambito.\n";
            }
            else {
                laTabla.addSimbol(s);

            }
        }
        else {
            laTabla.addSimbol(s);
        }
        return super.visitSimpleVarTyoe(ctx);
    }

    @Override
    public String visitMethodDecl(ProgramParser.MethodDeclContext ctx) {

        String returnValue = ctx.methodType().getText();
        String id = ctx.ID().getText();
        int canParam = ctx.parameter().size();
        Simbolo s = new Simbolo(id,returnValue,ambitoActual,canParam);

        if(laTabla.getTabla().contains(s)){
            //no metodo main duplicado
            if (laTabla.getTabla().get(id).getNombre().equals("main")){
                errorsMsg += "Error en linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Solo puede existir un meotodo: \""+ ctx.ID().getText()+"\"\n";
            }
            else if (laTabla.getTabla().get(id).getAmbito() == s.getAmbito()){

            }
        }
        else {
            //revisa condiciones del Main;
            if (s.getNombre().equals("main")){
                if(!s.getTipoDeRetorno().equals("void"))
                    errorsMsg += "Error en linea:" + ctx.getStart().getLine()+", "+
                            ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\"No puede retornar un valor!.\n";
                else if(s.getCantParam() != 0){
                    errorsMsg += "Error en linea:" + ctx.getStart().getLine()+", "+
                            ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\"No puede contener parametros!.\n";
                }
                else {
                    laTabla.addSimbol(s);
                }
            }
            else {
                if(s.getCantParam() != 0){

                    for(int i=0;i<canParam;i++){
                        String parametro = visit(ctx.parameter(i));
                        String[] partes =  parametro.split("-");
                        String pType = partes[0];
                        String pId = partes[1];
                        s.addParameter(new Simbolo(pId,pType));

                    }
                }
                laTabla.addSimbol(s);
            }

        }
        return super.visitMethodDecl(ctx);
    }

    @Override
    public String visitArrayVarType(ProgramParser.ArrayVarTypeContext ctx) {
        String tipo = ctx.varType().getText();
        String id = ctx.ID().getText();
        int arraySize = Integer.parseInt(ctx.NUM().getText());
        Simbolo s = new Simbolo(id,arraySize, tipo,ambitoActual);
        //verifica que no se haya declarado con antelacion la variable
        if(laTabla.getTabla().containsKey(id)){
            if (laTabla.getTabla().get(id).getAmbito() == s.getAmbito()){
                errorsMsg += "Error en linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\" Ya existe en este ambito.\n";
            }
        }
        else {
            if(s.getSize()>0) {
                laTabla.addSimbol(s);
            }
            else {
                errorsMsg += "Error en linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                        ". \""+ctx.ID().getText()+"\" No puede tener un indice negativo\n";
            }
        }
        return super.visitArrayVarType(ctx);
    }

    @Override
    public String visitStatementLocation(ProgramParser.StatementLocationContext ctx) {
        //para nombres de varibales
        if(ctx.getChildCount() == 1){
            String id = ctx.location().getText();
            String valor = ctx.expression().getText();
            //verificar que exista el simbolo en la tabla actual, y sea variables
            if(laTabla.getTabla().containsKey(id)){
                laTabla.getTabla().get(id).setValor(valor);
            }
            //verificar en las variables globales
            //de lo contrario error
            else {
                errorsMsg += "Error en linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                        ". \""+ctx.ID().getText()+"\" No puede tener un indice negativo\n";-
            }
        }
        return super.visitStatementLocation(ctx);
    }

    @Override
    public String visitBlockDeclaration(ProgramParser.BlockDeclarationContext ctx) {
        ambitoActual ++;
        laTabla.saveCurrentState();
        visitChildren(ctx);
        laTabla.retunToOlderState();
        ambitoActual --;
        return null;
    }

    @Override
    public String visitParameterID(ProgramParser.ParameterIDContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.parameterType().getText();
        return tipo + "-"+id;
    }

    public void haveMain() {
        if(!laTabla.getTabla().containsKey("main")){
            errorsMsg += "No se encontro el metodo \"main\"";
        }
    }

    public String getErrorsMsg(){
        return this.errorsMsg;
    }
}
