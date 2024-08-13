package Ejercicios.Metodos;

import java.util.Scanner;

public class FactorialRecursivo {
    static Scanner t = new Scanner(System.in);
    public static void main(String[] args) {
        int n = numero();
        int f = fac(n);
        System.out.println("El factorial es: " + f);
    }

    public static int fac(int n){
        if (n <= 1){
            return 1;
        }
        return n * fac( (n-1));
    }
    public static int numero() {
        int n;
        System.out.println("Ingresa un numero :");
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
