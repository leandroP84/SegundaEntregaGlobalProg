package org.example;
import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class Pais extends Base{
    private  String nombre;

    public Pais(String nombre,Provincia provincia) {
        super();
        this.nombre = nombre;
        provincia.addPais(this);
    }
}
