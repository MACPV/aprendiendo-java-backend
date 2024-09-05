package Ejercicios.CollectionEjercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenDeMerito {
    static ArrayList<Integer> notas = new ArrayList<>();
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        bucle();
        mostrar();
    }

    public static int numero() {
        int op;
        while (true) {
            try {
                System.out.println("Ingresa un numero entre el 1 al 10");
                op = t.nextInt();
                if (op >= 1 && op <= 10) {
                    return op;
                }
            } catch (Exception e) {
                System.out.println("Ingresa un valor entre el 1 al 10!!");
                t.nextLine();
            }
        }
    }

    public static void registro() {
        notas.add(numero());
        System.out.println("Registro exitoso");
    }

    public static void mostrar() {
        Collections.sort(notas);
        System.out.println(notas.toString());
        Collections.reverse(notas);
        System.out.println(notas.toString());
    }

    public static void bucle() {
        while (notas.size() < 10) {
            registro();
        }
    }
}
