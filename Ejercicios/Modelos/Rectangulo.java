package Ejercicios.Modelos;

import java.util.Scanner;

public class Rectangulo {

    static Scanner t = new Scanner(System.in);
    private int alto;
    private int ancho;

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;

    }

    public Rectangulo() {

    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        System.out.println("Ingresa altura");
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        System.out.println("Ingresa ancho");
        this.ancho = ancho;
    }

    public int area() {
        return alto * ancho;
    }

    public int perimetro() {
        return 2 * (alto + ancho);
    }

    public void imprimirArea() {
        System.out.println("El área del rectangulo es: " + area());
    }

    public void imprimirPerimetro() {
        System.out.println("El perimetro del rectangulo es: " + perimetro());
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

    public void menu() {
        int op;
        do {
            System.out.println("Elige una opcion");
            System.out.println("1- Crear rectanglo");
            System.out.println("2- Calcular area");
            System.out.println("3- Calcular perimetro");
            System.out.println("4- Salir");
            op = numero();
            switch (numero()) {
                case 1:
                    generaRectangulo();
                case 2:
                    imprimirArea();
                case 3:
                    imprimirPerimetro();
                case 4:
                    System.out.println("Fin");
            }
        } while (op != 4);

    }

    public void generaRectangulo() {
        setAlto(numero());
        setAncho(numero());
    }

}
