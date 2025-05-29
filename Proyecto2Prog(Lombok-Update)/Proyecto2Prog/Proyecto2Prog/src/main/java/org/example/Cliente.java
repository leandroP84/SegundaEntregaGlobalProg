package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class Cliente extends Base {
    private String nombre,apellido,telefono,email;

    private LocalDate fechaNacimiento;

    private Imagen imagen;//⬜
    private Usuario usuario;//⬜
    private ArrayList<Pedido> pedidos = new ArrayList<>();//⬜
    private ArrayList<Domicilio> domicilios = new ArrayList<>();//⬜

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Pedido pedido,Domicilio domicilio) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.pedidos.add(pedido);
        this.domicilios.add(domicilio);
    }

    public void addImagen (Imagen imagen){
        this.imagen = imagen;
    }

    public void addUsuario(Usuario usuario){
        this.usuario = usuario;
    }

}
