package org.example;

public class UnidadMedida extends Base{
    private String denominacion;

    public UnidadMedida(String denominacion, Articulo articulo) {
        this.denominacion = denominacion;
        articulo.addUnidadMedida(this);
    }
}
