package Ejercicios.CollectionEjercicios;

import java.util.ArrayList;

public class Turnero {
    static ArrayList<Integer> turn = new ArrayList<>();
    static ArrayList<Integer> atendidos = new ArrayList<>();

    public static void main(String[] args) {
        llenadoTurno();
        System.out.println(turn.toString());
        System.out.println(turn.size());
        System.out.println(selector());
        bucleRemovedor();
    }


    public static void llenadoTurno() {
        int i = 0;
        while (turn.size() <= (int) (Math.random() * 10) + 10) {
            i++;
            turn.add(i);
        }
    }

    public static int selector() {

        return turn.get((int) (Math.random() * turn.size()));
    }

    public static void removedorTurnoSeleccionado(int index) {

        turn.remove((Integer) (selector()));
    }

    public static void bucleRemovedor() {
        if (turn.isEmpty()) {
            System.out.println("Todos los turnos fueron atendidos");
        } else {
            removedorTurnoSeleccionado(selector());
            System.out.println(turn.toString());
            bucleRemovedor();
        }
    }

    public static void turnoAtendido() {

    }
}
