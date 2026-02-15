package Controlador;

import Vista.*;

public class controladorRestaurante {

    private final vistaRestaurante vista;

    public controladorRestaurante() {
        this.vista = new vistaRestaurante(this);
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarOpciones();
            int opcion = vista.leerDato();
            switch (opcion) {
                case 1 -> menu();
                case 2 -> {
                    vista.cerrarPrograma();
                    salir = true;
                }
                default -> vista.error();
            }
        }
    }

    public void menu() {
        vista.mostrarMenu();
        int opcion = vista.leerDato();
        switch (opcion) {
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> iniciar();
            default -> vista.error();
        }
    } 

}
