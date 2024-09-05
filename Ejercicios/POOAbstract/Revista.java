package Ejercicios.POOAbstract;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Revista extends ItemBiblioteca implements Catalogable {
    private int nroEdicion;
    private int cantEjemplares;
    private String nombreRevista;
    private LocalDate fechaLimite;
    private LocalDate fechaDevolucion;

    public Revista() {
    }

    public Revista(int cantEjemplares, int nroEdicion, String nombreRevista) {
        this.cantEjemplares = cantEjemplares;
        this.nroEdicion = nroEdicion;
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public void prestar() {
        if (this.cantEjemplares == 0) {
            System.out.println("No se puede prestar, 0 STOCK");
        } else
            this.cantEjemplares--;
    }

    @Override
    public void devolver() {
        this.cantEjemplares++;
    }

    @Override
    public void calcularMultas() {
        if (this.fechaDevolucion.isAfter(fechaLimite)) {
            System.out.println("La multa es: $" + (ChronoUnit.DAYS.between(fechaLimite, fechaDevolucion) * 2.0));
        } else System.out.println("La multa es: $0");
    }

    @Override
    public void obtenerInformacion() {
        System.out.println(this.nombreRevista + ": Edicion: " + this.nroEdicion + " stock: " + this.cantEjemplares);
    }
}
