package org.example;

public class ArticuloManufacturadoDetalle {
    private int cantidad;
    private ArticuloInsumo articuloInsumo;//⬜

    public ArticuloManufacturadoDetalle(int cantidad, ArticuloManufacturado articuloManufacturado) {
        this.cantidad = cantidad;
        articuloManufacturado.addArticuloManufacturadoDetalle(this);
    }

    public void addArticuloInsumo(ArticuloInsumo articuloInsumo){
        this.articuloInsumo = articuloInsumo;
    }
}
