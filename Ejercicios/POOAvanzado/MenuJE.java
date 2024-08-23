package Ejercicios.POOAvanzado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MenuJE {
    static Scanner t = new Scanner(System.in);
    static ArrayList<Jugador> jugadores = new ArrayList<>();
    static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int op;
        do {
            System.out.println("");
            System.out.println("1- Crear Jugador");
            System.out.println("2- Crear Equipo");
            System.out.println("3- Asignar Jugador a Equipo");
            System.out.println("4- Mostrar lista de Jugadores");
            System.out.println("5- Mostrar lista de equipos");
            System.out.println("6- Eliminar Jugador");
            System.out.println("7- Eliminar Equipo");
            System.out.println("8- Seleccionar Jugador");
            System.out.println("9- Seleccionar Equipo");
            System.out.println("10- Salir");
            op = numero();
            switch (op) {
                case 1:
                    crearJugador();
                    break;
                case 2:
                    crearEquipo();
                    break;
                case 3:
                    asigancion(jugadores, equipos);
                    break;
                case 4:
                    mostrarJugadores(jugadores);
                    break;
                case 5:
                    mostrarEquipo(equipos);
                    break;
                case 6:
                    eliminarJugador(jugadores);
                    break;
                case 7:
                    eliminarEquipo(equipos);
                    break;
                case 8:
                    System.out.println("8- Seleccionar Jugador");
                    break;
                case 9:
                    System.out.println("9- Seleccionar Equipo");
                    break;
                case 10:
                    System.out.println("Saliste del programa");
                    break;
            }
        } while (op != 10);


    }

    public static void crearJugador() {
        System.out.println("Ingresa nombre de jugador");
        String nom = t.next();
        Jugador jugador = new Jugador();
        jugador.setNombre(nom);
        jugadores.add(jugador);
    }

    public static void crearEquipo() {
        System.out.println("Ingresa nombre de equipo");
        String eq = t.next();
        Equipo equipo = new Equipo();
        equipo.setNombre(eq);
        equipos.add(equipo);
    }

    public static void asigancion(ArrayList<Jugador> jugadores, ArrayList<Equipo> equipos) {
        System.out.println("Selecciona el equipo");
        mostrarEquipo(equipos);
        int op = numero() - 1;

        mostrarJugadores(jugadores);
        System.out.println("Seleccione el jugador ");
        int opj = numero() - 1;
        jugadores.get(opj).setEquipo(equipos.get(op));
    }

    public static void mostrarJugadores(ArrayList<Jugador> jugadores) {
        System.out.println("Lista de jugadores registrados");
        for (int i = 0; i < jugadores.size(); i++) {

            if (jugadores.get(i).getEquipo() == null) {

                System.out.println((i + 1) + "- " + jugadores.get(i).toString());
            } else {

                System.out.println((i + 1) + "- " + jugadores.get(i).getNombre() + " " + jugadores.get(i).getEquipo());
            }
        }
    }

    public static void mostrarEquipo(ArrayList<Equipo> equipos) {
        System.out.println("Lista de equipos registrados");
        for (int i = 0; i < equipos.size(); i++) {

            System.out.println((i + 1) + "- " + equipos.get(i).toString());
        }
    }

    public static void eliminarJugador(ArrayList<Jugador> jugadores) {
        System.out.println("6- Eliminar Jugador");
        mostrarJugadores(jugadores);
        int el = numero() - 1;
        jugadores.remove(el);

    }

    public static void eliminarEquipo(ArrayList<Equipo> equipos){
        System.out.println("7- Eliminar Equipo");
        mostrarEquipo(equipos);
        int el = numero() - 1;
        equipos.remove(el);
    }

    public static int numero() {
        int n;
        System.out.println("Ingresa un numero :");
        while (true) {
            try {
                n = t.nextInt();
                if (n < 0) {
                    System.out.println("Por favor, ingresa una opcion valida:");
                } else {
                    return n;
                }
            } catch (Exception e) {
                System.out.println("No ingresaste un número válido, intenta nuevamente:");
                t.next();
            }
        }
    }
}
