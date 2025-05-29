package org.example;



import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Getter
@Setter
@ToString
@Builder

public class Promocion extends Base{
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;

    private ArrayList<Imagen> imagenes = new ArrayList<>(); // ⬜
    private ArrayList<Articulo> articulos = new ArrayList<>();//⬜

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento, double precioPromocional, Sucursal sucursal,Articulo articulo) {
        super();
        this.denominacion = denominacion;
        FechaDesde = fechaDesde;
        FechaHasta = fechaHasta;
        HoraDesde = horaDesde;
        HoraHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        sucursal.addPromocion(this);
        this.articulos.add(articulo);
    }

    public void addImagen(Imagen imagen){
        this.imagenes.add(imagen);
    }
}
