package Ejercicios.POOAvanzado;

import java.util.Objects;

public class Animal {
    protected String nombre;
    protected String edad;

    public Animal(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal() {
    }

    public void comer() {
        System.out.println("El animal come");
    }

    public void dormir() {
        System.out.println("El animal duerme");
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nombre, animal.nombre) && Objects.equals(edad, animal.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
