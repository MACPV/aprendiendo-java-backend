package Ejercicios.POOAvanzado;

import java.util.Objects;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void comer() {
        System.out.println("El perro come carne");
    }

    public void equals() {
    }

    public Perro() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o) ) return false;
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), raza);
    }

    public void dormir() {
        System.out.println("El perro duerme 10 horas al dia");
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                        " raza='" + raza + '\'' +
                        ", edad='" + edad + '\''
                ;
    }
}
