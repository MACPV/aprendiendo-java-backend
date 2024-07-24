package Ejercicios;

import java.util.Arrays;

public class ForEach1 {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)Math.floor(Math.random()*100);
        }
        System.out.println("El array es: " + Arrays.toString(a));

        int acum = 0;
        for ( int num : a){
            if (num % 2 == 0) {
                System.out.println(num);
                acum ++;
            }
        }
        System.out.println("Los valores pares en total son: " + acum);

        float acum2 = 0;
        float[] f = new float[20];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float)Math.random()*100;
        }
        for ( float num2 : f){
            acum2 += num2;
        }
        System.out.println("El array de floats es: " + Arrays.toString(f));
        System.out.println("El promedio es: " + (acum2/f.length));

        String[] myArray = {"Renzo", "Nicolas", "Ricardo", "Piero", "Alonso"};
        String myFriends = "";
        for(String nombres: myArray) {
            myFriends += nombres + ", ";
        }
        System.out.println("Mis amigos son: " + myFriends);
    
    }
}
