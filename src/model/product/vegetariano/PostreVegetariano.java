package model.product.vegetariano;

import model.product.PostreI;

public class PostreVegetariano implements PostreI{

    @Override
    public String descripcion() {
        return "Postre Vegetariano: Mousse de chocolate con aguacate y frutos rojos.";
    }

}
