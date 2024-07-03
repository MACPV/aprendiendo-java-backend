package Ejercicios;
import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {

        String verificador = "wasd1234";
        Scanner t = new Scanner(System.in);

        // Verificar contraseña
        System.out.println("Ingresa una contrasena: ");
        String contrasena = t.nextLine();
        if (contrasena.equals(verificador)) {
            System.out.println("Contrasena correcta");
        } else {
            System.out.println("Contrasena incorrecta");
        }

        // Si el precio es igual o mayor a $100, se aplicará un descuento del 10% y se
        // mostrará el nuevo precio con descuento. De lo contrario, se mostrará el
        // precio original sin descuento
        System.out.println("Ingresa precio del producto: ");
        double precio = t.nextDouble();
        if (precio > 100) {
            precio = precio * 0.9;
            System.out.println("El precio del producto es: " + precio);
        } else {
            System.out.println("El precio del producto es: " + precio);
        }

        // Verificar la edad
        System.out.println("Ingresa edad: ");
        int edad = t.nextInt();
        if (edad > 65) {
            System.out.println("Eres adulto mayor");
        } else if (edad >= 18 && edad <= 64) {
            {
                System.out.println("Eres adulto");
            }
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
