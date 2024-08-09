package Ejercicios.Metodos;

import java.util.Scanner;

public class TablaMultiplicar {
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirTabla(pedirNumero());
    }

    public static int[] pedirNumero() {
        int[] n = new int[3];

        System.out.println("Ingresa los número que quieres ver su tabla: ");
        for (int i = 0 ; i < n.length ; i++){
            while (true){
                try{
                    System.out.println("Numero " + (i+1));

                    n[i] = t.nextInt();
                    break;

                }catch(Exception e){
                    System.out.println("Ingresa un numero valido");
                    t.next();
                }
            }
        }
        return n;

    }

    public static void imprimirTabla(int[] n) {
        for (int k : n) {
            for (int i = 0; i <= 10; i++) {
                int m = i * k;
                String mensaje = String.format("%d x %d es igual a %d", k, i, m);
                System.out.println(mensaje);
            }
        }
    }
}
