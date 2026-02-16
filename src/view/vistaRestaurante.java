package view;

import controller.controladorRestaurante;
import java.util.Scanner;

public class vistaRestaurante {

    private final Scanner scanner;
    private controladorRestaurante controlador;

    public vistaRestaurante(controladorRestaurante controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public int leerDato() { 
        int dato = scanner.nextInt();
        return dato;
    }


    public void mostrarOpciones() {
        System.out.println("\n                 SISTEMA DE RESTAURANTE - MENÚ PRINCIPAL             ");
        System.out.println("\nBienvenido al restaurante\n");
        System.out.println("1. Realizar un pedido");
        System.out.println("2. Ver menus guardados");
        System.out.println("3. Solicitar menus ordenados por el cliente");
        System.out.println("4. Salir");
    }

    public void mostrarMenu() {
        System.out.println("\nMenú del restaurante: \n");
        System.out.println("1. Menu Vegetariano");
        System.out.println("2. Menu Gourmet");
        System.out.println("3. Menu Saludable");
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

    public void mostrarMenuCompleto(String entrada, String plato, String bebida, String postre) {
        System.out.println("Menú completo:");
        System.out.println("Entrada: " + entrada);
        System.out.println("Plato Principal: " + plato);
        System.out.println("Bebida: " + bebida);
        System.out.println("Postre: " + postre);
        System.out.println("---------------------------------------------------\n");

    }

    public void mostrarMenuGourmet() {

        System.out.println("Menú Gourmet:");
        System.out.println("Entrada Gourmet: Carpaccio de res con rúcula y parmesano.");
        System.out.println("Plato Principal Gourmet: Filete de res con salsa de vino tinto y puré de papas trufado." );
        System.out.println("Bebida Gourmet: Cóctel de frutas exóticas con un toque de menta.");
        System.out.println("Postre Gourmet: Tarta de chocolate con frutos rojos y helado de vainilla." );
        System.out.println("---------------------------------------------------\n");
    }
    

    public void mostrarMenuVegetariano() {
        System.out.println("Menú Vegetariano:");
        System.out.println("Entrada Vegetariana: Ensalada de quinoa con aguacate y tomate." );
        System.out.println("Plato Principal Vegetariano: Lasaña de verduras con salsa de tomate." );
        System.out.println("Bebida Vegetariana: Jugo de naranja natural." );
        System.out.println("Postre Vegetariano: Mousse de chocolate con aguacate y frutos rojos.");
        System.out.println("---------------------------------------------------\n");

    }

    public void mostrarMenuSaludable() {
        System.out.println("Menú Saludable:");
        System.out.println("Entrada Saludable: Ensalada de quinoa con vegetales frescos.");
        System.out.println("Plato Principal Saludable: Pechuga de pollo a la plancha con ensalada verde.");
        System.out.println("Bebida Saludable: Agua de coco natural.");
        System.out.println("Postre Saludable: Ensalada de frutas con miel y nueces.");
        System.out.println("---------------------------------------------------\n");
    }

    public void mensajeMenuGuardado() {
        System.out.println("Menú guardado exitosamente.");
    }

    public void mensajeMenuVacio() {
        System.out.println("No hay menús ordenados por el cliente.");
    }
    
    public void mensajeMenuOrdenado() {
        System.out.println("Menús ordenados por el cliente:");
    }

    public void cantidadMenusOrdenados(int cantidad) {
        System.out.println("Cantidad de menús ordenados por el cliente: " + cantidad);
    }

    public void mensajeMenusOrdenados() {
        System.out.println("--------------- OREDNES REALIZADAS ----------------\n");
    }

    

}
