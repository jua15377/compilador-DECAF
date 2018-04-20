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
        tabla = new Hashtable<>();
    }

    public void retunToOlderState(){
        tabla = stack.pop();
    }

    public Hashtable<String, Simbolo> getTabla() {
        return tabla;
    }

    /**
     * metood para verificar existencia
     * @param key la clave a buscar
     * @return true si se encontro en el mabito global flase de lo contrario
     */
    public boolean existInGlobal(String key){
        for(Hashtable<String ,Simbolo> tablaiterada : stack){
            if(tablaiterada.containsKey(key)){
                if(tablaiterada.get(key).getAmbito() == 0 && tablaiterada.get(key).isVariable()) {
                    return true;
                }
            }
        }
        return false;
    }
    public Hashtable<String, Simbolo> getFromGlobal (String key){
        for(Hashtable<String ,Simbolo> tablaiterada : stack){
            if(tablaiterada.containsKey(key)){
                return tablaiterada;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
