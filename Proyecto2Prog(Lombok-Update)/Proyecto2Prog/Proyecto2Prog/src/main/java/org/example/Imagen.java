package org.example;

import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class Imagen extends Base{
    private String denominacion;

    public Imagen(String denominacion, Promocion promocion,Articulo articulo, Cliente cliente) {
        super();
        this.denominacion = denominacion;
        promocion.addImagen(this);
        articulo.addImagen(this);
        cliente.addImagen(this);
    }
}
