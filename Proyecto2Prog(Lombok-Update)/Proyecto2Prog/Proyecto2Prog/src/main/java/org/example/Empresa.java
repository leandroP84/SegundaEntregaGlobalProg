package org.example;

import java.util.ArrayList;

import lombok.*;

@Getter
@Setter
@ToString
@Builder

public class Empresa extends Base{
        private String nombre;
        private String razonSocial;
        private int cuil;

        private ArrayList<Sucursal> sucursales = new ArrayList<>();

        public Empresa(String nombre, String razonSocial, int cuil) {
            super();
            this.nombre = nombre;
            this.razonSocial = razonSocial;
            this.cuil = cuil;
        }

        public void addSucursal(Sucursal sucursal){
            sucursales.add(sucursal);
        }
}
