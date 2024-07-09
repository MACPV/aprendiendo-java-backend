package Ejercicios;

import java.lang.*;
import java.util.Scanner;

public class MathEjercicios {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        //Calculando el valor absoluto
        System.out.println("Ingresa un numero entero: ");
        String n = t.nextLine();
        try {
            int a = Integer.parseInt(n);

            System.out.println("El valor absoluto es " + Math.abs(a));
        } catch (NumberFormatException e) {
            System.out.println(n + " Debe ser un numero");
        }

        // Redondeo de números
        System.out.println("Ingresa un numero: ");
        String n2 = t.nextLine();
        try {
            Double a = Double.parseDouble(n2);

            System.out.println("El redondeo es " + Math.round(a));
        } catch (NumberFormatException e) {
            System.out.println(n + " Debe ser un numero");
        }

        //Generando números aleatorios entre 1 y 365
        double f = (int) (Math.random() * 365) + 1;
        System.out.println("El número aleatorio es: " + f);

        //Calculando la potencia
        System.out.println("Ingresa la base: ");
        String base = t.nextLine();
        System.out.println("Ingresa el exponente: ");
        String exp = t.nextLine();

        try {
            Double a = Double.parseDouble(base);
            try {
                Double b = Double.parseDouble(exp);

                System.out.println("El resultado es " + Math.pow(a, b));
            } catch (NumberFormatException e) {
                System.out.println(exp + " Debe ser un numero");
            }
        } catch (NumberFormatException e) {
            System.out.println(base + " Debe ser un numero");
        }


        //Calculando la raiz cuadrada
        System.out.println("Ingresa un numero positivo");
        String n3 = t.nextLine();
        try {
            Double a = Double.parseDouble(n3);

            System.out.println("La raiz cuadrada de: " + Math.abs(a) + "es " + Math.sqrt(Math.abs(a)));
        } catch (NumberFormatException e) {
            System.out.println(n3 + " Debe ser un numero positivo");
        }

        //Generando un número aleatorio entre dos límites
        System.out.println("Ingresa primer limite del numero aleatorio: ");
        String n4 = t.nextLine();
        System.out.println("Ingresa segundo limite del numero aleatorio: ");
        String n5 = t.nextLine();

        try {
            int a = Integer.parseInt(n4);

            try {
                int b = Integer.parseInt(n5);
                int valorEntero = (int) (Math.floor(Math.random() * (b - a + 1) + a));
                System.out.println("El número aleatorio es: " + valorEntero);

            } catch (NumberFormatException e) {
                System.out.println(n5 + " Debe ser un numero positivo");
            }
        } catch (NumberFormatException e) {
            System.out.println(n4 + " Debe ser un numero positivo");
        }


        //Generación aleatoria y análisis de raíz cuadrada
        System.out.println("Ingresa un valor entre 1 y 30");
        String n6 = t.nextLine();

        try {
            int a = Integer.parseInt(n6);

            if (a <= 30 && a >= 1) {
                int valorEntero = (int) (Math.floor(Math.random() * (a) + 1));
                double raiz = Math.sqrt(valorEntero);
                System.out.println("El numero aleatorio es: " + valorEntero + " y su raiz es: " + raiz);
                boolean prime = true;
                for (int i = 2; i < valorEntero; i++) {
                    if (valorEntero % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime)
                    System.out.println("El numero aleatorio es primo");
                else
                    System.out.println("El numero aleatorio no es primo");
            } else {
                System.out.println(a + " Debe estar entre 1 y 30");
            }


        } catch (NumberFormatException e) {
            System.out.println(n6 + " Debe ser un numero positivo");


        }
    }
}