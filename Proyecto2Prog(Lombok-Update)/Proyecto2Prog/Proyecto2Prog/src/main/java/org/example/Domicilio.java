package org.example;

import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class Domicilio extends Base{
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;

    public Domicilio(String calle, int numero, int cp, Sucursal sucursal) {
        super();
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        sucursal.addDomicilio(this);
    }

    public void addLocalidad(Localidad localidad){
        this.localidad = localidad;
    }
}
