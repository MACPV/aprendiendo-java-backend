package Ejercicios.POOAbstract;

public class Circulo extends Figura implements Dibujable {

    private double radio;
    private final double pi = 3.14;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del circulo es: " + (Math.pow(radio, 2) * pi));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo es: " + (2 * pi * radio));
    }

    @Override
    public void dibujar() {
        for (int i = (int) -radio; i <= radio; i++){
            for (int j = (int) -radio; j<= radio; j++){
                if ( Math.pow(i,2) + Math.pow(j,2) <= Math.pow(radio,2)){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
