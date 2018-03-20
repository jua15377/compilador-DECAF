package clasesPrinciales;

public class Objeto {
    private String tipo;
    private String nombre;
    private String valor;
    private int sizeIDArray;


    public Objeto(String nombre, String valor, String  tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }
    public Objeto (String nombre, String valor, String  tipo,int size ){
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.sizeIDArray = size;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getSizeIDArray() {
        return sizeIDArray;
    }

    public void setSizeIDArray(int sizeIDArray) {
        this.sizeIDArray = sizeIDArray;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", valor='" + valor + '\'' +
                ", sizeIDArray=" + sizeIDArray +
                '}';
    }
}

