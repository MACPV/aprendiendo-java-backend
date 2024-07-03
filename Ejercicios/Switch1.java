package Ejercicios;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Ingresa un nunmero del 1 al 7: ");
        int num = t.nextInt();

        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Debe ser del 1 al 7");
                break;
        }

        System.out.println("Ingresa un nunmero del 1 al 5: ");
        int num2 = t.nextInt();

        switch (num2) {
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 2:
                System.out.println("deficiente");
                break;
            case 3:
                System.out.println("Suficiente");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresalinete");
                break;
            default:
                System.out.println("Debe ser del 1 al 5");
                break;
        }

        System.out.println("Ingresa un nunmero del 1 al 3: ");
        int num3 = t.nextInt();

        switch (num3) {
            case 1:
                System.out.println("Guerdar");
                break;
            case 2:
                System.out.println("Cargar");
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Debe ser del 1 al 3");
                break;
        }
    }
}
