package Ejercicios.Modelos;

public class MainPunto {
    private static Punto[] puntos;

    public static void main(String[] args) {
        Punto punto1 = new Punto(0, 10);
        Punto punto2 = new Punto(5, 5);
        Punto punto3 = new Punto(10, 0);

        puntos = new Punto[]{punto1, punto2, punto3};
        System.out.println("LA distacia desde al orige hasta el punto es: " + puntos[0].distanciaOrigen());
        System.out.println("La distancia entre 2 puntos es: " + Punto.calcularDistancia(puntos[0], puntos[1]));
        System.out.println("los puntos estan alineados: " + Punto.estanAlineados(puntos[0], puntos[1], puntos[2]));
    }
}
