package Ejercicios.Metodos;

import java.util.Scanner;

public class FibonacciRecursivo {
    static Scanner t = new Scanner(System.in);
    static int pos;

    public static void main(String[] args) {
        pos = numero();
        System.out.println("Fibonacci en la posición " + pos + ": " + fibo(pos-1));
    }


    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static int numero() {
        int n;
        System.out.println("Ingresa una posición para la serie de Fibonacci:");
        while (true) {
            try {
                n = t.nextInt();
                if (n < 0) {
                    System.out.println("Por favor, ingresa un número no negativo:");
                } else {
                    return n;
                }
            } catch (Exception e) {
                System.out.println("No ingresaste un número válido, intenta nuevamente:");
                t.next();
            }
        }
    }
}
