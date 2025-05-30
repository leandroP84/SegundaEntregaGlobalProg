package org.example;

import java.time.LocalDate;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private int mpMerchantOrderId , mpPaymentId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;

}
