package model.factory;

import model.product.*;


public interface MenuFactoryI {

    EntradaI crearEntrada();
    PlatoPrincipalI crearPlatoPrincipal();
    BebidaI crearBebida();
    PostreI crearPostre();

}
