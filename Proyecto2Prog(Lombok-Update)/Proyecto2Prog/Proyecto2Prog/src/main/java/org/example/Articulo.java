package org.example;

import java.util.ArrayList;
import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class Articulo extends Base {
    protected String denominacion;
    protected Double precioVenta;
    protected UnidadMedida unidadMedida;

    protected ArrayList<Imagen> imagenes = new ArrayList<>();

    public Articulo(String denominacion, Double precioVenta,Categoria categoria, DetallePedido detallePedido) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        categoria.addArticulo(this);
        detallePedido.addArticulo(this);
    }

    public void addUnidadMedida(UnidadMedida unidadMedida){
        this.unidadMedida = unidadMedida;
    }
    public void addImagen(Imagen imagen){
        this.imagenes.add(imagen);
    }
}
