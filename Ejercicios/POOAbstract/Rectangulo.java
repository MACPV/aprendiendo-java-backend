package Ejercicios.POOAbstract;

public class Rectangulo extends Figura implements Dibujable {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo() {
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es: " + (alto * ancho));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del rectangulo es: " + (2 * (alto + ancho)));
    }

    @Override
    public void dibujar() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
