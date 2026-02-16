package controller;

import java.util.ArrayList;
import model.factory.*;
import model.product.*;
import view.*;


public class controladorRestaurante {

    private final vistaRestaurante vista;
    private MenuFactoryI factory;
    private EntradaI entrada;
    private PlatoPrincipalI plato;
    private BebidaI bebida;
    private PostreI postre;
    private final ArrayList<MenuFactoryI> menuGourmet;
    private final ArrayList<MenuFactoryI> menuVegetariano;
    private final ArrayList<MenuFactoryI> menuSaludable;

    public controladorRestaurante() {
        this.vista = new vistaRestaurante(this);
        this.menuGourmet = new ArrayList<>();
        this.menuVegetariano = new ArrayList<>();
        this.menuSaludable = new ArrayList<>();
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
                    if(menuGourmet.isEmpty() && menuVegetariano.isEmpty() && menuSaludable.isEmpty()) {
                        vista.mensajeMenuVacio();
                    } else {
                        vista.mensajeMenuOrdenado();
                    }
                    vista.mensajeMenusOrdenados();
                    vista.cantidadMenusOrdenados(cantidadMenus());
                    mostrarMenuGourmet();

                    mostrarMenuVegetariano();
                    mostrarMenuSaludable();
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
        switch (factory.getClass().getSimpleName()) {
            case "MenuVegetarianoFactory" -> menuVegetariano.add(factory);
            case "MenuGourmetFactory" -> menuGourmet.add(factory);
            case "MenuSaludableFactory" -> menuSaludable.add(factory);
            default -> throw new IllegalArgumentException("Tipo de menú desconocido");
        }
    }

    public void mostrarMenuGourmet() {

        for (MenuFactoryI menu : menuGourmet) {
            vista.mostrarMenuCompleto(menu.crearEntrada().descripcion(), menu.crearPlatoPrincipal().descripcion(),
                    menu.crearBebida().descripcion(), menu.crearPostre().descripcion());
        }
    }

    public void mostrarMenuVegetariano() {

        for (MenuFactoryI menu : menuVegetariano) {
            vista.mostrarMenuCompleto(menu.crearEntrada().descripcion(), menu.crearPlatoPrincipal().descripcion(),
                    menu.crearBebida().descripcion(), menu.crearPostre().descripcion());
        }
    }

    public void mostrarMenuSaludable() {

        for (MenuFactoryI menu : menuSaludable) {
            vista.mostrarMenuCompleto(menu.crearEntrada().descripcion(), menu.crearPlatoPrincipal().descripcion(),
                    menu.crearBebida().descripcion(), menu.crearPostre().descripcion());
        }
    }

    public int cantidadMenus() {
        return menuGourmet.size() + menuVegetariano.size() + menuSaludable.size();
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
