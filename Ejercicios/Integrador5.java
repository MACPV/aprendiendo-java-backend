package Ejercicios;

import java.util.*;

public class Integrador5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        String oracion = "";

        boolean salir = true;
        try {
            while (salir) {
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
                System.out.println("Ingresa opcion:");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Crear oracion: ");
                        oracion = t.nextLine();
                        System.out.println(oracion);
                        break;
                    case 2:
                        System.out.println("Borrar oracion: "); 
                        oracion = "";
                        System.out.println(oracion);
                        break;
                    case 3:
                        System.out.println("Mostrar cantidad de caracteres");
                        System.out.println(oracion.length());
                        break;
                    case 4:
                        System.out.println("Mostrar cantidad de palabras");
                        String[] palabras = oracion.split(" ");
                        System.out.println(palabras);
                        break;
                    case 5:
                        System.out.println("Mostrar palabras ordendas alfabeticamente");

                        String[] palabras2 = oracion.split(" ");
                        Arrays.sort(palabras2);
                        System.out.println(Arrays.toString(palabras2));
                        break;
                    default:
                        salir = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }

    }
}
