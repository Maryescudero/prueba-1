
package final_23;


public class Sandalia extends Zapato {
    
    private String estilo;

    public Sandalia(String nombre, double precio, int stock, String estilo) {
        super(nombre, precio, stock);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Sandalia - Estilo: " + estilo + ", Nombre: " + getNombre() + ", Precio: $" + getPrecio() + ", Stock: " + getStock());
    }
}

