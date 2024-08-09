package Ejercicios.Metodos;

import java.util.Scanner;

public class CalculadoraMetodo {
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static int numero() {
        int n;
        System.out.println("Ingresa un numero");
        while (true) {
            try {
                n = t.nextInt();
                return n;
            } catch (Exception e) {

                System.out.println("No ingresó un numero, intente nuevamente:");
                t.next();
            }
        }
    }

    public static void menu() {
        int n;
        int opcion;
        boolean op = true;
        while (op) {

            System.out.println("Menu:");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            opcion = numero();
            switch (opcion) {
                case 1:
                    System.out.println("Suma");
                    n = numero() + numero();
                    System.out.println("El resultado es " + n);
                    break;
                case 2:
                    System.out.println("Resta");
                    n = numero() - numero();
                    System.out.println("El resultado es: " + n);
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    n = numero() * numero();
                    System.out.println("El resultado es " + n);
                    break;
                case 4:
                    System.out.println("division");

                    n = numero() / denominador(numero());
                    System.out.println("El resultado es " + n);
                case 5:
                    System.out.println("Fin");
                    op = false;
                    break;

            }
        }
    }

    public static int denominador(int n) {
        while (n == 0) {
            try {
                System.out.println("Ingresa un numero distinto a cero");
                n = t.nextInt();
                return n;
            } catch (Exception e) {

                System.out.println("intente nuevamente:");
                t.next();
            }
        }
        return n;
    }
}
