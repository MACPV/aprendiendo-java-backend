package Ejercicios.GestionDeProductos;

public class ProductoRopa extends Productos implements Comprable{
    private String talla;

    public ProductoRopa() {
    }

    public ProductoRopa(String nombre, double precio, int cantidad, String descripcion, String talla) {
        super(nombre, precio, cantidad, descripcion);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }

}
