package Ejercicios;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int num = t.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("El numero es divisible entre 5 y 3");
        } else if (num % 5 == 0) {
            System.out.println("El numero es divisible entre 5");
        } else if (num % 3 == 0) {
            System.out.println("El numero es divisible entre 3");
        } else {
            System.out.println("El numero no es divisible entre 5 ni entre 3");
        }
    }
}
