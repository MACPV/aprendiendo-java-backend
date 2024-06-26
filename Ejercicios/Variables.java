package Ejercicios;

public class Variables {
    public static void main(String[] args) {

        /*
         * Declara una variable por cada uno de los siguientes tipos de dato, asignando
         * un valor (nombre y valor de tu preferencia):
         * 
         * boolean
         * 
         * char
         * 
         * String
         * 
         * Int
         * 
         * long
         * 
         * float
         */

        Boolean boolean1 = true;
        char char1 = 'a';
        String string1 = "variables";
        int int1 = 1;
        long long1 = 4L;
        float float1 = 1.0f;
        double double1 = 1.0;
        System.out.println("Boolean: " + boolean1);
        System.out.println("char: " + char1);
        System.out.println("String: " + string1);
        System.out.println("int: " + int1);
        System.out.println("long: " + long1);
        System.out.println("float: " + float1);
        System.out.println("double: " + double1);

        /*
         * Declara una nueva variable para almacenar tu edad y otra para almacenar tu
         * nombre e imprimir en pantalla un texto que diga “Mi nombre es [nombre], y
         * tengo [edad] años”.
         */

        int edad = 25;
        String nombre = "Aldo";
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");

        /*
         * Declara una variable llamada mensajeBienvenida y asigna como valor
         * "Bienvenido a Java". Asegúrate de elegir el tipo de variable más apropiado
         * para almacenar un mensaje de texto.
         * 
         * Declara una variable llamada temperaturaActual y asigna como valor "19".
         * Selecciona el tipo de variable que permita representar la temperatura de
         * manera precisa.
         * 
         * Declara una variable llamada datoLogico y asigna como valor "true". Elige el
         * tipo de variable adecuado para almacenar valores lógicos.
         */

        String mensajeBienvenida = "Bienvenido a Java";
        double temperaturaActual = 19;
        boolean datoLogico = true;
        System.out.println(mensajeBienvenida);
        System.out.println("La temperatura actual es: " + temperaturaActual + " grados Celcius");
        ;
        System.out.println("El dato lógico es: " + datoLogico);
    }
}
