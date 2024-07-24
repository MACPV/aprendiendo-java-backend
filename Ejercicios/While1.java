package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        String opcion = "";
        while (!opcion.equals("5")){
            System.out.println("Elige una opcion:");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolucion");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            opcion = t.nextLine();
        }

        int num =(int) ((Math.random()*20+1));
        System.out.println(num);
        int num2 = 0;
        do {
            System.out.println("Ingresa el número: ");
            num2 = t.nextInt();
            if(num2 < num){
                System.out.println("Escoge un número más grande: ");
            }if(num2 > num){
                System.out.println("Escoge un número más pequeño: ");
            }if(num2 == num){
                System.out.println("Felicidades");
            }
        }while (num != num2);

        t.nextLine();
        String contra = "";
        while (!contra.equals("secreto")){
            System.out.println("Ingresa contraseña");


            contra = t.nextLine();
        }


        System.out.println("Ingresa un número entero: ");
        int num3 = t.nextInt();
        num3 = Math.abs(num3);
        System.out.println(num3);
        int i=0;
        int n = 1;
        if (num3 == 0){
            num3 = 1;
        }
        while (num3 >= n){


                i++;
                n = n * 10;

        }
        System.out.println("El número tiene: " + i + " digitos");


    }
}
