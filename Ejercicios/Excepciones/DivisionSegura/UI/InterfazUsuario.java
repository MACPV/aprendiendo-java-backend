package Ejercicios.Excepciones.DivisionSegura.UI;

import Ejercicios.Excepciones.DivisionSegura.Modelo.Operacion;
import Ejercicios.Excepciones.DivisionSegura.Servicios.CalculadorService;

public class InterfazUsuario {
    private final CalculadorService calculadorService;

    public InterfazUsuario() {
        this.calculadorService = new CalculadorService();
    }

    public void Iniciar() {
        System.out.println("Division segura");
        Operacion operacion = calculadorService.obtenerDivision();
        double resultado = calculadorService.realizaDivision(operacion);

        mostrarResultado(operacion, resultado);
    }

    private void mostrarResultado(Operacion operacion, double resultado) {
        System.out.println("Resultado de la division");
        System.out.println(operacion.getNumerador() + " / " + operacion.getDenominador() + " = " + resultado);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error" + mensaje);
    }
}
