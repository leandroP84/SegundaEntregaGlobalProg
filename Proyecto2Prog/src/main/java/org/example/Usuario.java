package org.example;

public class Usuario extends Base{
    private String auth0Id , username;

    public Usuario(String auth0Id, String username, Cliente cliente) {
        this.auth0Id = auth0Id;
        this.username = username;
        cliente.addUsuario(this);
    }
}
