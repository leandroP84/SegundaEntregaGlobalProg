package org.example;

import java.util.ArrayList;

import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private ArrayList<ArticuloManufacturadoDetalle> detalles_del_articulo_manufacturado = new ArrayList<>(); //⬜

    public ArticuloManufacturado(String denominacion, Double precioVenta, Categoria categoria, DetallePedido detallePedido, String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta, categoria, detallePedido);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public void addArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle){
        this.detalles_del_articulo_manufacturado.add(articuloManufacturadoDetalle);
    }
}
