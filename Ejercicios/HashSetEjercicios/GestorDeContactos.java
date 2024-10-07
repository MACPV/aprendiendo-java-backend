package Ejercicios.HashSetEjercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Iterator;

public class GestorDeContactos {
    static Scanner t = new Scanner(System.in);
    private ArrayList<Contacto> contactoArrayList = new ArrayList<>();
    private HashSet<Contacto> contactoHashSet = new HashSet<>();
    private Contacto contacto = new Contacto();

    public void agregarContactoArrayList(Contacto contacto) {
        if (contactoArrayList.isEmpty()) {
            contactoArrayList.add(contacto);
            System.out.println("Contacto agregado");
        } else {
            for (Contacto c : contactoArrayList) {
                if (contactoArrayList.contains(contacto)) {
                    System.out.println("Contacto existente");
                    break;
                }
            }
        }
    }

    public GestorDeContactos() {

    }

    public GestorDeContactos(ArrayList<Contacto> contactoArrayList, HashSet<Contacto> contactoHashSet, Contacto contacto) {
        this.contactoArrayList = contactoArrayList;
        this.contactoHashSet = contactoHashSet;
        this.contacto = contacto;
    }

    public void eliminarContactoArrayList() {
        System.out.println("Ingresa nombre de contacto a eliminar");
        String nombre = t.nextLine();
        boolean encontrado = false;

        Iterator<Contacto> iterator = contactoArrayList.iterator();

        while (iterator.hasNext()) {
            Contacto c = iterator.next();
            if (c.getNombre().equals(nombre)) {
                iterator.remove();  // Usamos el método remove del Iterator
                System.out.println("Contacto eliminado");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado");
        }
    }

    public void agregarContactoHashSet(Contacto contacto) {
        for (Contacto c : contactoHashSet) {
            if (contactoHashSet.contains(contacto)) {
                System.out.println("Contacto existente");
                break;
            } else {
                contactoHashSet.add(contacto);
                System.out.println("Contacto agregado");
            }
        }
    }

    public void eliminarContactoHashSet() {
        System.out.println("Ingresa nombre de contacto a eliminar");
        String nombre = t.nextLine();
        for (Contacto c : contactoHashSet) {
            if (Objects.equals(c.getNombre(), nombre)) {
                contactoHashSet.remove(c);
                System.out.println("Contacto eliminado");
            } else {
                System.out.println("Contacto no encontrado");
            }
        }
    }

    public Contacto registroContacto() {
        Contacto c = new Contacto();
        System.out.print("Ingresa nombre de contacto: ");
        c.setNombre(t.nextLine());
        System.out.print("Ingresa email: ");
        c.setEmail(t.nextLine());
        System.out.print("Ingresa número de contacto: ");
        c.setNumTelefonico(t.nextInt());
        t.nextLine();
        return c;
    }

    public void mostrarArrayList() {
        for (Contacto value : contactoArrayList) {
            System.out.println(value.toString());

        }
    }
}
