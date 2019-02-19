/**
 *Realiza el juego de las tres en raya.
 *
 * @librerias
 */
import java.util.*;

public class Ejercicio7 {

    static int MAXIMO_FILA = 3;
    static int MAXIMO_COL = 3;

    public static void main(String[] args) {
        //Entorno:

        int matriz[][];
        matriz = new int[MAXIMO_FILA][MAXIMO_COL];
        int conta = 0;
        int movimientos[] = new int[2]; //0 FILA 1 COLUMNA

        boolean finPartida = false;
        //Algoritmo:

        //Mostrar el array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

        System.out.println("");

        //Posicion Array
        do {

            movimientos = pedirMovimiento(matriz, conta);

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");

            finPartida = checkMovGanador(matriz, movimientos);

            if (finPartida) {
                int jugadorGanador;
                if (conta % 2 == 0) {
                    jugadorGanador = 1;
                } else {
                    jugadorGanador = 2;
                }
                System.out.println("GANADOR JUGADOR " + jugadorGanador);
            }
            conta = conta + 1;
            if (conta == 10 && finPartida == false) {
                finPartida = true;
                System.out.println("FIN DE LA PARTIDA\nRESULTADO: EMPATE ");
            }
        } while (!finPartida);

    }

    private static int[] pedirMovimiento(int[][] matriz, int conta) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int movimientos[] = new int[2];
        int f, c;

        if (conta % 2 == 0) {
            System.out.println("Turno " + conta + ": Le toca al jugador 1");
        } else {
            System.out.println("Turno " + conta + ": Le toca al jugador 2");
        }
        System.out.println("Introduzca la fila: ");
        f = teclado.nextInt();
        System.out.println("Introduzca la columna: ");
        c = teclado.nextInt();
        if (conta % 2 == 0) {
            // VERIFICAMOS QUE NO SOBRE ESCRIBE EL MOVIMIENTO Y EL MOVIMIENTO ES VALIDO FALTA VALIDAR QUE ES UN NUMERO
            if (f < MAXIMO_FILA && c < MAXIMO_COL && f >= 0 && c >= 0 && matriz[f][c] == 0) {
                matriz[f][c] = 1;
            } else {
                System.out.println("ERES INUTIL No puedes poner una ficha en la posicion " + f + "," + c);
                return pedirMovimiento(matriz, conta);
            }

        } else if (f < MAXIMO_FILA && c < MAXIMO_COL && f >= 0 && c >= 0 && matriz[f][c] == 0) {
            matriz[f][c] = 2;
        } else {
            System.out.println("ERES INUTIL No puedes poner una ficha en la posicion " + f + "," + c);
            return pedirMovimiento(matriz, conta);
        }
        movimientos[0] = f;
        movimientos[1] = c;
        return movimientos;
    }

    private static boolean checkMovGanador(int[][] matriz, int[] mov) {
        System.out.println("VERIFICANDO MOVIMIENTO GANADOR EN " + mov[0] + ',' + mov[1]);
        boolean esJugadaGanadora = true;

        // GANA CON FILA        
        int jugador = matriz[mov[0]][mov[1]];
        // VERIFICAMOS FILA mov[0] en toda esa fila los resultados del contenido de la matriz deben tener el valor de jugador

        for (int i = 0; i < MAXIMO_FILA; i++) {
            if (matriz[mov[0]][i] != jugador && esJugadaGanadora) {
                esJugadaGanadora = false;
            }
        }

      
        return esJugadaGanadora;
    }
}
