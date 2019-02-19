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
 *Realiza el juego de las tres en raya.
 * @librerias
 */
import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Entorno:
            Scanner teclado;
            int matriz[][] = new int [3][3];
            int f,c,conta=0;
            int jugador1=1,jugador2=2;
        //Algoritmo:
            teclado = new Scanner(System.in);
              //Mostrar el array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]" );
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        
        System.out.println("");
        
        
        
        //Posicion Array
        do{
            if (conta%2 == 0) {
                System.out.println("Turno jugador 1");
            }else{
                System.out.println("Turno Jugador 2");
            }
            
                System.out.println("Introduzca la fila: ");
                f = teclado.nextInt();
                System.out.println("Introduzca la columna: ");
                c = teclado.nextInt();
               if (conta%2 == 0) {
                matriz[f][c] = jugador1;
            }else{
                   matriz[f][c]= jugador2;
               }
               conta = conta + 1;
                for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]" );
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        }while(conta!=10);
    }
}
