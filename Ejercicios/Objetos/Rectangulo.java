package Ejercicios.Objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangulo {


    private int ancho;
    private int alto;
    static private int contadorRectangulo = 0;
    static Scanner t = new Scanner(System.in);
    static ArrayList<Rectangulo> rectangulos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
        }while (opcion != 4);
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
    public static void creaRectangulo(){
        System.out.println("Ingresa el alto del rectangulo: ");
        int alto = numero();
        System.out.println();

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

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
        contadorRectangulo++;
    }

    public int area() {
        return alto * ancho;
    }

    public void imprimirArea(int area) {

        System.out.println("El area es: " + area);
    }

    public int perimetro() {
        return 2 * (alto + ancho);
    }

    public void imprimirPerimetro(int perimetro) {
        System.out.println("El perimetro es: " + perimetro);
    }

    public static void totalRectangulos() {
        System.out.println("El total de rectangulos creados son: " + contadorRectangulo);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
