package org.example;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

import java.time.LocalDate;
import java.time.LocalTime;
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


    public void addFacturas(Factura factura){
        this.factura = factura;
    }
}
