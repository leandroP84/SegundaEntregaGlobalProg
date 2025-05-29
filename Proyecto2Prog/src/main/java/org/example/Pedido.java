package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

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

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, LocalDate fechaPedido, Sucursal sucursal, Domicilio domicilio,FormaPago formaPago, TipoEnvio tipoEnvio, DetallePedido detallePedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.FechaPedido = fechaPedido;
        this.sucursal = sucursal;
        this.domicilio = domicilio;
        this.formaPago = formaPago;
        this.tipoEnvio = tipoEnvio;
        detallePedido.addPedido(this);
    }

    public void addFacturas(Factura factura){
        this.factura = factura;
    }
}
