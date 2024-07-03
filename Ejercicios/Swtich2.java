package Ejercicios;

import java.util.Scanner;

public class Swtich2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 3: ");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        int num = t.nextInt();
        double area;
        switch (num) {
            case 1:
                System.out.println("Circulo");
                System.out.println("Ingresa el radio: ");
                int r = t.nextInt();
                area = 3.14 * r * r;
                System.out.println("El area de la figura es: " + area);
                break;
            case 2:
                System.out.println("Cuadrado");
                System.out.println("Ingresa el lado: ");
                int l = t.nextInt();
                area = l * l;
                System.out.println("El area de la figura es: " + area);
                break;
            case 3:
                System.out.println("Triángulo");
                System.out.println("Ingresa la altura: ");
                int a = t.nextInt();
                System.out.println("Ingresa la base: ");
                int b = t.nextInt();
                area = a * b;
                System.out.println("El area de la figura es: " + area);
                break;
            default:
                System.out.println("Debe ser del 1 al 3");
                area = 0;
                break;
        }
    }
}
