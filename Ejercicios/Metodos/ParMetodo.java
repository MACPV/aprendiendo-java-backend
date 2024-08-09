package Ejercicios.Metodos;

import java.util.Scanner;

public class ParMetodo {
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {


        esPar(numero());
    }

    public static int numero() {
        int n;
        System.out.println("Ingresa un numero");
        while (true) {
            try {
                n = t.nextInt();
                return n;
            } catch (Exception e) {

                System.out.println("No ingresó un número, intente nuevamente:");
                t.next();
            }
        }
    }

    public static void esPar(int n){
        if (n % 2 == 0) {
            System.out.println("El "+n+" es par");
        }else {
            System.out.println("El "+n+" no es par");
        }
    }

}
