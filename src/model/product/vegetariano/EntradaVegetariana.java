package model.product.vegetariano;

import model.product.EntradaI;

public class EntradaVegetariana  implements EntradaI{

    @Override
    public String descripcion() {
        return "Entrada Vegetariana: Ensalada de quinoa con aguacate y tomate.";
    }

}
