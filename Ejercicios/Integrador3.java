package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Integrador3 {
    public static void main(String[] args) {
        Random r = new Random();
        char A = (char)(r.nextInt(26) + 'A');
        char a = (char)(r.nextInt(26) + 'a');
        System.out.println(A);
        System.out.println(a);
        char letra = (char) (Math.random()*126);
        System.out.println(letra);

        /*String contra = "aaaaaaaa";
        char[] contraChar = contra.toCharArray();*/
        char[] contraChar = new char[8];

        boolean mayus = false;
        boolean minus = false;
        boolean digit = false;
        int lenght = contraChar.length;

        do {
            for(int j=0; j<contraChar.length; j++) {
                char c = (char) (Math.random()*94+32);
                contraChar[j] = c;
                if(Character.isDigit(c)) {
                    digit = true;
                }
                if(Character.isUpperCase(c)) {
                    mayus = true;
                }
                if(Character.isLowerCase(c)) {
                    minus = true;
                }
            }
        }while(!mayus || !minus || !digit);

        System.out.println(contraChar);

        String[] calificacion = new String[10];

        String[] aprobado, desaprobado, excelente;
        for(int j=0; j<calificacion.length; j++) {
            calificacion[j] = String.valueOf((int) (Math.random()*10+1));
            double nota = Double.parseDouble(calificacion[j]);
            if(nota<=4) {

            }
        }
        System.out.println(Arrays.toString(calificacion));
    }
}
