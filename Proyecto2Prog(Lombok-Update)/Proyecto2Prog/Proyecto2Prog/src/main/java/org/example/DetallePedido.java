package org.example;

import java.util.ArrayList;
import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class DetallePedido extends Base{
    private int cantidad;
    private double subTotal;
    private Articulo articulo;
    private Pedido pedido;

    public DetallePedido(int cantidad, double subTotal) {
        super();
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public void addArticulo(Articulo articulo){
        this.articulo = articulo;
    }

    public void addPedido(Pedido pedido){
        this.pedido = pedido;
    }
}
