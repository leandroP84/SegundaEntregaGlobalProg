package org.example;

import java.util.ArrayList;

public class Categoria extends Base {
    private  String denominacion;
    private ArrayList<Categoria> subCategorias;
    private ArrayList<Articulo> articulos = new ArrayList<>(); //⬜

    public Categoria(String denominacion, Sucursal sucursal) {
        this.denominacion = denominacion;
        sucursal.addCategoria(this);
    }
    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
}
