package Ejercicios.Excepciones.DivisionSegura.Modelo;

public class Operacion {
    private double numerador;
    private double denominador;

    public Operacion() {
    }

    public Operacion(double numerador, double denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double division() {
        return this.numerador / this.denominador;
    }
}
