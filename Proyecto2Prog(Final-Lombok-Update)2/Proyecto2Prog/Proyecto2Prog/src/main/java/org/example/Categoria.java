package org.example;

import java.util.ArrayList;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Categoria extends Base {
    private  String denominacion;
    private ArrayList<Categoria> subCategorias;
    private ArrayList<Articulo> articulos = new ArrayList<>(); //⬜

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
}
