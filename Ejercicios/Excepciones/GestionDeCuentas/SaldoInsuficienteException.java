package Ejercicios.Excepciones.GestionDeCuentas;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super();
    }

    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }

    public SaldoInsuficienteException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
