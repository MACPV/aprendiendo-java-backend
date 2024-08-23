package Ejercicios.POOAvanzado;

public class Equipo {
    private String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // sobreescribe el metodo toString para mostrar el nombre del equipo
    @Override
    public String toString() {
        return "Equipo  " + nombre;
    }
}
