package Ejercicios;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        // Declara dos variables, y asígnales un valor a cada una de ellas.
        int num1 = 5;
        int num2 = 8;

        // Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en
        // consola. Te animamos a mostrar el resultado dentro de un texto para que se
        // vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;
        int sum = num1 + num2;
        int dif = num2 - num1;
        int mult = num1 * num2;
        int div = num2 / num1;
        int res = num2 % num1;
        System.out.println("La suma de las 2 variables es: " + sum);
        System.out.println("La resta de las 2 variables es: " + dif);
        System.out.println("La multiplicacion de las 2 variables es: " + mult);
        System.out.println("La division de las 2 variables es: " + div);
        System.out.println("El residuo de las 2 variables es: " + res);

        // Posteriormente, pide al usuario que ingrese dos números, guardarlos en
        // variables previamente declaradas, realiza la suma de los números y muestra el
        // resultado en la consola.
        System.out.println("Ingresa el primer numero: ");
        int num3 = t.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num4 = t.nextInt();
        int sum2 = num3 + num4;
        System.out.println("La suma de los 2 numeros es: " + sum2);

        // Compara si el primer número ingresado es mayor al segundo número y muestra el
        // resultado en la consola.
        boolean comp = num3 > num4;
        System.out.println("El primer numero es menor que el segundo: " + comp);

        // Verifica si el primer número ingresado es distinto al segundo número
        // ingresado . Muestra el resultado en consola.
        boolean distinto = num3 == num4;
        System.out.println("Los 2 numeros son iguales: " + distinto);

        // Verifica si el primer número ingresado es divisible por 2 . Muestra el
        // resultado en consola.
        boolean divisble = num3 % 2 == 0;
        System.out.println("El primer numero es divisible por 2: " + divisble);

        // Pide al usuario que ingrese otros 2 números
        System.out.println("Ingresa un tercer número: ");
        int num5 = t.nextInt();
        System.out.println("Ingresa un cuarto número: ");
        int num6 = t.nextInt();

        // Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
        boolean and = num3 > num4 && num5 > num6;
        System.out.println("El primer número es mayor al segundo? y El tercer número es mayor al cuarto?: " + and);

        // Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
        boolean or = num3 > num4 || num5 > num6;
        System.out.println("El primer número es mayor al segundo? o El tercer número es mayor al cuarto?: " + or);

        // Pide al usuario que ingrese su año de nacimiento y almacena el dato en una
        // variable previamente declarada.
        System.out.println("Ingresa tu año de nacimiento:");
        int nacimiento = t.nextInt();

        // Verificación de Edad
        // Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.
        int añoActual = 2024;

        // Calcula la edad actual del usuario, considerando que la cuenta sería
        // ANIOACTUAL - añoNacimiento. Almacena el dato en una variable llamada
        // calculoEdad.
        int calcEdad = añoActual - nacimiento;
        System.out.println("Tu edad es: " + calcEdad);

        // Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un
        // mensaje apropiado.
        boolean edadMayor = calcEdad >= 18;
        System.out.println("Eres mayor de edad?: " + edadMayor);

        // Pide al usuario que ingrese su altura y base y almacena el dato en una
        // variable previamente declarada.
        System.out.println("Ingresa la altura de tu rectangulo: ");
        int altura = t.nextInt();
        System.out.println("Ingresa la base de tu rectangulo: ");
        int base = t.nextInt();

        // Calcula y almacena el perímetro del rectángulo
        int per = 2 * (altura + base);

        // Muestra el resultado del perímetro por consola junto con un mensaje adecuado.
        System.out.println("El perimetro es: " + per);

        // Calcula y almacena el área del rectángulo
        int area = base * altura;

        // Muestra el resultado del área por consola junto con un mensaje adecuado.
        System.out.println("El area es: " + area);

    }
}
