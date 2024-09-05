package Ejercicios.POOAvanzado;

import java.util.Objects;

public class Moto extends Vehiculo{
    private String cilindrada;

    public Moto() {
    }

    public Moto(String marca, String modelo, String cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return Objects.equals(cilindrada, moto.cilindrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cilindrada);
    }
}
