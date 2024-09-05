package Ejercicios.POOAbstract;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Libro extends ItemBiblioteca implements Catalogable {
    private String nombreLibro;
    private String autor;
    private boolean prestado;
    private int numPaginas;
    private int cantEjemplares;
    private LocalDate fechaLimite;
    private LocalDate fechaDevolucion;

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Libro() {
    }

    public Libro(String nombreLibro, String autor, int cantEjemplares, int numPaginas) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.cantEjemplares = cantEjemplares;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public void prestar() {
        if (this.cantEjemplares == 0) {
            System.out.println("No se puede prestar, 0 STOCK");
        } else {
            this.cantEjemplares--;
            System.out.println("Stock actualizado, cantidad disponilbe: " + getCantEjemplares());
        }
    }

    @Override
    public void devolver() {
        this.cantEjemplares++;
        System.out.println("Stock actualizado, cantidad disponilbe: " + getCantEjemplares());
    }

    @Override
    public void calcularMultas() {
        if (this.fechaDevolucion.isAfter(fechaLimite)) {
            System.out.println("La multa es: $" + (ChronoUnit.DAYS.between(fechaLimite, fechaDevolucion) * 1.2));
        } else System.out.println("La multa es: $0");
    }

    @Override
    public void obtenerInformacion() {
        System.out.println(this.nombreLibro + ": Autor " + this.autor + " cantidad disponible: " + this.cantEjemplares + " cantidad de páginas: " + this.numPaginas);
    }
}
