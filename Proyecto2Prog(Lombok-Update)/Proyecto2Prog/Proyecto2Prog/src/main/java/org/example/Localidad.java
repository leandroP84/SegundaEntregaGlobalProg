package org.example;

import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class Localidad extends Base{
    private String nombre;
    private Provincia provincia;

    public Localidad(String nombre, Domicilio domicilio) {
        super();
        this.nombre = nombre;
        domicilio.addLocalidad(this);
    }

    public void addProvincia(Provincia provincia){
        this.provincia = provincia;
    }
}
