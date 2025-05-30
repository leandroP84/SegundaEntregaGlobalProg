package org.example;

import java.util.ArrayList;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Articulo extends Base {
    protected String denominacion;
    protected Double precioVenta;
    protected UnidadMedida unidadMedida;

    protected ArrayList<Imagen> imagenes = new ArrayList<>();

    public void addUnidadMedida(UnidadMedida unidadMedida){
        this.unidadMedida = unidadMedida;
    }
    public void addImagen(Imagen imagen){
        this.imagenes.add(imagen);
    }
}
