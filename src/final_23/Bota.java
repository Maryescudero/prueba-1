
package final_23;


public class Bota extends Zapato {
    
    private int talla;

    public Bota(String nombre, double precio, int stock, int talla) {
        super(nombre, precio, stock);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bota - Talla: " + talla + ", Nombre: " + getNombre() + ", Precio: $" + getPrecio() + ", Stock: " + getStock());
    }
}

