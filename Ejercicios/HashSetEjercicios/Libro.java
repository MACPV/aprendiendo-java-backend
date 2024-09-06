package Ejercicios.HashSetEjercicios;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int nISBN;

    public Libro(String titulo, String autor, int nISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.nISBN = nISBN;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnISBN() {
        return nISBN;
    }

    public void setnISBN(int nISBN) {
        this.nISBN = nISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return nISBN == libro.nISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nISBN);
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                        ", autor='" + autor + '\'' +
                        ", nISBN=" + nISBN
                ;
    }
}
