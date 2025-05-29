package org.example;

public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, Double precioVenta, Categoria categoria, DetallePedido detallePedido, double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioVenta, categoria, detallePedido);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }
}
