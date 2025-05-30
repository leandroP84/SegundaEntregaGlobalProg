package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Provincia extends Base{
    private String nombre;
    private Pais pais;

    public void addPais(Pais pais){
        this.pais = pais;
    }
}
