package org.example;

import java.util.ArrayList;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    @Builder.Default
    private ArrayList<ArticuloManufacturadoDetalle> detalles_del_articulo_manufacturado = new ArrayList<>(); //⬜

    public void addArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle){
        this.detalles_del_articulo_manufacturado.add(articuloManufacturadoDetalle);
    }
}
