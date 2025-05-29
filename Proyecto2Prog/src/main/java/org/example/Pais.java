package org.example;

public class Pais extends Base{
    private  String nombre;

    public Pais(String nombre,Provincia provincia) {
        this.nombre = nombre;
        provincia.addPais(this);
    }
}
