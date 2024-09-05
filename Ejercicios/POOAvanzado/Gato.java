package Ejercicios.POOAvanzado;

public class Gato extends Animal {

    private String color;

    public Gato(String nombre, String edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public void comer() {
        System.out.println("El gato come peces");
    }

    public void dormir() {
        System.out.println("El gato duerme 14 horas");
    }

    public Gato() {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "Gato " + nombre + " Edad " + edad + " color " + color;
    }
}
