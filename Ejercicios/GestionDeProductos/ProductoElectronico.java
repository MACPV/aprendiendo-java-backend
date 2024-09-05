package Ejercicios.GestionDeProductos;

public class ProductoElectronico extends Productos implements Comprable{
    private String tipo;
    public ProductoElectronico() {
    }

    public ProductoElectronico(String nombre, double precio, int cantidad, String descripcion, String tipo) {
        super(nombre, precio, cantidad, descripcion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
