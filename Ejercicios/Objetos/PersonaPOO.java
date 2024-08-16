package Ejercicios.Objetos;

public class PersonaPOO {


    private String nombre;
    private int edad;
    public static void main(String[] args) {
        PersonaPOO personaPOO = new PersonaPOO("Aldo",25);
        personaPOO.ImprimirDatos();
    }
    public void ImprimirDatos(){
        System.out.println("El nombre de la persona es: " + this.nombre + " y su edad es: " + this.edad);
    }
    public PersonaPOO(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
