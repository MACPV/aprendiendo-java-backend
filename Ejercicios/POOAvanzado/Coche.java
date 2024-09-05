package Ejercicios.POOAvanzado;

import java.util.Objects;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coche coche = (Coche) o;
        return Objects.equals(numPuertas, coche.numPuertas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPuertas);
    }
}
