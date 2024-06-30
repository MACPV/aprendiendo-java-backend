package Ejercicios;
import java.util.Scanner;


public class Integrador1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = t.nextInt();
        System.out.println("El número ingresado es: " + num);

        String comp = (num % 2 == 0) ? "El número es par":"El número es impar";
        System.out.println(comp);
    }
    
}
