
package final_23;


public class Zapatilla extends Zapato implements Oferta {
    private String marca;

    public Zapatilla(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Zapatilla - Marca: " + marca + ", Nombre: " + getNombre() + ", Precio: $" + getPrecio() + ", Stock: " + getStock());
    }

    @Override
    public void calcularDescuento(int porcentaje) {
        double descuento = getPrecio() * porcentaje / 100;
        setPrecio(getPrecio() - descuento);
    }
}
