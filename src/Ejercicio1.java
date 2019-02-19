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
 *Ejercicio 1
Realizar un programa que declare una matriz de 3x3. La matriz se debe inicializar a 0 (simula el agua).
* Aleatoriamente, se introduce un 1 (simula el barco) dentro de la tabla. A continuación,
* el alumno debe introducir la posición en la que piensa que puede estar el barco.
* El programa no finaliza hasta que no acierte la posición del barco.
 * @librerias
 */
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Entorno:
            Scanner teclado;
            int matriz [][] = new int [3][3];
            Random azar;
            int disparo = 0,disparo1 = 0;
            int min = 0, max=1;
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
        //Posicion Array
        do{
                System.out.println("Introduzca la fila: ");
                disparo = teclado.nextInt();
                System.out.println("Introduzca la columna: ");
                disparo1 = teclado.nextInt();
                if (matriz[disparo][disparo1] == 1) {
                    System.out.println("Barco");

             }else{
                    System.out.println("Agua");

             }
        }while(matriz[disparo][disparo1] != 1);
    }
}
