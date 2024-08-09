package Ejercicios.Metodos;

public class AleatorioMetodo {
    public static void main(String[] args) {
        System.out.println("El numero aleatorio es: "+ ran());
    }
    public static int ran(){
        return (int) (Math.random()*355 + 1);
    }
}
