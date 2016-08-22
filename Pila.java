

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Juan Pablo Cahueque 15396
 * @author Enma Lopez 15122
 */
public abstract class Pila<T>{
    
    public abstract void push(T operando);
    public abstract T pop();
    public abstract int size();
    public abstract void setPosicion(int posicion);
    public abstract T view(int posicion);
    public abstract void borrarTodo();
            
}
