package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Cliente extends Base {
    private String nombre,apellido,telefono,email;

    private LocalDate fechaNacimiento;

    private Imagen imagen;//⬜
    private Usuario usuario;//⬜
    private ArrayList<Pedido> pedidos = new ArrayList<>();//⬜
    private ArrayList<Domicilio> domicilios = new ArrayList<>();//⬜


    public void addImagen (Imagen imagen){
        this.imagen = imagen;
    }

    public void addUsuario(Usuario usuario){
        this.usuario = usuario;
    }

}
