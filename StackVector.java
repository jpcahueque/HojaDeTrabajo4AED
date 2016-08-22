/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 * @author Juan Pablo Cahueque 15396
 * @author Enma Lopez 15122
 */
public  class StackVector<T> extends Pila<T>{
    private int posicion;
    private Vector modulo;

    public StackVector() {
        posicion = 0;
        modulo = new Vector<T>(10,5);
    }

    public StackVector(Vector<T> modulo) {
        posicion = 10;
        this.modulo = modulo;
    }


    public void setVector(Vector<T> modulo) {
        this.modulo = modulo;
    }

    public int getPosicion() {
        return posicion;
    }

    public Vector<T> getVector() {
        return modulo;
    }
    
    
    @Override
    public T pop(){
        T elemento = (T) modulo.elementAt(posicion-1);
        modulo.removeElementAt(posicion-1);
        posicion =posicion - 1;
        return elemento;
    }

    @Override
    public void push(T operando) {
        modulo.addElement(operando); 
        posicion = posicion + 1;
    }

    @Override
    public int size() {
        return modulo.size();
    }

    @Override
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public T view(int posicion) {
        return (T) modulo.elementAt(posicion);
    }

    @Override
    public void borrarTodo() {
        modulo.removeAllElements();
    }
}
