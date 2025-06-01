package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public class DetallePedido extends Base {
    private int cantidad;
    private double subTotal;
    private Articulo articulo;
    private Pedido pedido;


    public void asignarArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    // El método setPedido() lo genera Lombok.
}
