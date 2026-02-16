package model.factory;

import model.product.BebidaI;
import model.product.EntradaI;
import model.product.PlatoPrincipalI;
import model.product.PostreI;

public class MenuSaludableFactory implements MenuFactoryI {

        @Override
        public EntradaI crearEntrada() {
            return new model.product.saludable.EntradaSaludable();
        }
    
        @Override
        public PlatoPrincipalI crearPlatoPrincipal() {
            return new model.product.saludable.PlatoSaludable();
        }
    
        @Override
        public BebidaI crearBebida() {
            return new model.product.saludable.BebidaSaludable();
        }
    
        @Override
        public PostreI crearPostre() {
            return new model.product.saludable.PostreSaludable();
        }

}
