
package final_23;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Final_23 {
    public static Zapato pedirDatos(String tipo) throws InputMismatchException {
     
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su precio: ");
        double precio = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese el stock: ");
        int stock = leer.nextInt();
        leer.nextLine();

        switch (tipo) {
            case "Zapatilla":
                System.out.println("Ingrese la marca correspondiente: ");
                String marca = leer.nextLine();
                return new Zapatilla(nombre, precio, stock, marca);
            case "Sandalia":
                System.out.println("Ingrese el estilo: ");
                String estilo = leer.nextLine();
                return new Sandalia(nombre, precio, stock, estilo);
            case "Bota":
                System.out.println("Ingrese la talla: ");
                int talla = leer.nextInt();
                leer.nextLine();
                return new Bota(nombre, precio, stock, talla);
            default:
                throw new InputMismatchException(); // thow va una sola vez
        }

    }
    public static void main(String[] args) {
           System.out.println("**********************************************");
        System.out.println("BIENVENIDO A ZAPATERIA ZAPATOS FELICES");
        System.out.println("**********************************************");
        
        Zapateria zapateria = new Zapateria();
        

        try {
            Zapato zapatilla = pedirDatos("Zapatilla");
            zapateria.agregarZapato(zapatilla);
            System.out.println("------------------------------------------------");
            Zapato sandalia = pedirDatos("Sandalia");
            zapateria.agregarZapato(sandalia);
            System.out.println("------------------------------------------------");
            Zapato bota = pedirDatos("Bota");
            zapateria.agregarZapato(bota);
            System.out.println("------------------------------------------------");
            if (zapatilla instanceof Oferta) {
                ((Oferta) zapatilla).calcularDescuento(15);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error de tipo de datos");
        } finally {
            System.out.println("En bloque finally");
        }
        zapateria.ordenarPorPrecio(); // las directivas van afuera del try catch
        zapateria.mostrarInventario();
    }
}
  
