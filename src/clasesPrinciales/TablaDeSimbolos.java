package clasesPrinciales;

import java.util.Hashtable;
import java.util.Stack;

public class TablaDeSimbolos {
    private Stack<Hashtable<String,Simbolo>> stack = new Stack<>();
    private Hashtable<String, Simbolo> tabla;
    public TablaDeSimbolos() {
        tabla = new Hashtable<>();
    }
    public void addSimbol(Simbolo s){
        String name = s.getNombre();
        tabla.put(name, s);
    }
    public Simbolo getaSimbol(String s){
        return tabla.get(s);
    }

    public void saveCurrentState(){
        stack.push(tabla);
    }

    public void retunToOlderState(){
        tabla = stack.pop();
    }

    public Hashtable<String, Simbolo> getTabla() {
        return tabla;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
