package Ejercicios.Modelos;

import java.util.Scanner;

public class Circulo {
    static Scanner t = new Scanner(System.in);
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        System.out.println("Ingresa radio");
        this.radio = radio;
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double area() {
        return 3.14 * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * 3.14 * radio;
    }

    public void imprimirArea() {
        System.out.println("El área del circulo es: " + area() + " con radio: " + radio);
    }

    public void imprimirPerimetro() {
        System.out.println("El perimetro del circulo es: " + perimetro() + " con radio: " + radio);
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
                    generaCirculo();
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

    public void generaCirculo() {

        setRadio(numero());
    }
}
