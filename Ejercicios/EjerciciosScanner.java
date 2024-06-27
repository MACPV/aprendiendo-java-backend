package Ejercicios;
import java.util.Scanner;
public class EjerciciosScanner {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);

        //Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
        System.out.println("Ingresa tu nombre: ");
        String nombre = t.nextLine();
        System.out.println("Hola "+ nombre);

        //Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
        System.out.println("Ingresa tu edad: ");
        int num = t.nextInt();
        System.out.println("La edad ingresada es: " + num);

        //Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
        System.out.println("Su nombre es " + nombre + " y su edad es " + num);


    }

    
}

