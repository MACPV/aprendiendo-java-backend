package Ejercicios.Metodos;

import java.util.Scanner;

public class PrimosRecursivo {
    static Scanner t = new Scanner(System.in);
    static boolean primo;

    public static void main(String[] args) {
        int num;
        do {
            num = numero();
            if (num != 0) {

                primo = primoVal(num, num - 1);
                System.out.println(valBoolean(primo));
            }else {
                System.out.println("Ingresaste 0, fin de programa");
            }
        } while (num != 0);

    }


    public static boolean valBoolean(boolean p) {

        if (p) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
        return p;
    }

    public static boolean val(Integer n, Integer i) {
        return n % i == 0;
    }

    public static boolean primoVal(Integer n, Integer i) {

        if (i == 1) {
            return true;
        }
        if (val(n, i)) {
            return false;
        }

        return primoVal(n, i - 1);
    }


    public static Integer numero() {
        int n;
        System.out.println("Ingresa un numero");
        while (true) {
            try {
                n = t.nextInt();
                return n;
            } catch (Exception e) {

                System.out.println("No ingresó un numero, intente nuevamente:");
                t.next();
            }
        }
    }

}
