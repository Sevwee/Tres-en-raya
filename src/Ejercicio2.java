/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Expression Sevwee is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */

/**
 *Dada una matriz cuadrada(3x3)rellena desde teclado, invertir su diagonal principal.
 * @librerias
 */
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Entorno:
            Scanner teclado;
             int matriz [][] = new int [3][3];
             int x;
        //Algoritmo:
            teclado = new Scanner(System.in);
           //Recorrer el array 
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {  
                    System.out.println("Introduca el numero en la posicion " + i );
                    matriz[i][j] = teclado.nextInt();    
                }
            }  
            //Mostrar el array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]" );
            }
            System.out.println("");
        } 
        //Intercambiar array
        x = matriz [0][0];
        matriz [0][0] = matriz [2][2];
        matriz [2][2] = x;
        
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("-----------------------------------------");
        
        //mostrar array 2
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]" );
            }
            System.out.println("");
        } 
        
            
    
            
    }
}
