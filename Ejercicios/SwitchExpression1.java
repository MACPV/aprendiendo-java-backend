package Ejercicios;

import java.util.Scanner;

public class SwitchExpression1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 7: ");
        int num = t.nextInt();

        String habile = switch (num) {
            case 1, 2, 3, 4, 5 -> "Es un dia habil";

            default -> "No es un día habil";
        };
        System.out.println(habile);

        System.out.println("Escoge una de las 2 figuras: ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");

        int figura = t.nextInt();

        double area = switch (figura) {
            case 1 -> {
                System.out.println("Cuadrado");
                System.out.println("Ingresa el lado: ");
                int lado = t.nextInt();
                yield lado * lado;
            }
            case 2 -> {
                System.out.println("Circulo");
                System.out.println("Ingresa el radio: ");
                int radio = t.nextInt();
                yield 3.14 * radio * radio;
            }
            default -> {
                System.out.println("Opcion no valida");
                yield 0;
            }
        };
        System.out.println("El area de la figura es: " + area);
    }
}
