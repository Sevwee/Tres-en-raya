/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación,
 * el programa deberá dar la posición tanto del máximo como del mínimo.
 * @author Expression Sevwee is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */

/**
 *
 * @librerias
 */
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Entorno:
            Scanner teclado;
            int matriz [][] = new int [6][10];
            Random azar;
            int min=0, max=1000;
            int nmayor=0,nmenor=1000;
        //Algoritmo:
            teclado = new Scanner(System.in);
            azar = new Random();
             //Recorrer el array 
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {  
           matriz [i][j] = azar.nextInt((max - min)+1)+min;
                }
            }  
            
             //Mostrar el array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]" );
            }
            System.out.println("");
        }
        //Mostrar mayor
         for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {  
                    if (matriz[i][j] > nmayor) {
                        nmayor = matriz[i][j];
                    }
                }
            }  
          //Mostrar menor
         for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {  
                    if (matriz[i][j] <  nmenor) {
                        nmenor = matriz[i][j];
                    }
                }
            } 
         
         //Mostrar numeros mayores del array y menoresç
         System.out.println("Numero mayor: " + nmayor);
         System.out.println("Numero menor: " + nmenor);
        
    }
}
