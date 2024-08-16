package Ejercicios.Metodos;

import java.util.Scanner;

public class OracionMetodos {
    static Scanner t = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static int menu(){
        System.out.println("");
        System.out.println("Menú de opciones: ");
        System.out.println("1. Crear oracion");
        System.out.println("2. Borrar oracion");
        System.out.println("3. Mostrar cantidad de caracteres");
        System.out.println("4. Mostrar cantidad de palabras");
        System.out.println("5. Mostrar palabras ordendas alfabeticamente");
        System.out.println("6. Ingresar un numero y devolver la palabra correspondiente");
        System.out.println("7. Ingresar palabra a buscar dentro de la oracion");
        System.out.println("8. Modificar palabra dentro de la oracion");
        System.out.println("9. Agregar contenido a la oración");
        System.out.println("10. Salir");
    return numero();
    }
    public static int numero() {
        int n;
        System.out.println("Escoge una opcion :");
        while (true) {
            try {
                n = t.nextInt();
                if (n < 0) {
                    System.out.println("Por favor, ingresa un número no negativo:");
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
