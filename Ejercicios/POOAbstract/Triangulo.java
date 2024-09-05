package Ejercicios.POOAbstract;

public class Triangulo extends Figura implements Dibujable {
    private int alto;
    private int base;

    public Triangulo() {
    }

    public Triangulo(int alto, int base) {
        this.alto = alto;
        this.base = base;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public void calcularPerimetro() {
        double hip = Math.sqrt((double) Math.pow(alto, 2) + (double) Math.pow(base, 2));
        System.out.println("El perimetro del triangulo es: " + (base + alto + hip));
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del triangulo es: " + (double) (base * alto / 2));
    }

    @Override
    public void dibujar() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == alto - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
