package Ejercicios.POOAvanzado;

import java.util.ArrayList;

public class MainAnimal {

    static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Perro("Pulgoso", "12", "Criollo");
        Animal animal2 = new Perro("Manchas", "4", "Pitbull");
        Animal animal3 = new Gato("Bigote", "11", "Negro");
        Animal animal4 = new Gato("Peluche", "3", "Blanco");

        animals.add(new Perro("Pulgoso", "12", "Criollo"));
        animals.add(new Perro("Manchas", "4", "Pitbull"));
        animals.add(new Perro("Oso", "2", "Boxer"));
        animals.add(new Perro("Firulais", "5", "Bulldog"));
        animals.add(new Perro("Boby", "1", "Galgo"));
        animals.add(new Gato("Wary", "7", "Negro"));
        animals.add(new Gato("Bronco", "8", "Blanco"));
        animals.add(new Gato("Terror", "10", "Amarillo"));
        animals.add(new Gato("Princesa", "2", "Rosa"));
        animals.add(new Gato("Tigre", "3", "Gris"));

        System.out.println(animals.toString());

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).toString());
            System.out.println("Es animal? " + (animals.get(i) instanceof Animal));
            System.out.println("Es gato? " + (animals.get(i) instanceof Gato));
            System.out.println("Es perro? " + (animals.get(i) instanceof Perro));
        }

    }
}
