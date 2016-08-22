/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author JuanPablo
 */
public class StackArrayList<T> extends Pila<T> {
    private int posicion;
    private ArrayList<T> modulo;

    public StackArrayList() {
        posicion = 0;
        modulo = new ArrayList<T>();
    }

    public StackArrayList(ArrayList<T> modulo) {
        posicion = 10;
        this.modulo = modulo;
    }
    @Override
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setArrayList(ArrayList<T> modulo) {
        this.modulo = modulo;
    }

    public int getPosicion() {
        return posicion;
    }

    public ArrayList<T> getVector() {
        return modulo;
    }
    
    
    @Override
    public T pop(){
        T elemento = (T) modulo.get(posicion-1);
        modulo.remove(posicion-1);
        posicion =posicion - 1;
        return elemento;
    }

    @Override
    public void push(T operando) {
        modulo.add(operando); 
        posicion = posicion + 1;
    }
    
    @Override
    public int size() {
        return modulo.size();
    }

    @Override
    public T view(int posicion) {
        return (T) modulo.get(posicion);
    }

    @Override
    public void borrarTodo() {
            modulo.clear();
    }
}
