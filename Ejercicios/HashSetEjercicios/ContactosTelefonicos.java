package Ejercicios.HashSetEjercicios;

import java.util.Scanner;

public class ContactosTelefonicos {
    static Scanner t = new Scanner(System.in);
    static GestorDeContactos gestorDeContactos = new GestorDeContactos();

    public static void main(String[] args) {
        bucle();
    }

    public static void menu() {
        System.out.println();
        System.out.println("----ArrayList----");
        System.out.println("1- registrar Contacto");
        System.out.println("2- eliminar Contacto");
        System.out.println("3- mostrar registro");
        System.out.println("----HashSet----");
        System.out.println("4- registrar Contacto");
        System.out.println("5- eliminar Contacto");
        System.out.println("6- mostrar registro");
        System.out.println("7- SALIR");
    }

    public static void bucle() {
        boolean bucle = true;
        while (bucle) {
            menu();
            switch (op()) {
                case 1:
                    gestorDeContactos.agregarContactoArrayList(gestorDeContactos.registroContacto());
                    break;
                case 2:
                    gestorDeContactos.eliminarContactoArrayList();
                    break;
                case 3:
                    System.out.println("Registro de contactos almacenados");
                    gestorDeContactos.mostrarArrayList();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    bucle = false;
                    break;
            }
        }
    }

    public static int op() {
        while (true) {
            try {
                System.out.print("Ingresa opción: ");
                return t.nextInt();
            } catch (Exception e) {
                System.out.println();
                t.nextLine();
            }
        }
    }
}
