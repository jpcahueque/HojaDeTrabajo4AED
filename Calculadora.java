/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.*;
/**
 *
 * @author Juan Pablo Cahueque 15396
 * @author Enma Lopez 15122
 */
public class Calculadora {
    private String linea;
    private String archivo;
    private Pila pilaCalc;
    public Calculadora() {
        linea = "22+";
        /*Esta direccion debe modificarse segun la direccion donde se encuentra el archivo*/
        archivo = "C:\\Users\\JuanPablo\\Documents\\NetBeansProjects\\HDT4\\src\\datos.txt";
    }

    public Calculadora(String archivo) {
        linea = " ";
        this.archivo = archivo;
    }
    
    public void calcular(String eleccion) throws IOException {
        pilaFactory factory = new pilaFactory();
        pilaCalc = factory.getStack(eleccion);
        String linea, elementoActual;
        int numero1, numero2;
        Vector parrafo = LecturaArchivo.mostrarContenido(archivo);
        for (int i = 0; i<parrafo.size();i++){
            linea = (String) parrafo.elementAt(i);
            for (int j=0;j<linea.length();j++){
                elementoActual = linea.substring(j, j+1);
                try{
                   Integer.parseInt(elementoActual);
                   pilaCalc.push(elementoActual);
                }
                catch(NumberFormatException e){
                    if (!elementoActual.equalsIgnoreCase(" ") && (pilaCalc.size()>=2)){
                        numero2 = Integer.parseInt((String)pilaCalc.pop());
                        numero1 = Integer.parseInt((String)pilaCalc.pop());
                        switch (elementoActual){
                            case "+":
                                numero1 =numero1+ numero2;
                                break;
                            case "-":
                                numero1 =numero1 - numero2;
                                break;
                            case "*":
                                numero1 = numero1 *numero2;
                                break;
                            case "/":
                                numero1 = numero1/numero2;
                                break;
                            default:
                                System.out.println("La linea " + (i+1)+" del archivo tiene errores!");
                                j = linea.length();
                                break;
                        }
                        pilaCalc.push(Integer.toString(numero1));
                    }
                    else if(!elementoActual.equalsIgnoreCase(" ")){
                        j=linea.length();
                        pilaCalc.push("error");
                    }
                }
            }
            if (pilaCalc.size()>1){
                System.out.println("La linea "+ (i+1)+ " tiene errores de operacion");
            }
            else{
                System.out.println("El resultado de la linea "+(i+1)+" es: " +(pilaCalc.view(0)));
            }
            //pilaCalc.getVector().removeAllElements();
            pilaCalc.borrarTodo();
            pilaCalc.setPosicion(0);
        }
        System.out.println("No hay mas lineas que calcular");
        
    }
    
    
    
    
    
}
