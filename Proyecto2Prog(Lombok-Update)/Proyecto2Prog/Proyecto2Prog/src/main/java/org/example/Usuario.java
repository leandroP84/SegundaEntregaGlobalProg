package org.example;

import lombok.*;

import javax.management.ConstructorParameters;

@Getter
@Setter
@ToString


public class Usuario extends Base{
    private String auth0Id , username;

    public Usuario(String auth0Id, String username, Cliente cliente) {
        super();
        this.auth0Id = auth0Id;
        this.username = username;
        cliente.addUsuario(this);
    }
}
