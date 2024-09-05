package Ejercicios.Excepciones.DivisionSegura.Servicios;

import Ejercicios.Excepciones.DivisionSegura.Modelo.Operacion;

import java.util.Scanner;

public class CalculadorService {
    private static final Scanner t = new Scanner(System.in);

    public Operacion obtenerDivision() {
        double numerador = obtenerNumeradorDelUsuario("Ingresa numerador");
        double denominador = obtenerDenominadorSeguro();
        return new Operacion(numerador, denominador);
    }

    private double obtenerNumeradorDelUsuario(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return Double.parseDouble(t.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido");
            }
        }
    }

    private double obtenerDenominadorSeguro() {
        while (true) {
            double denominador = obtenerNumeradorDelUsuario("Ingresa denominador, NO puede ser cero");
            if (denominador != 0) {
                return denominador;
            } System.out.println("El denominador no puede ser cero, Otra vez");
        }
    }

    public double realizaDivision(Operacion operacion) {

        return operacion.getNumerador() / operacion.getDenominador();
    }

}
