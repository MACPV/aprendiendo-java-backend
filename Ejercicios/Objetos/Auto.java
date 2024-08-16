package Ejercicios.Objetos;

public class Auto {

    private String marca;
    private String modelo;
    private int año;

    public static void main(String[] args) {
        Auto auto = new Auto("Tesla", "horizon", 2024);
        auto.mostrarAuto();

    }

    public Auto(String marca, String modelo, int año){
        this.año = año;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca){
        this.marca = marca;
    }
    public Auto(){
        this("Nissan", "GT400", 2000);
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void mostrarAuto() {
        if (marca != null && modelo != null && año != 0) {
            System.out.println("Auto marca: " + marca + ", modelo: " + modelo + ", año: " + año);
        } else if (marca != null && modelo != null) {
            System.out.println("Auto marca: " + marca + ", modelo: " + modelo);
        } else if (marca != null) {
            System.out.println("Auto marca: " + marca);
        } else {
            System.out.println("Información del auto no disponible.");
        }
    }

}
