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
                    seleccionarJugador();
                    break;
                case 9:
                    seleccionarEquipo();
                    break;
                case 10:
                    System.out.println("Saliste del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 10);


    }

    public static void seleccionarJugador() {
        System.out.println("8- Seleccionar Jugador");
        mostrarJugadores(jugadores);
        System.out.println("Seleccione el número del jugador:");
        int opj = numero() - 1;
        if (opj >= 0 && opj < jugadores.size()) {
            Jugador jugadorSeleccionado = jugadores.get(opj);
            menuJugador(jugadorSeleccionado);
        } else {
            System.out.println("Selección inválida.");
        }
    }

    public static void menuJugador(Jugador jugador) {
        int op;
        do {
            System.out.println("\nMenú de Jugador: " + jugador.getNombre());
            System.out.println("1- Ver detalles");
            System.out.println("2- Cambiar nombre");
            System.out.println("3- Cambiar equipo");
            System.out.println("4- Regresar al menú principal");
            op = numero();
            switch (op) {
                case 1:
                    System.out.println(jugador);
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo nombre:");
                    jugador.setNombre(t.next());
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Regresando al menú principal");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 4);
    }

    public static void seleccionarEquipo() {
        System.out.println("9- Seleccionar Equipo");
        mostrarEquipo(equipos);
        System.out.println("Seleccione el número del equipo:");
        int op = numero() - 1;
        if (op >= 0 && op < equipos.size()) {
            Equipo equipoSeleccionado = equipos.get(op);
            menuEquipo(equipoSeleccionado);
        } else {
            System.out.println("Selección inválida.");
        }
    }

    public static void menuEquipo(Equipo equipo) {
        int op;
        do {
            System.out.println("\nMenú de Equipo: " + equipo.getNombre());
            System.out.println("1- Ver detalles");
            System.out.println("2- Cambiar nombre");
            System.out.println("3- Agregar jugador al equipo");
            System.out.println("4- Mostrar jugadores del equipo");
            System.out.println("5- Regresar al menú principal");
            op = numero();
            switch (op) {
                case 1:
                    System.out.println(equipo);
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo nombre:");
                    equipo.setNombre(t.next());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Regresando al menú principal");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 5);
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

    public static void eliminarEquipo(ArrayList<Equipo> equipos) {
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
