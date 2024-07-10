package Ejercicios;

import java.util.Scanner;

public class Integrador2d2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa una contraseña: ");
        String contraseña = t.nextLine();
        String contra = contraseña.toLowerCase();
        String Contra = contraseña.toUpperCase();
        boolean l = false;
        int d = 0;
        int especial = 0;
        int minus = 0;
        int mayus = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (contraseña.charAt(i) == Contra.charAt(i)) {
                mayus++;
            }
            if (contraseña.charAt(i) == contra.charAt(i)) {
                minus++;
            }
            if (Character.isDigit(c)){
                d++;
            }
            if (!Character.isLetterOrDigit(c)){
                especial++;
            }
        }
        if (contraseña.length() >= 8){
            l = true;
        }
        System.out.println("Número de minúsculas: " + minus);
        System.out.println("Número de mayúsculas: " + mayus);
        System.out.println("Número de dígitos: " + d);
        System.out.println("Número de caracteres especiales: " + especial);
        System.out.println("Longitud adecuada: " + l);

        if (l && minus > 0 && mayus > 0 && d > 0 && especial > 0) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }
}
