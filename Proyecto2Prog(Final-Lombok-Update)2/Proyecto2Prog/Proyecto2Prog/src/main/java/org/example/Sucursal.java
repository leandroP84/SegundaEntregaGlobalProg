package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.ArrayList;

@Getter
@Setter
@ToString
@SuperBuilder

public class Sucursal extends Base{
    private String nombre;
    private LocalTime HorarioApertura;
    private LocalTime HorarioCierre;
    private Domicilio domicilio; // ⬜
    private ArrayList<Promocion> promociones = new ArrayList<>(); //⬜
    private ArrayList<Categoria> categorias = new ArrayList<>();//⬜

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
