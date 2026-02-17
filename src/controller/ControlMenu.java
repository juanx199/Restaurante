package controller;

import java.util.ArrayList;
import model.factory.*;
import model.product.*;
import view.*;


public class ControlMenu {

    private final vistaRestaurante vista;
    private MenuFactoryI factory;
    private EntradaI entrada;
    private PlatoPrincipalI plato;
    private BebidaI bebida;
    private PostreI postre;
    private final ArrayList<Orden> historial;

    public ControlMenu() {
        this.vista = new vistaRestaurante(this);
        this.historial = new ArrayList<>();
    }
        

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarOpciones();
            int opcion = vista.leerDato();
            switch (opcion) {
                case 1 -> menu();
                case 2 -> {
                    vista.mostrarMenuGourmet();
                    vista.mostrarMenuVegetariano();
                    vista.mostrarMenuSaludable();
                }
                case 3 -> {
                    if(historial.isEmpty()) {
                        vista.mensajeMenuVacio();
                    } else {
                        vista.mensajeMenuOrdenado();
                    }
                    vista.mensajeMenusOrdenados();
                    vista.cantidadMenusOrdenados(cantidadMenus());
                    mostrarHistorial();
                }
                case 4 -> {
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
            case 1 -> crarMenu(1);
            case 2 -> crarMenu(2);
            case 3 -> crarMenu(3);
            case 4 -> iniciar();
            default -> vista.error();
        }
    }

    public void crarMenu(int opcion) {
        switch (opcion) {
            case 1 -> factory = new MenuVegetarianoFactory();
            case 2 -> factory = new MenuGourmetFactory();
            case 3 -> factory = new MenuSaludableFactory();
            default -> throw new IllegalArgumentException("Opción inválida");
        }

        entrada = factory.crearEntrada();
        plato = factory.crearPlatoPrincipal();
        bebida = factory.crearBebida();
        postre = factory.crearPostre();
        guardarMenu();
        vista.mensajeMenuGuardado();
    }
    public void guardarMenu(){
        historial.add(new Orden(factory.getClass().getSimpleName(), entrada, plato, bebida, postre));
    }

    public void mostrarHistorial() {
        for (Orden orden : historial) {
            vista.mostrarMenuCompleto(orden.getEntrada().descripcion(), orden.getPlato().descripcion(),
                    orden.getBebida().descripcion(), orden.getPostre().descripcion());
        }
    }

    public int cantidadMenus() {
        return historial.size();
    }

    public void mostrarMenu() {
        vista.mostrarMenuCompleto(entrada.descripcion(), plato.descripcion(), bebida.descripcion(), postre.descripcion());
    }


    public EntradaI getEntrada() {
        return entrada;
    }

    public PlatoPrincipalI getPlato() {
        return plato;
    }

    public BebidaI getBebida() {
        return bebida;
    }

    public PostreI getPostre() {
        return postre;
    }


}
