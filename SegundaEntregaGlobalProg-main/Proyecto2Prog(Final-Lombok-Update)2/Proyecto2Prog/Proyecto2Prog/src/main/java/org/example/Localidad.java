package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Localidad extends Base{
    private String nombre;
    private Provincia provincia;



    public void addProvincia(Provincia provincia){
        this.provincia = provincia;
    }
}
