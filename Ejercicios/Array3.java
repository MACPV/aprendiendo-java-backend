package Ejercicios;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("Introduca valor a buscar: ");
        Scanner t = new Scanner(System.in);
        int valor = t.nextInt();
        int index = Arrays.binarySearch(a, valor);
        System.out.println("El valor se encuentra en el indice " + index);

        int[]b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        if (Arrays.equals(b, a)) {
            System.out.println("Los arrays son iguales");
        }else {
            System.out.println("Los arrays son diferentes");
        }

        System.out.println("Ingresa el primer indice: ");
        int i1 = t.nextInt() - 1;
        System.out.println("Introduca el segundo indice: ");
        int i2 = t.nextInt() - 1;
        while (i1 > i2 || i1 < 0 || i2 >= a.length) {
            System.out.println("El primer indice no debe ser mayor al segundo indice");
            System.out.println("Ingresa el primer indice: ");
            i1 = t.nextInt();
            System.out.println("Introduca el segundo indice: ");
            i2 = t.nextInt();
        }
        int[] c = Arrays.copyOfRange(a, i1, i2);
        System.out.println(Arrays.toString(c));

        System.out.println("Ingresa el tamaño del array");
        int[] d = new int[t.nextInt()];
        System.out.println(d.length);
        System.out.println("Ingresa el valor a rellenar");
        int v1 = t.nextInt();
        System.out.println("Ingresa el límite del indice a rellenar");
        int limite = t.nextInt();

        if (limite > d.length) {
            limite = d.length;
        }

        int[] e = Arrays.copyOfRange(d, 0, limite);
        Arrays.fill(e,v1);
        System.arraycopy(e, 0, d, 0, e.length);

        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));

    }
}
