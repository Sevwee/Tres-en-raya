/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 * @author Expression Sevwee is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */

/**
 *
 * @librerias
 */
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
       //Entorno:
            Scanner teclado;
            int matriz [][] = new int [6][10];
            Random azar;
            int min=0, max=1000;
            int anterior=0;
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
                    if (matriz[i][j] == anterior) {
                        matriz[i][j] = matriz[i][j] + 1;
                    }
                    anterior = matriz[i][j];
                }
            }  
         System.out.println("");
         System.out.println("");
         System.out.println("");
          //Mostramos de nuevo  el array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]" );
            }
            System.out.println("");
        }

    }
}
