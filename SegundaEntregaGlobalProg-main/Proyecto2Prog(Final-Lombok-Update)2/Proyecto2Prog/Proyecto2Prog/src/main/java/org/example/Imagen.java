package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Imagen extends Base{
    private String denominacion;

}
