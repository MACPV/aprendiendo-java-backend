package Ejercicios;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] nume = {2,5,9};

        double acum = 0;
        for (int j : nume) {
            //acum = acum + j;
                acum += j;
        }
        System.out.println("La suma del Array es " + acum);

        Scanner t = new Scanner(System.in);
        int[] nume2 = new int[4];
        acum = 0;
        double p = 0;
        for (int i = 0; i < nume2.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + " del array " );
            nume2[i] = t.nextInt();
            acum += nume2[i];
        }

        p = acum/nume2.length;
        System.out.println("El promedio del Array es " + p);

        int[] nume3 = new int[5];
        acum = 0;
        int mayor = 0;
        for (int i = 0; i < nume3.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + " del array " );
            nume3[i] = t.nextInt();
            if (nume3[i] > mayor) {
                mayor = nume3[i];
            }
            acum +=  nume3[i];
        }
        System.out.println("El mayor valor del array es " + mayor);

        //info
        int[] nume4 = new int[3];
        for (int i = 0; i < nume4.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + " del array " );
            nume4[i] = t.nextInt();
        }

        System.out.println("Ingresa el valor a buscar: ");
        int b = t.nextInt();
        boolean encontrado = false;
        for (int j : nume4) {
            if (j == b) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El valor " + b + " ha sido encontrado");
        }else {
            System.out.println("El valor " + b + " no ha sido encontrado");
        }


    }
}
