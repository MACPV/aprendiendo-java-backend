package Ejercicios.Excepciones.AdiviandoNumero;

import java.util.Scanner;

public class Adivinando {
    static Scanner t = new Scanner(System.in);
    static int numAle;
    static int contador = 0;

    public static void main(String[] args) {
        numAle = numeroAleatorio();
        System.out.println(numAle);
        validacion(numero());
    }

    public static int numero() {
        while (true) {
            try {
                System.out.println("Ingresa un número:");
                return t.nextInt();
            } catch (Exception e) {
                System.out.println("Ingresa un valor válido");
                contador++;
            } finally {
                t.nextLine();
            }
        }
    }

    public static int numeroAleatorio() {
        return (int) (Math.random() * 50 + 1);
    }

    public static void validacion( int numUsuario) {
        contador++;
        if (numAle == numUsuario) {
            System.out.println("¡¡Adivinaste!!");
            System.out.printf("Lo hiciste al intento %d", contador);

        }
        if (numAle < numUsuario) {
            System.out.println("Es menor, ingresa un numero más pequeño");
            validacion(numero());
        }
        if (numAle > numUsuario) {
            System.out.println("Es mayor, ingresa un numero más alto");
            validacion( numero());
        }

    }
}
