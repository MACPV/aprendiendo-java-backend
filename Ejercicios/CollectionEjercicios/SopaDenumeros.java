package Ejercicios.CollectionEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class SopaDenumeros {
    static ArrayList<Integer> numeros = new ArrayList<>();
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        leerValores();
        mostrarResultados(numeros, calcularSuma(numeros), calcularPromedio());
    }

    public static void registro() {
        numeros.add(numero());
        System.out.println("Registro exitoso");
    }

    public static int calcularSuma(ArrayList<Integer> numeros) {
        int acum = 0;

        for (int i = 0; i < numeros.size(); i++) {
            acum = acum + numeros.get(i);
        }

        return acum;
    }

    public static void mostrarResultados(ArrayList<Integer> numeros, int suma, double media) {
        System.out.println("La suma de los valores es: " + calcularSuma(numeros));
        System.out.println("La media aritmetica es: " + calcularPromedio());
        ArrayList<Integer> filtro = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > media) {
                filtro.add(numeros.get(i));
            }
        }
        System.out.println(filtro.toString());
    }

    public static Double calcularPromedio() {

        return (double) calcularSuma(numeros) / numeros.size();
    }

    public static void leerValores() {
        bucle();
        numeros.remove(null);
        System.out.println(numeros.toString());

    }

    public static void bucle() {
        System.out.println("Ingresa un valor menos -99");
        while (true) {
            registro();
            if(numeros.getLast()== null){
                break;
            }
        }
    }

    public static Integer numero() {
        int op;
        while (true) {
            try {
                System.out.println("Ingresa un numero ");
                op = t.nextInt();

                if (op == -99) {
                    return null;
                }
                return op;

            } catch (Exception e) {
                System.out.println("Ingresa un valor numerico!!");
                t.nextLine();
            }
        }
    }
}
