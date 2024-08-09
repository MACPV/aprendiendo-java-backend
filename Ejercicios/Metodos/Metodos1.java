package Ejercicios.Metodos;

import java.util.Scanner;

public class Metodos1 {

    static Scanner t = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre = ObtenerNombre();
        ImprimirNombre(nombre);
        int edad = ObtenerEdad();
        NombreEdad(nombre,edad);
    }

    public static void ImprimirNombre(String nombre1){

        System.out.println("El nombre es: "+ nombre1);
    }

    public static void NombreEdad(String nombre, int edad){
        System.out.println("Me llamo " + nombre + " y tengo " +edad +" años");
    }

    public static String ObtenerNombre() {
        System.out.println("Ingresa el nombre: ");
        return t.nextLine();

    }
    public static int ObtenerEdad (){
        System.out.println("Ingresa edad: ");
        return t.nextInt();
    }

}
