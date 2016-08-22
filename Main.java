/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Juan Pablo Cahueque 15396
 * @author Enma Lopez 15122
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException{
        // TODO code application logic here

        /**Recuerde cambiar el path del archivo .txt en la clase Calculadora**/
        Scanner teclado = new Scanner(System.in);
        Calculadora miCalc = new Calculadora();
        System.out.println("Ingrese su eleccion de pila (1, 2 o 3)\n 1.ArrayList\n 2.Vector\n 3.LinkedList ");
        String eleccion = teclado.next();
        miCalc.calcular(eleccion);

        
    }
    
}
