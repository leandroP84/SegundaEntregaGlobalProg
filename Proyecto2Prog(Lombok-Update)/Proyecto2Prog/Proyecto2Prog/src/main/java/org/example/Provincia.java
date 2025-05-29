package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder

public class Provincia extends Base{
    private String nombre;
    private Pais pais;

    public Provincia(String nombre, Localidad localidad) {
        super();
        this.nombre = nombre;
        localidad.addProvincia(this);
    }

    public void addPais(Pais pais){
        this.pais = pais;
    }
}
