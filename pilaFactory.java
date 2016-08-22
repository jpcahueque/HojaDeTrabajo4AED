/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Stack;

/**
 *
 * @author enmalopezbran
 */
public class pilaFactory<T> {
    private String eleccion; 

   public Pila<T> getStack(String eleccion) {
    // seleccion de la implementacion a utilizar:
       switch(eleccion){
           case "1":
                return   new StackArrayList<T>(); 
           case "2":
                return new StackVector<T>();
           case "3":
               return new StackList<T>();
           default:
               
               break;
                       
       }
       return new StackVector<T>();
   }
}

