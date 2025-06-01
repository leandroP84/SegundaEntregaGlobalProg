package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Getter
@Setter
@ToString
@SuperBuilder

public class Promocion extends Base {
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;
    @Builder.Default
    private ArrayList<Imagen> imagenes = new ArrayList<>();
    @Builder.Default
    private ArrayList<Articulo> articulos = new ArrayList<>();

    public void addImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }
}
