
package final_23;

import java.util.ArrayList;
import java.util.Collections;


public class Zapateria {
      private ArrayList<Zapato> inventario;

    public Zapateria() {
        inventario = new ArrayList<>();
    }

    public void agregarZapato(Zapato zapato) {
        inventario.add(zapato);
    }

    public void ordenarPorPrecio() {
        Collections.sort(inventario);
    }

    public void mostrarInventario() {
        for (Zapato zapato : inventario) {
            zapato.mostrarInformacion();
        }
    }
}

