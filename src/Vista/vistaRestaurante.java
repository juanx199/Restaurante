package Vista;

import Controlador.controladorRestaurante;
import java.util.Scanner;

public class vistaRestaurante {

    private final Scanner scanner;
    private controladorRestaurante controlador;

    public vistaRestaurante(controladorRestaurante controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
        System.out.println("Vista del restaurante creada");
    }

    public int leerDato() { 
        int dato = scanner.nextInt();
        System.out.println("Dato leído: " + dato);
        return dato;
    }


    public void mostrarOpciones() {
        System.out.println("Bienvenido al restaurante");
        System.out.println("1. Ver menú");
        System.out.println("2. Salir");
    }

    public void mostrarMenu() {
        System.out.println("Menú del restaurante:");
        System.out.println("1. Plato 1");
        System.out.println("2. Plato 2");
        System.out.println("3. Plato 3");
        System.out.println("4. Volver al menú principal");
    }

    public void cerrarPrograma() {
        System.out.println("Gracias por visitar nuestro restaurante. ¡Hasta luego!");
        System.exit(0);
    }

    public void error() {
        System.out.println("Opción no válida. Por favor, intente de nuevo.");
    }

    public controladorRestaurante getControlador() {
        return controlador;
    }

    public void setControlador(controladorRestaurante controlador) {
        this.controlador = controlador;
    }

    

}
