package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.management.ConstructorParameters;

@Getter
@Setter
@ToString
@SuperBuilder

public class Usuario extends Base{
    private String auth0Id , username;
}
