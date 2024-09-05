package Ejercicios.POOAbstract;

public class MainFguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        circulo.setRadio(10);
        rectangulo.setAlto(10);
        rectangulo.setAncho(10);
        triangulo.setAlto(10);
        triangulo.setBase(10);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        circulo.dibujar();
        rectangulo.dibujar();
        triangulo.dibujar();

    }
}
