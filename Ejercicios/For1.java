package Ejercicios;

import java.util.Arrays;

public class For1 {
    public static void main(String[] args) {
        int[] ente = new int[(int)Math.floor(Math.random()*10)];
        System.out.println("El tamaño del array es: " + ente.length);
        int min = 0;
        int acum = 0;
        for (int i = 0; i < ente.length; i++) {
            ente[i] = (int) Math.floor(Math.random()*10);
            if(min == 0){
                min = ente[i];
            }
            if(ente[i] < min){
                min = ente[i];
            }
            acum += ente[i];
            System.out.println("El elemento " + (i+1) + " es: " +ente[i]);
        }
        System.out.println("El valor mínimo del array es: " + min);

        int[] ente2 = new int[ente.length];
        for(int i = 0; i < ente.length; i++){
            int j = ente.length - (i+1);
            ente2[i] = ente[j];
            System.out.println("El elemento " + (ente.length - i) + " es: " +ente[j]);
        }
        System.out.println("El array 1 es " + Arrays.toString(ente));
        System.out.println("El array 2 es " + Arrays.toString(ente2));
        System.out.println("La suma acumulada de los elementos es: " + acum);


    }
}
