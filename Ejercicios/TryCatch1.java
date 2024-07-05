package Ejercicios;

import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        // Division segura
        System.out.println("Ingresa numerador: ");
        int num = t.nextInt();

        System.out.println("Ingresa denominador: ");
        int den = t.nextInt();

        try {
            int resultado = num / den;
            System.out.println("El resultado de la division es: " + resultado);
        } catch (Exception e) {
            System.out.println("El denomminador no debe ser 0");
            // TODO: handle exception
        }

        // Resta con Manejo de Excepciones
        t.nextLine();

        System.out.println("Ingresa primer numero:");
        String num1 = t.nextLine();
        System.out.println("Ingresar segundo numero:");
        String num2 = t.nextLine();

        try {
            int n1 = Integer.parseInt(num1);
            try {
                int n2 = Integer.parseInt(num2);
                int resultado = n1 - n2;

                System.out.println("El resultado de la resta es: " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("El segundo numero debe ser un numero:");
                // TODO: handle exceptionnumero
            }
        } catch (NumberFormatException e) {
            System.out.println("El primer numero debe ser un numero:");
            // TODO: handle exception
        }

    }
}
