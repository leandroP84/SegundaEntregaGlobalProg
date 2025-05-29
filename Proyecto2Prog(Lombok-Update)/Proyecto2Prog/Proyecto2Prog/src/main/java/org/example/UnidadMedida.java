package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder

public class UnidadMedida extends Base{
    private String denominacion;

    public UnidadMedida(String denominacion, Articulo articulo) {
        super();
        this.denominacion = denominacion;
        articulo.addUnidadMedida(this);
    }
}
