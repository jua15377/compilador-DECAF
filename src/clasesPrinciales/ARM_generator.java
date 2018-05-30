package clasesPrinciales;

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
            "\tformatoCaracter:\n" +
            "\t\t.asciz\"%s\"\n" +
            "\tmsj_ingreso: \n" +
            "\t\t.asciz \"Ingrese un valor:\\n\"\n" +
            "\tmsj_resultado: \n" +
            "\t\t.asciz \"El resultado es:\\n\"";
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


}
