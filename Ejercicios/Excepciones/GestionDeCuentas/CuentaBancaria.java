package Ejercicios.Excepciones.GestionDeCuentas;

public class CuentaBancaria {
    private double saldoInicial;

    public CuentaBancaria(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public CuentaBancaria() {
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double retirar(double retiro) throws SaldoInsuficienteException {

        if (getSaldoInicial() < retiro) {

            throw new SaldoInsuficienteException("El Saldo no es suficiente para retirar");

        }
        return this.saldoInicial - retiro;
    }
}
