package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class ArticuloManufacturadoDetalle extends Base{
    private int cantidad;
    private ArticuloInsumo articuloInsumo;//⬜

    public void addArticuloInsumo(ArticuloInsumo articuloInsumo){
        this.articuloInsumo = articuloInsumo;
    }
}
