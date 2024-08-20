package Ejercicios.Modelos;

import java.util.Scanner;

public class SelectorFigura {
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        figura();
    }

    public static void figura() {
        System.out.println("Selecciona figura");
        System.out.println("1- Rectangulo");
        System.out.println("2- Triangulo");
        System.out.println("3- Circulo");
        int op = numero();
        switch (op) {
            case 1:
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.menu();
            case 2:
                Triangulo triangulo = new Triangulo();
                triangulo.menu();
            case 3:
                Circulo circulo = new Circulo();
                circulo.menu();
        }
    }

    public static int numero() {
        int n;
        System.out.println("Ingresa un numero :");
        while (true) {
            try {
                n = t.nextInt();
                if (n < 0) {
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
