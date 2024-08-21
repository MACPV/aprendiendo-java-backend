package Ejercicios.Modelos;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Libro() {

    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void calculoPaginas(int pag) {
        setPaginas(pag * 7);
    }

    public void imprimirDetalles() {
        System.out.println("El título del libro es " + getTitulo());
        System.out.println("El autor del libro es " + getAutor());
        System.out.println("El total de pagina es " + getPaginas());
    }

    public void imprimirLibros(ArrayList<String> lista) {
        for (String lib : lista) {
            System.out.println(getTitulo());
        }
    }
}
