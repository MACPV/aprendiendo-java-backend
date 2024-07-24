package Ejercicios;

import java.util.Scanner;

public class wrappers1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa un número");
        String cad = t.nextLine();
        double double1 = 0;

        try {
            double1 = Double.valueOf(cad);
            System.out.println(cad);
            System.out.println(double1);
        }catch (Exception e) {
            System.out.println(cad + " NO ES UN NUMERO");
        }

        System.out.println("Ingresa un numero");
        String cad2 = t.nextLine();
        int int1 = 0;

        try {
            int1 = Integer.parseInt(cad2);
            System.out.println(cad2);
            System.out.println(int1);
        }catch (Exception e) {
            System.out.println(cad2 + " NO ES UN NUMERO ENTERO");
        }

        System.out.println("Ingresa una cadena");
        String cad3 = t.nextLine();
        boolean bool1 = true;
        int i = 0;
        while(i < cad3.length()){
            if (!Character.isLetter(cad3.charAt(i))) {
                bool1 = false;
                break;
            }
            i++;
        }
        if (bool1) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }

        System.out.println("Ingresa una cadena");
        String cad4 = t.nextLine();
        boolean bool2 = true;
        int j = 0;
        while(j < cad4.length()){
            if (!Character.isWhitespace(cad3.charAt(j))) {
                bool2 = false;
                break;
            }
            j++;
        }
        if (bool2) {
            System.out.println("La cadena no contiene espacios.");
        } else {
            System.out.println("La cadena contiene espacios.");
        }

        System.out.println("Introduce el valor entero del número");
        String cadInt = t.nextLine();
        System.out.println("Introduce el valor decimal del numero");
        String cadDec = t.nextLine();

        try {
            Integer numeroEntero = Integer.valueOf(cadInt);

            Double numeroDecimal = Double.valueOf(cadDec)/Math.pow(10,cadDec.length());

            Double suma = numeroEntero + numeroDecimal;

            System.out.println("La suma de " + numeroEntero + " y " + numeroDecimal + " es: " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Una de las cadenas introducidas no es un número válido.");
        }

        System.out.println("Ingresa un nummero");
        int numero = t.nextInt();
        String cadNum = String.valueOf(cadInt);
        int k = 0;
        int cont = 0;
        while (k < cadNum.length()){
            if (Character.isDigit(cadNum.charAt(i))) {
                cont++;
            }
            k++;
        }
        System.out.println("El número de dígitos en el número introducido es: " + cont);

    }
}
