package Ejercicios;
import java.util.Scanner;

public class Desafio2Integrador1 {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Ingresa primer número: ");
        int num1 = t.nextInt();
        System.out.println("Ingresa segundo número: ");
        int num2 = t.nextInt();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.println("Ingresa operación: ");
        int ope = t.nextInt();

        int resultado = (ope == 1) ? (num1 + num2) :
                        (ope == 2) ? (num1 - num2) :
                        (ope == 3) ? (num1 * num2) :
                        (ope == 4) ? (num2 != 0 ? (num1 / num2) : 0) : 0;

        if (ope >= 1 && ope <= 4) {
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("Operación no válida");
        }

    }
}
