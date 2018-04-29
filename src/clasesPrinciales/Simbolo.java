package clasesPrinciales;

import java.util.ArrayList;

public class Simbolo {
    private String tipo;
    private String valor;
    private String nombre;
    private String tipoDeRetorno;
    private boolean isMethot = false;
    private boolean isStruct = false;
    private boolean isVariable = false;
    private boolean isArray = false;
    private int size;
    private int sizeOnMem;
    private int ambito;
    private int cantParam;
    private ArrayList<Simbolo> parametros = new ArrayList<>();


    //paraParam
    public Simbolo(String nombre, String tipo){
        this.nombre  = nombre;
        this.tipo = tipo;
    }
    //param array
    public Simbolo(int size, String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.size = size;
        isArray = true;
    }

    //construtor variable
    public Simbolo(String nombre, String tipo, int ambito){
        this.nombre = nombre;
        this.tipo = tipo;
        this.ambito = ambito;
        this.isVariable = true;
        //por definir tamanio segun su tipo
        this.sizeOnMem = 4;
    }
    //constructor metodo
    public Simbolo(String nombre, String tipoDeRetorno, int ambito, int cantParam){
        this.nombre = nombre;
        this.ambito = ambito;
        this.tipoDeRetorno = tipoDeRetorno;
        this.cantParam = cantParam;
        this.isMethot = true;
    }
    // para arrelgos
    public Simbolo(String nombre,  int size, String tipo,  int ambito){
        this.nombre = nombre;
        this.tipo = tipo;
        this.ambito = ambito;
        this.isArray = true;
        this.size = size;
        //por definir tamanio segun su tipo
        this.sizeOnMem = 4;
    }

    //opra struct
    public Simbolo(String nombre, ArrayList<Simbolo> atributos){
        this.nombre = nombre;
        this.parametros = atributos;
        this.isStruct = true;
    }



    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDeRetorno() {
        return tipoDeRetorno;
    }

    public int getSizeOnMem() {
        return sizeOnMem;
    }

    public int getAmbito() {
        return ambito;
    }

    public int getCantParam() {
        return cantParam;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isMethot() {
        return isMethot;
    }

    public boolean isStruct() {
        return isStruct;
    }

    public boolean isVariable() {
        return isVariable;
    }

    public ArrayList<Simbolo> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Simbolo> parametros) {
        this.parametros = parametros;
    }

    public void addParameter(Simbolo s){
        parametros.add(s);
    }

    public int getSize() {
        return size;
    }

    public boolean isArray() {
        return isArray;
    }

    public void setSizeOnMem(int sizeOnMem) {
        this.sizeOnMem = sizeOnMem;
    }
}
