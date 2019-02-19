/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Dadas dos matrices(R y S)del mismotamaño(4x4),mostrar los elementos comunes de R en Sen cualquier posición.
 * @author Expression Sevwee is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */

/**
 *
 * @librerias
 */
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Entorno:
            Scanner teclado;
            int r [][], s[][];
            r = new int [4][4];
            s = new int [4][4];
            int j,i,conta=0;
            
            Random azar;
            
            
            
            
        //Algoritmo:
            teclado = new Scanner(System.in);
             azar = new Random();
             
             for ( i = 0; i < 4; i++) {
                for ( j = 0; j < 4; j++) {  
           r [i][j] = azar.nextInt(9)+1;
           s [i][j] = azar.nextInt(9)+1;
                }
            } 
             for ( i = 0; i < 4; i++) {
                 System.out.println("\t");
                for ( j = 0; j < 4; j++) {
                    System.out.print("[" + r[i][j] + "]" );
                }  
            }
            
             for ( i = 0; i < 4; i++) {
                 System.out.println("\t");
                for ( j = 0; j < 4; j++) {
                    System.out.print("[" + s[i][j] + "]" );
                }
             }
             
             for (i = 0; i < 4; i++) {
                 for ( j = 0; j < 4; j++) {
                     
                     if (r[i][j] == s[i][j]) {
                         conta += conta;
                     }
                 }     
             }
             System.out.println("");
             System.out.println("Se repiten: " + conta + " veces");
        }
 }


