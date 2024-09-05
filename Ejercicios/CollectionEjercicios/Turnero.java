package Ejercicios.CollectionEjercicios;

import java.util.ArrayList;

public class Turnero {
    static ArrayList<Integer> turn = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void agregarTurno() {
        turn.add((int) (Math.random() * 1000));
    }
    public static void llenadoTurno(){
        while (true){
            agregarTurno();
        }
    }
}
