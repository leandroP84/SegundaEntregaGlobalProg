package org.example;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Articulo;
@SuperBuilder
@Getter
@Setter
@ToString

public class Categoria {
    private String denominacion;
    private ArrayList<Categoria> subCategorias = new ArrayList<>();
    private ArrayList<Articulo> articulos = new ArrayList<>();


    public void addSubCategoria(Categoria categoria) {
        this.subCategorias.add(categoria);
    }



    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);}
}