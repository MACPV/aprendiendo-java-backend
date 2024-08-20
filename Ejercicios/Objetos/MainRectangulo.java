package Ejercicios.Objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRectangulo {

    static Scanner t = new Scanner(System.in);

    static ArrayList<Rectangulo> rectangulos = new ArrayList<>();


    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo();
    }
    public static int menu() {
        System.out.println("Elige una opcion");
        System.out.println("1- Crear rectanglo");
        System.out.println("2- Calcular area");
        System.out.println("3- Calcular perimetro");
        System.out.println("4- Salir");
        return numero();
    }
    public static void realizaOpcion( int opcion){
        switch (opcion){
            case 1:
        }
    }
    public static int numero() {
        int n;
        System.out.println("Ingresa un numero :");
        while (true) {
            try {
                n = t.nextInt();
                if (n < 0 ) {
                    System.out.println("Por favor, ingresa una opcion valida:");
                } else {
                    return n;
                }
            } catch (Exception e) {
                System.out.println("No ingresaste un número válido, intenta nuevamente:");
                t.next();
            }
        }
    }
}
