package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] a = {4,8,3};

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese el valor: ");
            int valor = sc.nextInt();
            int t = a.length;
            a = Arrays.copyOf(a, t + 1);
            a[t] = valor;
        }
        System.out.println("El nuevo array es: " + Arrays.toString(a));


        int[] ale = new int[6];
        int pares = 0 ;
        for (int i = 0; i < ale.length; i++) {
            ale[i] = (int)Math.floor(Math.random()*10);
            if(ale[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.println("El array es: " + Arrays.toString(ale));
        System.out.println("Hay " + pares + " elementos");



        int[] par = new int[5];
        int accum = 0 ;
        for (int i = 0; i < par.length; i++) {
            par[i] = (int)Math.floor(Math.random()*10);
            if(i % 2 == 0) {
                accum+= par[i];
            }
        }
        System.out.println("El array es: " + Arrays.toString(par));
        System.out.println("La suma de los elementos es: " + accum);

        sc.nextLine();
        String[] nombres = new String[4];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre: ");
            nombres[i] = sc.nextLine();
        }
        System.out.println("El array es: " + Arrays.toString(nombres));

    }


}

