package Ejercicios;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //Longitud de cadena
        System.out.println("Ingresa ena cadena");
        Scanner t = new Scanner(System.in);
        String cadena = t.nextLine();
        System.out.println("La longitud de la cadena es: " + cadena.length());

        //Concatenación de Cadenas
        System.out.println("Ingresa tu nombre: ");
        String nombre = t.nextLine();
        System.out.println("Ingresa tu apellido: ");
        String apellido = t.nextLine();
        System.out.println("Hola " + nombre.concat(" ").concat(apellido));

        //Extracción de Subcadena
        System.out.println("Ingresa una cadena: ");
        String cad = t.nextLine();
        System.out.println("Ingresa el primer indice: ");
        int i1 = t.nextInt() - 1;
        System.out.println("Ingresa el segundo indice: ");
        int i2 = t.nextInt() - 1;

        try {
            System.out.println("La cadena resultado es: " + cad.substring(i1, i2));
        } catch (Exception e){
            System.out.println("Debes ingresar un valor entre 1 y " + cad.length());
        }

    }
}
