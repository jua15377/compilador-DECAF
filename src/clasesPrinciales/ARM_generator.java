package clasesPrinciales;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ARM_generator {
    private String output = "";
    private String head = "/***************************************************************\n" +
            "* Construccion de compiladores\n" +
            "* Jonnathan Juarez, carne 15377\n" +
            "****************************************************************/\n" +
            "/*--------------------------------INICIO------------------------------*/\n" +
            ".text\n" +
            ".align 2\n" +
            ".global main\n" +
            ".type main,%function\n" +
            "\n" +
            "main:\n" +
            "\tstmfd sp!, {lr}\t";

    private String program_exit= "/* salida correcta */\n" +
            "fin:\n" +
            "\tmov r0, #0\n" +
            "\tmov r3, #0\n" +
            "\tldmfd sp!, {lr}\t/* R13 = SP */\n" +
            "\tbx lr\n";

    private String data_Section= "/*---------------------------Memoria---------------------------------*/\n" +
            ".data\n" +
            ".align 2\n" +
            "\tformatoCaracter:\n" +
            "\t\t.asciz\"%c\"\n" +
            "\tformatoDecimal:\n" +
            "\t\t.asciz\"%d\"\n" +
            "\tmsj_ingreso: \n" +
            "\t\t.asciz \"Ingrese un valor:\\n\"\n" +
            "\tmsj_resultado: \n" +
            "\t\t.asciz \"El resultado es:\\n\"\n\n";
    private String print_msj_ingreso= "\tldr r0,=msj_ingreso\n" +
            "\tbl puts";
    private String print_msj_resultado= "\tldr r0,=msj_resultado\n" +
            "\tbl puts";
    private String main_block= "";
    private String[] methot_begin_end = {"\tpush {lr}","\tpop {lr}\n" +
            "\tmov pc, lr"};


    private ArrayList<String> intrucciones = new ArrayList<>();

    public ARM_generator(ArrayList<String> codigo_intermedio) {
        this.intrucciones = codigo_intermedio;

    }

    public void intruction_traslator(){
        String outputemp = "";
        String lasUsedReg = "";
        output+= head;
        for (String instruccion: intrucciones){
            if (instruccion.contains("main")){
                System.out.println("tiene main");
            }
            else if(instruccion.contains("+")){
                String result;
                instruccion = instruccion.replace("=", ",");
                instruccion = instruccion.replace("+", ",");
                String newInstruccion[] = instruccion.split(",");
                if(newInstruccion[0].contains("t")){
                    result =  newInstruccion[0].replace("t", "R");
                    lasUsedReg = result;
                    outputemp += "\n\tMOV R3,#"+ newInstruccion[1] +"\n";
                    outputemp += "\tMOV R4,#"+ newInstruccion[2] +"\n";
                    outputemp += "\tADD "+result+", R3, R4\n";
                }
                else{
                    //carga a memoria
                }
            }
            else if(instruccion.contains("-")){
                String result;
                instruccion = instruccion.replace("=", ",");
                instruccion = instruccion.replace("-", ",");
                String newInstruccion[] = instruccion.split(",");
                if(newInstruccion[0].contains("t")){
                    result =  newInstruccion[0].replace("t", "R");
                    lasUsedReg = result;
                    outputemp += "\n\tMOV R3,#"+ newInstruccion[1] +"\n";
                    outputemp += "\tMOV R4,#"+ newInstruccion[2] +"\n";
                    outputemp += "\tSUB "+result+", R3, R4\n";
                }
                else{
                    //carga a memoria
                }
            }
            else if(instruccion.contains("*")){
                String result;
                instruccion = instruccion.replace("=", ",");
                instruccion = instruccion.replace("*", ",");
                String newInstruccion[] = instruccion.split(",");
                if(newInstruccion[0].contains("t")){
                    result =  newInstruccion[0].replace("t", "R");
                    lasUsedReg = result;
                    outputemp += "\n\tMOV R3,#"+ newInstruccion[1] +"\n";
                    outputemp += "\tMOV R4,#"+ newInstruccion[2] +"\n";
                    outputemp += "\tMUL "+result+", R3, R4\n";
                }
                else{
                    //carga a memoria
                }
            }

            else if(instruccion.contains("if")){

            }

            else if(instruccion.contains("label_")){
                if(instruccion.contains("true")||instruccion.contains("false")){}
            }
            else if(instruccion.contains("call")){
                 if(instruccion.contains("print")){
                    outputemp += "\tMOV R1, "+ lasUsedReg + "\n";
                    outputemp += "\tLDR R0, =formatoDecimal\n";
                    outputemp += "\tBL printf\n";
                }

            }



        }

        output += outputemp;
        output += program_exit;
        output += data_Section;
    }

    public String getOutput() {
        return output;
    }

    public void generate_file(){
        FileWriter fichero = null;
        PrintWriter pw;
        try
        {
            fichero = new FileWriter("out.s");
            pw = new PrintWriter(fichero);
            pw.println(getOutput());
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }
        finally {
            try {
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
