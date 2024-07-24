package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Integrador4 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        //Calculo de factorial
        System.out.println("Ingrese el numero: ");
        int numero = t.nextInt();
        int i = 1;
        int fact = 1;
        do {
            fact = i * fact;
            i++;
        } while (i <= numero);
        System.out.println("El factorial de " + numero + " es " + fact);

        // fibonacci
        System.out.println("Ingrese la posición del arreglo de fibonacci: ");
        int pos = t.nextInt();
        int a = 0;
        int j = 1;
        int b = 1;
        int resultado = 0;
        do {
            if (pos == 1) {

                j = pos + 1;
            } else {
                resultado = a + b;
                a = b;
                b = resultado;
                j++;
            }

        } while (j < pos - 1);
        System.out.println("El valor correspondiente a la posición " + pos + " es " + resultado);

        //cantidad de primos a visualizar
        System.out.println("Ingresa cantidad de primos a visualizar");
        int[] arrayPrimos = new int[t.nextInt()];
        int num = 2;
        i = 2;
        j = 1;
        arrayPrimos[0] = 2;
        boolean primo = true;

        do {
            do {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
                i++;
            } while (num > i);

            if (primo) {
                arrayPrimos[j] = num;
                j++;
            }
            primo = true;
            i = 2;
            num++;
        } while (j < arrayPrimos.length);

        System.out.println(Arrays.toString(arrayPrimos));


        System.out.println("Ingresa cantidad de * por lado: ");
        int lado = t.nextInt();

        for (i = 0; i < lado; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (i = 0; i < lado; i++) {
            System.out.print("* ");
        }

    }
}
