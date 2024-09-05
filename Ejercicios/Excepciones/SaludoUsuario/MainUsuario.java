package Ejercicios.Excepciones.SaludoUsuario;

import java.util.Scanner;

public class MainUsuario {
    static Scanner t = new Scanner(System.in);
static Usuario usuario = new Usuario();
    public static void main(String[] args) {
        usuarioRegistro();
        mostrarNombre();
    }

    public static void usuarioRegistro() {
        usuario.setNombre(nombreException());
    }

    public static String nombreException() {
        while (true) {
            try {
                System.out.println("Ingresa Nombre:");
                String nombre = t.next();
                char i = nombre.charAt(2);
                if (nombre.length() > 2) {
                    return nombre;
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Debe ser mayor a 2 caracteres");
            } finally {
                System.out.println("Bloque finally ejecutado");
                t.nextLine();
            }
        }
    }

    public static void mostrarNombre() {

        System.out.println("El nombre del Usuario es: " + usuario.getNombre());
    }
}
