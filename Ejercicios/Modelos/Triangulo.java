package Ejercicios.Modelos;

import java.util.Scanner;

public class Triangulo {
    private int altura;
    private int base;
    static Scanner t = new Scanner(System.in);

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        System.out.println("Ingresa alto");
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        System.out.println("Ingresa base");
        this.base = base;
    }

    public Triangulo(int alto, int base) {
        this.base = base;
        this.altura = alto;
    }

    public Triangulo() {

    }

    public int area() {
        return (base * altura) / 2;
    }

    public double perimetro() {
        double hip = Math.sqrt((double) Math.pow(altura, 2) + (double) Math.pow(base, 2));
        return base + altura + hip;
    }

    public void imprimirArea() {
        System.out.println("El área del triangulo es: " + area());
    }

    public void imprimirPerimetro() {
        System.out.println("El perimetro del triangulo es: " + perimetro());
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
            switch (op) {
                case 1:
                    generaTriangulo();
                    break;
                case 2:
                    imprimirArea();
                    break;
                case 3:
                    imprimirPerimetro();
                    break;
                case 4:
                    System.out.println("Fin");
                    break;
            }
        } while (op != 4);

    }

    public void generaTriangulo() {
        setAltura(numero());
        setBase(numero());
    }
}
