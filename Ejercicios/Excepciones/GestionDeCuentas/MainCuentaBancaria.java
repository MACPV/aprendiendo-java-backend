package Ejercicios.Excepciones.GestionDeCuentas;

import java.util.Scanner;

public class MainCuentaBancaria {
    static CuentaBancaria cuentaBancaria = new CuentaBancaria();
    static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        gestio();
    }

    public static void gestio() {
        while (true) {
            try {
                cuentaBancaria.setSaldoInicial(monto("Ingresa Saldo Incial"));
                saldoRestante(cuentaBancaria.retirar(retiroSaldo()));
                break;
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());

            }
        }

    }

    public static double monto(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return t.nextDouble();
            } catch (Exception e) {
                System.out.println("Monto no valido");
            } finally {
                t.nextLine();
            }
        }
    }

    public static double retiroSaldo() {
        return monto("Ingresa Monto a retirar");
    }

    public static void saldoRestante(double restante) {
        cuentaBancaria.setSaldoInicial(restante);
        System.out.println("El saldo restante es: " + cuentaBancaria.getSaldoInicial());

    }
}
