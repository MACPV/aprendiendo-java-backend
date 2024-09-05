package Ejercicios.Enum;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Aplication {
    static List<DiaSemana> diaSemanas = new ArrayList<>();
    static List<DiaSemana> randomDiaSemana = new ArrayList<>();
    static String[] coloresHexadecimal = {"FF000", "FFFF00", "0000FF", "FF00FF", "00FF00"};

    public static void main(String[] args) {
        randomDiaDeLaSemana();
        for (int i = 0; i < randomDiaSemana.size(); i++) {
            imprimirDiaLaboral(randomDiaSemana.get(i));
        }
        hexacolor();
    }

    public static void randomDiaDeLaSemana() {
        Collections.addAll(diaSemanas, DiaSemana.values());
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            DiaSemana randomDia = diaSemanas.get(random.nextInt(diaSemanas.size()));
            randomDiaSemana.add(randomDia);
        }
    }

    public static void imprimirDiaLaboral(DiaSemana a) {


        if (a.esDiaLaborable(a)) {
            System.out.println("El día " + a + " es laboralbe");
        } else System.out.println("El día " + a + " no es laboralbe");
    }

    public static void hexacolor() {
        for (String hexadeciaml : coloresHexadecimal) {
            Color color = ConvertidorColor.convertirHexadecimal(hexadeciaml);

            if (color != null) {
                System.out.println(hexadeciaml + " Es un color primario " + color.name());

            } else {
                System.out.println(hexadeciaml + " no es un color primario");
            }
        }
    }
}
