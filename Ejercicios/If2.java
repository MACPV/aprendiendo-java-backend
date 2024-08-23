package Ejercicios;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        double prestamo = 1680;
        double imensual = 0.0283;
        double meses = 18;
        double pagototal;
        double cuota = (prestamo * (imensual * Math.pow((1 + imensual), meses))) / (Math.pow((1 + imensual), meses) - 1);
        System.out.println(cuota);
        double cuota2 = (prestamo * imensual * (Math.pow((1 + imensual), meses)) / ((Math.pow((1 + imensual), meses) - 1)));
        System.out.println(cuota2);
        pagototal = cuota2 * meses;
        System.out.println(pagototal);
    }
}
