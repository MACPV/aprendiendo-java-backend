package Ejercicios.GestionDeProductos;

import java.util.Scanner;

public class MenuInteractivo {
    static Scanner t = new Scanner(System.in);
    public MenuInteractivo() {
    }
    public void menu(){
        System.out.println("Menu");
        System.out.println("1- Agregar producto al carrito");
        System.out.println("2- Ver el carrito");
        System.out.println("3- Realiza la compra");
        System.out.println("4- Volver a comprar");
        System.out.println("5-  Salir del sistema");
    }
    public void selector(){
        menu();
        int op = opcion();
    }
    public int opcion(){
        while (true){
            try{
                System.out.println("Ingresa una opcion del menu");
                return t.nextInt();
            }catch (Exception e){
                System.out.println("Ingresa un valor valido:");
                t.nextLine();
            }
        }
    }
}
