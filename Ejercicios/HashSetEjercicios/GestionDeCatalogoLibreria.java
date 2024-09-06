package Ejercicios.HashSetEjercicios;

import java.util.HashSet;
import java.util.Scanner;

public class GestionDeCatalogoLibreria {
    static Scanner t = new Scanner(System.in);
    static Libreria libreria = new Libreria();
    static Libro libro = new Libro();

    public static void main(String[] args) {
        bucle();
    }

    public static void menu() {
        System.out.println();
        System.out.println("1- Agregar libro");
        System.out.println("2- Eliminar libro");
        System.out.println("3- Mostrar catálogo actual");
        System.out.println("4- Salir");
    }

    public static void bucle() {
        boolean b = true;
        while (b) {
            menu();
            switch (numero()) {
                case 1:
                    libreria.agregarLibro(agregarLibroO());
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    mostrarCatalogo();
                    break;
                case 4:
                    b = false;
                    System.out.println("Gracias por usar");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + numero());
            }

        }
    }

    public static int numero() {
        while (true) {
            try {
                int n = t.nextInt();
                t.nextLine();
                return n;
            } catch (Exception e) {
                System.out.println("Un valor entero por favor");
                t.nextLine();
            }
        }
    }

    public static Libro agregarLibroO() {
        Libro l = new Libro() ;
        System.out.print("Ingresa Titulo del libro: ");
        l.setTitulo(t.nextLine());
        System.out.print("Ingresa Autor del libro: ");
        l.setAutor(t.nextLine());
        System.out.print("Ingresa numero de ISBN del libro: ");
        l.setnISBN(t.nextInt());
        return l;
    }

    public static void eliminarLibro() {
        System.out.println("Ingresa el ISBN del libro a eliminar");
        int eliminarISBN = numero();
        Libro libroEliminar = null;
        for (Libro l : libreria.getLibros()) {
            if (l.getnISBN() == eliminarISBN) {
                libroEliminar = l;
                break;
            }
        }
        if (libroEliminar != null) {
            libreria.eliminarLibro(libroEliminar);
            System.out.println("Libro eliminado");
        } else {
            System.out.println("No se encontró libro a eliminar");
        }
    }

    public static void mostrarCatalogo() {
        for (Libro l : libreria.getLibros()) {
            System.out.println(l.toString());
        }
    }
}
