package Entidad;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class AdivinarNum {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private int numAleatorio;
    private int numUsuario;
    private int intentos;

    public void generarNumAleatorio() {
        numAleatorio = (int) (Math.random() * 500);
        System.out.println("El n° es  " + numAleatorio);
    }

    public void adivinarNum() throws java.util.InputMismatchException {
        System.out.println("Bienvenido al juego de las coincidencias numéricas\n"
                + "El programa generará un número aleatorio\n"
                + "Cuando el jugador lo adivine resultará ganador del juego\n"
                + "SUERTE....\n"
                + "------------------------------------------------------------------\n"
                + "Pista: el número a adivinar se encuentra entre 1 y 500\n"
                + "Ingrese un número por favor");
        try {
            do {
                
                numUsuario = leer.nextInt();
                System.out.println("Lo siento, el numero ingresado no coincide, inténtalo nuevamente");
                intentos++;
            } while (numUsuario != numAleatorio);
            {
                System.out.println("FELICIDADES, lograste encontrar el número\n"
                        + "El número ganador fue: " + numAleatorio + "\n"
                        + "La cantidad de intentos fue " + intentos + "\n"
                        + "Gracias por jugar con nosotros, hasta la próxima");
            }
        } catch (java.util.InputMismatchException j) {
            intentos++;
            System.out.println("Tipo caracter ingresado invalido\n"
                    + "El número ganador fue: " + numAleatorio + "\n"
                    + "La cantidad de intentos fue " + intentos + "\n"
                    + "Gracias por jugar con nosotros, hasta la próxima");
        }
    }
}
