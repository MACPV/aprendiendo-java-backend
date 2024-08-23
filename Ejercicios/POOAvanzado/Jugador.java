package Ejercicios.POOAvanzado;

public class Jugador {
    private String nombre;
    private Equipo equipo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    // sobreescribe el metodo toString para mostrar el nombre del jugador
    @Override
    public String toString() {
        return "Jugador " + nombre;
    }
}

