package Ejercicios.POOAbstract;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private List<Libro> librosprestados;

    public Persona() {
        this.librosprestados = new ArrayList<>();
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.librosprestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void prestarLibro(Libro libro) {
        if (libro.getCantEjemplares() > 0) {
            librosprestados.add(libro);
            libro.prestar();
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosprestados.remove(libro)) {
            libro.devolver();
        }
    }

    public List<Libro> getLibrosprestados() {
        return new ArrayList<>(librosprestados);
    }

    public void mostrarInfo() {
        System.out.println(this.nombre + " " + this.apellido);
    }
}
