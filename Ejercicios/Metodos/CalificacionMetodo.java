package Ejercicios.Metodos;

import java.util.Scanner;

public class CalificacionMetodo {

    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        obtenerNota(rango(num()));
    }

    public static int num() {
        int n ;
        System.out.println("Ingresa una nota valida");
        while (true ) {
            try {
                n = t.nextInt();

                return n;
            } catch (Exception e) {

                System.out.println("No ingresó un valor valido, intente nuevamente:");
                t.next();
            }
        }
    }

    public static String obtenerNota(int nota) {

        String cali = switch (nota) {
            case 9, 10 -> {
                yield "A";

            }
            case 8 -> {
                yield "B";
            }
            case 7 -> {
                yield "C";
            }
            case 6 -> {
                yield "D";
            }
            default -> {
                yield "F";
            }
        };
        System.out.println(cali);
        return cali;
    }

    public static int rango(int n) {
        return n/10;
    }

}
