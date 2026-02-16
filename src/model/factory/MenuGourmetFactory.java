package model.factory;

import model.product.BebidaI;
import model.product.EntradaI;
import model.product.PlatoPrincipalI;
import model.product.PostreI;
import model.product.gourmet.BebidaGourmet;
import model.product.gourmet.EntradaGourmet;
import model.product.gourmet.PlatoGourmet;
import model.product.gourmet.PostreGourmet;


public class MenuGourmetFactory implements MenuFactoryI {


    @Override
    public EntradaI crearEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public PlatoPrincipalI crearPlatoPrincipal() {
        return new PlatoGourmet();
    }

    @Override
    public BebidaI crearBebida() {
        return new BebidaGourmet();
    }

    @Override
    public PostreI crearPostre() {
        return new PostreGourmet();
    }
}
