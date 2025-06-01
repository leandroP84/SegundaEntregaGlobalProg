package org.example;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@ToString
@SuperBuilder

public class Pedido extends Base{
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private FormaPago formaPago;
    private TipoEnvio tipoEnvio;
    private LocalDate FechaPedido;

    private Domicilio domicilio; //⬜
    private Sucursal sucursal; //⬜
    private Factura factura; //⬜

    @Builder.Default
    private List<DetallePedido> detalles = new ArrayList<>();

    public void addFacturas(Factura factura){
        this.factura = factura;
    }

    public void addDetalle(DetallePedido detalle) {
        if (detalles == null) {
            detalles = new ArrayList<>();
        }
        detalles.add(detalle);
        detalle.setPedido(this); // relación bidireccional
    }

}
