package model.product.vegetariano;

import model.product.PlatoPrincipalI;

public class PlatoVegetariano implements PlatoPrincipalI{

    @Override
    public String descripcion() {
        return "Plato Principal Vegetariano: Lasaña de verduras con salsa de tomate.";
    }

}
