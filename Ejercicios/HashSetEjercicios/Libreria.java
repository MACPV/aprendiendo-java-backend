package Ejercicios.HashSetEjercicios;

import java.util.HashSet;

public class Libreria {
    private HashSet<Libro> libros ;

    public void agregarLibro(Libro libro) {
        if (verificacion(libro)) {
            System.out.println("Libro ya en existencia");
        } else {
            libros.add(libro);
            System.out.println("Libro agregado a la libreria");
        }
    }

    public Libreria(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public Libreria() {
        libros = new HashSet<>();
    }

    public void eliminarLibro(Libro libro) {
        if (verificacion(libro)) {
            libros.remove(libro);
            System.out.println("Libro eliminado de la libreria");
        } else {
            System.out.println("El libro no existe en la libreria");
        }

    }

    public boolean verificacion(Libro libro) {

        return libros.contains(libro);
    }
    public void mostrarCatalogo(){
        System.out.println("Los libros existentes son");
        for ( Libro l : libros){
            System.out.println(getLibros().toString());;
        }
    }
}
