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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Simbolo)) return false;

        Simbolo simbolo = (Simbolo) o;

        if (isMethot() != simbolo.isMethot()) return false;
        if (isStruct() != simbolo.isStruct()) return false;
        if (isVariable() != simbolo.isVariable()) return false;
        if (isArray() != simbolo.isArray()) return false;
        if (getSize() != simbolo.getSize()) return false;
        if (getSizeOnMem() != simbolo.getSizeOnMem()) return false;
        if (getAmbito() != simbolo.getAmbito()) return false;
        if (getCantParam() != simbolo.getCantParam()) return false;
        if (!getTipo().equals(simbolo.getTipo())) return false;
        if (getValor() != null ? !getValor().equals(simbolo.getValor()) : simbolo.getValor() != null) return false;
        if (!getNombre().equals(simbolo.getNombre())) return false;
        if (!getTipoDeRetorno().equals(simbolo.getTipoDeRetorno())) return false;
        return getParametros().equals(simbolo.getParametros());
    }

    @Override
    public int hashCode() {
        int result = getTipo().hashCode();
        result = 31 * result + (getValor() != null ? getValor().hashCode() : 0);
        result = 31 * result + getNombre().hashCode();
        result = 31 * result + getTipoDeRetorno().hashCode();
        result = 31 * result + (isMethot() ? 1 : 0);
        result = 31 * result + (isStruct() ? 1 : 0);
        result = 31 * result + (isVariable() ? 1 : 0);
        result = 31 * result + (isArray() ? 1 : 0);
        result = 31 * result + getSize();
        result = 31 * result + getSizeOnMem();
        result = 31 * result + getAmbito();
        result = 31 * result + getCantParam();
        result = 31 * result + getParametros().hashCode();
        return result;
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
}
