package model.factory;

import model.product.*;
import model.product.vegetariano.*;

public class MenuVegetarianoFactory implements MenuFactoryI{


    @Override
    public EntradaI crearEntrada() {
        return new EntradaVegetariana();
    }
    
    @Override
    public PlatoPrincipalI crearPlatoPrincipal() {
        return new PlatoVegetariano();
    }
    
    @Override
    public PostreI crearPostre() {
        return new PostreVegetariano();
    }
    
    @Override
    public BebidaI crearBebida() {
        return new BebidaVegetariana();
    }

}