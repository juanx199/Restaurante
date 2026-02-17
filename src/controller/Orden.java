package controller;

import model.product.BebidaI;
import model.product.EntradaI;
import model.product.PlatoPrincipalI;
import model.product.PostreI;

public class Orden {

    private EntradaI entrada;
    private PlatoPrincipalI plato;
    private BebidaI bebida;
    private PostreI postre;
    private String tipoMenu;

    public Orden(String tipoMenu,EntradaI entrada,PlatoPrincipalI plato,BebidaI bebida,
        PostreI postre) {
        this.tipoMenu = tipoMenu;
        this.entrada = entrada;
        this.plato = plato;
        this.bebida = bebida;
        this.postre = postre;
    }

    public BebidaI getBebida() {
        return bebida;
    }

    public EntradaI getEntrada() {
        return entrada;
    }

    public PlatoPrincipalI getPlato() {
        return plato;
    }

    public PostreI getPostre() {
        return postre;
    }
    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setBebida(BebidaI bebida) {
        this.bebida = bebida;
    }

    public void setEntrada(EntradaI entrada) {
        this.entrada = entrada;
    }

    public void setPlato(PlatoPrincipalI plato) {
        this.plato = plato;
    }

    public void setPostre(PostreI postre) {
        this.postre = postre;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

}
