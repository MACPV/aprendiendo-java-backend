package Ejercicios.HashSetEjercicios;

import java.util.HashSet;
import java.util.Scanner;

public class RegistroDeInvitados {
    static HashSet<String> invitados = new HashSet<>();
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        bucle();
    }

    public static void agregarInvitado(String nombre) {

        if (invitados.contains(nombre)){
            System.out.println("El invitado ya está registrado");
        }else {
            invitados.add(nombre);
            System.out.println("Invitado registrado");
        }
        t.nextLine();
    }

    public static void eliminarInvitado(String nombre) {
        if (invitados.contains(nombre)) {
            invitados.remove(nombre);
            System.out.println("Invitado eliminado");
        }else {
            System.out.println("El usuario no exite");
        }
    }

    public static void mostrarInvitados() {
        System.out.println(invitados.toString());
    }

    public static void menu() {
        System.out.println();
        System.out.println("1- Agregar Invitados");
        System.out.println("2- Eliminar Invitados");
        System.out.println("3- Mostrar lista actual de invitados");
        System.out.println("4- Salir");
    }

    public static void bucle() {
        int op;

        do {
            menu();
            op = numero();
            switch (op) {
                case 1:
                    System.out.println("Ingresa el nombre del invitado");
                    agregarInvitado(t.next());
                    break;
                case 2:
                    System.out.println("Ingreasa el nombre a eliminar");
                    eliminarInvitado(t.next());
                    break;
                case 3:
                    mostrarInvitados();
                    break;
                case 4:
                    System.out.println("Gracias");
                    break;
            }
        } while (op != 4);
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
}
