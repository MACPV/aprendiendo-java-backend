package Ejercicios.CollectionEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCiudades {
    static ArrayList<String> ciudades = new ArrayList<>();
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        bucle();
        mostrar();
    }

    public static void regsitro() {
        System.out.println("Ingresa nombre de ciudad a registrar");
        ciudades.add(t.next());
    }

    public static void mostrar() {
        System.out.println(ciudades.toString());
    }

    public static void bucle() {
        System.out.println();
        while (true) {
            regsitro();
            System.out.print("¿Desea agregar otra ciudad? pulse 1 para agregar:");
            if (op() != 1) {
                break;
            }
        }
    }

    public static int op() {
        while (true) {
            try {
                return t.nextInt();
            }catch (Exception e){
                System.out.println("Ingresa un número");
                t.nextLine();
            }
        }
    }

}
