package org.example;

import java.time.LocalDate;

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private int mpMerchantOrderId , mpPaymentId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;

    public Factura(LocalDate fechaFacturacion, int mpMerchantOrderId, int mpPaymentId, String mpPreferenceId, String mpPaymentType, FormaPago formaPago, double totalVenta, Pedido pedido) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPaymentId = mpPaymentId;
        this.mpPreferenceId = mpPreferenceId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
        pedido.addFacturas(this);
    }
}
