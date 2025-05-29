package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println("2");
            Empresa empresa1 = new Empresa("TirameElBit", "Franco", 111);
            Empresa empresa2 = new Empresa("TirameElBit2.0", "Leandro", 110);
            Sucursal sucursal1 = new Sucursal("Francisco", empresa1);
            Sucursal sucursal2 = new Sucursal("Leandro", empresa2);
            Domicilio domicilio1 = new Domicilio("San martin", 100, 54, sucursal1);
            Domicilio domicilio2 = new Domicilio("Las heras", 600, 546, sucursal2);
            Localidad localidad1 = new Localidad("Tunuyan", domicilio1);
            Localidad localidad2 = new Localidad("Tunuyan", domicilio2);
            Provincia provincia1 = new Provincia("Mendoza", localidad1);
            Provincia provincia2 = new Provincia("Mendoza", localidad2);
            Pais pais1 = new Pais("Argentina", provincia1);
            Pais pais2 = new Pais("Argentina", provincia2);
            Categoria categoria1 = new Categoria("Bebida",sucursal1);
            Categoria categoria2 = new Categoria("Bebida",sucursal2);
            DetallePedido detallePedido1 = new DetallePedido(100, 200.0);
            DetallePedido detallePedido2 = new DetallePedido(100, 200.0);
            Pedido pedido1 = new Pedido(LocalTime.now(),100.0, 200.0, LocalDate.now(), sucursal1, domicilio1, FormaPago.MERCADOPAGO, TipoEnvio.DELIVERY,detallePedido1);
            Pedido pedido2 = new Pedido(LocalTime.now(),300.0, 400.0, LocalDate.now(), sucursal2, domicilio2, FormaPago.EFECTIVO, TipoEnvio.TAKEAWAY,detallePedido2);
            Factura factura1 = new Factura(LocalDate.now(),100,20,"ZZZ", "asdd",FormaPago.EFECTIVO,200.0,pedido1);
            Factura factura2 = new Factura(LocalDate.now(),400,220,"ZZZ222", "asdd222",FormaPago.EFECTIVO,500.0,pedido2);
            Articulo articulo1 = new Articulo("Jugo",100.0,categoria1, detallePedido1);
            Articulo articulo2 = new Articulo("Alfajor",400.0,categoria2, detallePedido2);
            UnidadMedida unidadMedida1 = new UnidadMedida("ML",articulo1);
            UnidadMedida unidadMedida2 = new UnidadMedida("Gr",articulo2);
            Cliente cliente1 = new Cliente("Leandro", "Paredes", "2612582900", "Leaparedes86@gmail.com", LocalDate.now(),pedido1,domicilio1);
            Cliente cliente2 = new Cliente("Francisco", "Mestre", "2612323900", "FranciscoMes86@gmail.com", LocalDate.now(),pedido2,domicilio2);
            Usuario usuario1 = new Usuario("01", "Skelenger", cliente1);
            Usuario usuario2 = new Usuario("02", "Xemo", cliente2);
            Promocion promocion1 = new Promocion("Hola", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), "50%",200.0, sucursal1,articulo1);
            Promocion promocion2 = new Promocion("Hola", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), "20%",400.0, sucursal2,articulo2);
            Imagen imagen1 = new Imagen("Mcburguer",promocion1,articulo1,cliente1);
            Imagen imagen2 = new Imagen("Mcburguer",promocion2,articulo2,cliente2);
            ArticuloManufacturado articuloManufacturado1 = new ArticuloManufacturado("asdasd",100.9,categoria1,detallePedido1,"ALGO",15,"Nose");
            ArticuloManufacturado articuloManufacturado2 = new ArticuloManufacturado("asdasdasdasd",140.0,categoria2,detallePedido2,"ALGO2",25,"Nosex2");
            ArticuloManufacturadoDetalle articuloManufacturadoDetalle1 = new ArticuloManufacturadoDetalle(1000, articuloManufacturado1);
            ArticuloManufacturadoDetalle articuloManufacturadoDetalle2 = new ArticuloManufacturadoDetalle(100, articuloManufacturado2);
            ArticuloInsumo articuloInsumo1 = new ArticuloInsumo("asdas",100.0,categoria1,detallePedido1,100.0,200,1000,true);
            ArticuloInsumo articuloInsumo2 = new ArticuloInsumo("asdastaedas",500.0,categoria2,detallePedido2,200.0,400,5000,true);
    }

}