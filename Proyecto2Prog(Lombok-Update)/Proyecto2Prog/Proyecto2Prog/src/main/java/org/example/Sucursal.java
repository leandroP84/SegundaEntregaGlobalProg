package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.ArrayList;

@Getter
@Setter
@ToString
@Builder

public class Sucursal extends Base{
    private String nombre;
    private LocalTime HorarioApertura;
    private LocalTime HorarioCierre;
    private Domicilio domicilio; // ⬜
    private ArrayList<Promocion> promociones = new ArrayList<>(); //⬜
    private ArrayList<Categoria> categorias = new ArrayList<>();//⬜

    public Sucursal(String nombre, Empresa empresa) {
        super();
        this.nombre = nombre;
        HorarioApertura = LocalTime.now();
        HorarioCierre = LocalTime.now();
        empresa.addSucursal(this);
    }

    public void addDomicilio(Domicilio domicilio){
        this.domicilio = domicilio;
    }

    public void addCategoria(Categoria categorias){
        this.categorias.add(categorias);
    }

    public void addPromocion(Promocion promocion){
        this.promociones.add(promocion);
    }
}
