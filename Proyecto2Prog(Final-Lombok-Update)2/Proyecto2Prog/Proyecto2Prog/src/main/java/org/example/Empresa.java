package org.example;

import java.util.ArrayList;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder

public class Empresa extends Base{
        private String nombre;
        private String razonSocial;
        private int cuil;

        private ArrayList<Sucursal> sucursales = new ArrayList<>();

        public void addSucursal(Sucursal sucursal){
            sucursales.add(sucursal);
        }
}
