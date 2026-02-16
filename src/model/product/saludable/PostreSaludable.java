package model.product.saludable;

import model.product.PostreI;

public class PostreSaludable implements PostreI {
    @Override
    public String descripcion() {
        return "Postre Saludable: Ensalada de frutas con miel y nueces.";
    }

}
