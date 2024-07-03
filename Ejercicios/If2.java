package Ejercicios;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Ingresa un numero del 1 al 100: ");
        int num = t.nextInt();

        if (num >= 1 && num <= 100) {

            if (num >= 90 && num <= 100) {
                System.out.println("Clasifición:  A");
            } else if (num >= 80 && num <= 89) {
                System.out.println("Clasificación:  B");
            } else if (num >= 70 && num <= 79) {
                System.out.println("Clasificación:  C");
            } else if (num >= 60 && num <= 69) {
                System.out.println("Clasificación:  D");
            } else {
                System.out.println("Clasificación:  F");
            }
        } else {
            System.out.println("Numero no valido");
        }
    }
}
