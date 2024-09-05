package Ejercicios.POOAbstract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    static Scanner t = new Scanner(System.in);
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int op = 0;
        do {
            System.out.println("Menu");
            System.out.println("1- Agregar Libro");
            System.out.println("2- Mostrar libros registrados");
            System.out.println("3- Mostrar detalle de Libro");
            System.out.println("4- Registrar Usuario");
            System.out.println("5- Mostrar Usuarios");
            System.out.println("6- Prestar Libro");
            System.out.println("7- Devolver Libro");
            System.out.println("8- Mostrar Libros en stock");
            System.out.println("9- Salir");
            op = t.nextInt();
            switch (op) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    mostrarinfo();
                    break;
                case 4:
                    registraPersona();
                    break;
                case 5:
                    mostrarPersonas();
                    break;
                case 6:
                    prestarLibro();
                    break;
                case 7:
                    devolverLibro();
                    break;
                case 8:
                    librosDisponibles();
                    break;
                case 9:
                    op = 9;
                    break;
            }

        } while (op != 9);
    }

    public static void agregarLibro() {
        Libro libro = new Libro();
        System.out.println("Ingresa autor");
        libro.setAutor(t.next());
        System.out.println("Ingresa nombre de libro");
        libro.setNombreLibro(t.next());
        System.out.println("ingresa numero de paginas");
        libro.setNumPaginas(t.nextInt());
        libro.setCantEjemplares(1);
        libros.add(libro);
        System.out.println("Libro registrado, regresandoa a Menu");
    }

    public static void mostrarinfo() {
        System.out.println("Ingresa indice del libro a mostrar informacion");
        mostrarLibros();
        int index = t.nextInt() - 1;
        libros.get(index).obtenerInformacion();
    }

    public static void mostrarLibros() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + "_ " + libros.get(i).getNombreLibro());
            ;
        }
    }

    public static void registraPersona() {
        Persona persona = new Persona();
        System.out.println("Ingresa nombre de la persona");
        persona.setNombre(t.next());
        System.out.println("Ingresa apellido de la persona");
        persona.setApellido(t.next());
        personas.add(persona);
    }

    public static void mostrarPersonas() {
        for (int i = 0; i < personas.size(); i++) {
            System.out.print((i + 1) + "_ ");
            personas.get(i).mostrarInfo();
        }
    }

    public static void prestarLibro() {
        int op;
        int u;
        System.out.println("¿Que libro deseas prestar?");
        mostrarLibros();
        op = t.nextInt() - 1;
        System.out.println("¿Que usuario lo pide?");
        mostrarPersonas();
        u = t.nextInt() - 1;
        libros.get(op).setCantEjemplares(0);
        personas.get(u).prestarLibro(libros.get(op));
        System.out.println("Libro prestado");
    }

    public static void devolverLibro() {
        int op;
        int u;
        System.out.println("¿Que libro deseas devolver?");
        mostrarLibros();
        op = t.nextInt()-1;
        System.out.println("¿Que usuario lo devuelve?");
        mostrarPersonas();
        u = t.nextInt() - 1;
        Persona persona = personas.get(u);
        Libro libro = libros.get(op);
        if (persona.getLibrosprestados().contains(libro)) {
            persona.devolverLibro(libro);
            System.out.println("Libro devuelto");
        } else {
            System.out.println("El usuario no tiene el libro");
        }
    }

    public static void librosDisponibles() {
        System.out.println("Libros disponibles a prestamo");
        for (Libro libro : libros) {
            if (libro.getCantEjemplares() > 0) {
                System.out.println(libro.getNombreLibro());
            }
        }
    }
}
