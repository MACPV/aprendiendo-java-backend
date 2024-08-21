package Ejercicios.Modelos;

public class Punto {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punto() {

    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanciaOrigen() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double calcularDistancia(Punto p1, Punto p2) {
        double distanciaX = p2.getX() - p1.getX();
        double distanciaY = p2.getY() - p1.getY();
        return Math.sqrt(Math.pow(distanciaY, 2) + Math.pow(distanciaY, 2));
    }

    public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
        double determinante = p1.getX() * (p2.getY() - p3.getY()) +
                p2.getX() * (p3.getY() - p1.getY()) +
                p3.getX() * (p1.getY() - p2.getY());
        return determinante == 0;
    }
}
