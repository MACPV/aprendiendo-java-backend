package Ejercicios;

import java.util.Scanner;

public class IfEjercicio {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = t.nextInt();
        if (num > 0) {
            System.out.println("El numero es positivo");
        } else {
            if (num == 0) {
                System.out.println("El numero es 0");
            } else {
                System.out.println("El numero es negativo");
            }
        }

    }
}
