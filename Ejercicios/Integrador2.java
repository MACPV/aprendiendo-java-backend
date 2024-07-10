package Ejercicios;

import java.util.Scanner;

public class Integrador2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa una temperatura: ");
        String temperatura = t.nextLine();
        System.out.println("Ingresa la unidad de la temperatura (C/F): ");
        char unidad = t.next().charAt(0);
        double resultado;
        try{
            double temp = Double.parseDouble(temperatura);
            resultado = switch (unidad){
                case 'C', 'c'->

                    resultado = (temp * 9/5) + 32;
                case 'F', 'f'->
                    resultado =  (temp - 32)*5/9;
                default -> 0;
            };
            if (unidad == 'C' || unidad == 'c'){
                System.out.println(temperatura + " grados Celsius equivale a " + resultado + " grados Fahrenheit.");
            }if (unidad == 'F' || unidad == 'f'){
                System.out.println(temperatura + " grados Fahrenheit equivale a " + resultado + " grados Celsius.");

            }else{
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }

        } catch (NumberFormatException e){
            System.out.println(temperatura + " Debe ser un número");
        }
    }
}
