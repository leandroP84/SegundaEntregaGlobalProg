package org.example;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Pais extends Base{
    private  String nombre;

}
