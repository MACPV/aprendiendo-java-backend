package Ejercicios.HashSetEjercicios;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private int numTelefonico;
    private String email;

    public Contacto(String nombre, String email, int numTelefonico) {
        this.nombre = nombre;
        this.email = email;
        this.numTelefonico = numTelefonico;
    }

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(int numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contacto: " +
                nombre + '\'' + " " +
                numTelefonico + " " +
                email + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return numTelefonico == contacto.numTelefonico && Objects.equals(nombre, contacto.nombre) && Objects.equals(email, contacto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numTelefonico, email);
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
