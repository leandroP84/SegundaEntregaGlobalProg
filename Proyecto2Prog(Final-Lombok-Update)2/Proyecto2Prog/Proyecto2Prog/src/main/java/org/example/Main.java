package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println("2");
            //Empresa empresa1 = new Empresa("TirameElBit", "Franco", 111);
            Empresa empresa1 = Empresa.builder().nombre("Tirame EL bit 2.0").razonSocial("Leandro").cuil(110).build();
            Empresa empresa2 = Empresa.builder().nombre("Tirame EL bit 3.5").razonSocial("Franco").cuil(210).build();

            Sucursal sucursal1 = Sucursal.builder().nombre("Celina").build();
            Sucursal sucursal2 = Sucursal.builder().nombre("Francisco").build();
            //Sucursal sucursal2 = new Sucursal("Leandro", empresa2);

            Domicilio domicilio1 = Domicilio.builder().calle("San Martin").numero(100).cp(54).build();
            Domicilio domicilio2 = Domicilio.builder().calle("Tunuyan").numero(101).cp(74).build();
            //Domicilio domicilio1 = new Domicilio("San martin", 100, 54, sucursal1);
            // Domicilio domicilio2 = new Domicilio("Las heras", 600, 546, sucursal2);

            Localidad localidad1 = Localidad.builder().nombre("Centro").build();
            Localidad localidad2 = Localidad.builder().nombre("Zona Norte").build();
            //Localidad localidad1 = new Localidad("Tunuyan", domicilio1);
            //Localidad localidad2 = new Localidad("Tunuyan", domicilio2);

            Provincia Mendoza = Provincia.builder().nombre("Mendoza").build();
            Provincia Brasilia = Provincia.builder().nombre("Brasilia").build();

            Pais Argentina = Pais.builder().nombre("Argentina").build();
            Pais Brasil = Pais.builder().nombre("Brasil").build();

            Categoria Bebidas = Categoria.builder().denominacion("Bebidas").build();
            Categoria Snacks = Categoria.builder().denominacion("Snacks").build();

            DetallePedido detallePedido1 = DetallePedido.builder().cantidad(100).subTotal(200.42).build();
            DetallePedido detallePedido2 = DetallePedido.builder().cantidad(10).subTotal(100.42).build();

            Pedido pedidoA = Pedido.builder()
                    .horaEstimadaFinalizacion(LocalTime.now())
                    .total(100.0)
                    .totalCosto(200.0)
                    .FechaPedido(LocalDate.now())
                    .sucursal(sucursal1)
                    .domicilio(domicilio1)
                    .formaPago(FormaPago.MERCADOPAGO)
                    .tipoEnvio(TipoEnvio.DELIVERY)
                    .build();

            Pedido pedidoB = Pedido.builder()
                    .horaEstimadaFinalizacion(LocalTime.now())
                    .total(100.0)
                    .totalCosto(200.0)
                    .FechaPedido(LocalDate.now())
                    .sucursal(sucursal1)
                    .domicilio(domicilio1)
                    .formaPago(FormaPago.EFECTIVO)
                    .tipoEnvio(TipoEnvio.TAKEAWAY)
                    .build();

            Factura facturaA = Factura.builder()
                    .fechaFacturacion(LocalDate.now())
                    .mpMerchantOrderId(1)
                    .mpPaymentId(1)
                    .formaPago(FormaPago.MERCADOPAGO)
                    .totalVenta(500.50)
                    .build();

            Factura facturaB = Factura.builder()
                    .fechaFacturacion(LocalDate.now())
                    .mpMerchantOrderId(2)
                    .mpPaymentId(2)
                    .formaPago(FormaPago.EFECTIVO)
                    .totalVenta(1500.50)
                    .build();

            Articulo articuloA = Articulo.builder().denominacion("Jugo Naranja").precioVenta(100.0).build();
            Articulo articuloB = Articulo.builder().denominacion("Alfajor Oreo").precioVenta(140.0).build();

            UnidadMedida mililitros = UnidadMedida.builder().denominacion("ml.").build();
            UnidadMedida gramos = UnidadMedida.builder().denominacion("gr.").build();

            Cliente clienteMestre = Cliente.builder()
                    .nombre("Francisco")
                    .apellido("Mestre")
                    .email("FranciscoMes86@gmail.com")
                    .telefono("2613075492")
                    .fechaNacimiento(LocalDate.of(2003,5,24)).build();

            Cliente clienteParedes = Cliente.builder()
                    .nombre("Leandro")
                    .apellido("Paredes")
                    .email("ParedesLea86@gmail.com")
                    .telefono("2613075492")
                    .fechaNacimiento(LocalDate.of(2006,6,25)).build();


            Usuario userA = Usuario.builder().auth0Id("01").username("PepitoCraft").build();
            Usuario userB = Usuario.builder().auth0Id("02").username("LeaGaymer").build();

            Promocion promoA = Promocion.builder()
                    .denominacion("2x1")
                    .FechaDesde(LocalDate.of(2025,5,28))
                    .FechaHasta(LocalDate.of(2025,6,5))
                    .HoraDesde(LocalTime.now())
                    .HoraHasta(LocalTime.now())
                    .descripcionDescuento("llevate 2 papas al precio de una")
                    .tipoPromocion(TipoPromocion.PROMOCION)
                    .build();

            Promocion promoB = Promocion.builder()
                    .denominacion("4x3")
                    .FechaDesde(LocalDate.of(2025,5,28))
                    .FechaHasta(LocalDate.of(2025,6,5))
                    .HoraDesde(LocalTime.now())
                    .HoraHasta(LocalTime.now())
                    .descripcionDescuento("llevate 4 Alfajores al precio de 3")
                    .tipoPromocion(TipoPromocion.PROMOCION)
                    .build();



            Imagen papas_2x1 = Imagen.builder().denominacion("img de papas 2x1").build();
            Imagen papas_4x3 = Imagen.builder().denominacion("img de Alfajores 4x3").build();

            ArticuloManufacturado jugo_naranja_manufactura = ArticuloManufacturado.builder()
                    .descripcion("Un jugo natural de naranja")
                    .tiempoEstimadoMinutos(1)
                    .preparacion("Exprimir Naranjas Naturales")
                    .build();

            ArticuloManufacturado alfajor_manufactura = ArticuloManufacturado.builder()
                    .descripcion("Un alfajor de chocolate")
                    .tiempoEstimadoMinutos(5)
                    .preparacion("Recibir las tapas , pegarlas y bañarlas de chocolate")
                    .build();

            ArticuloManufacturadoDetalle detalle_manufactura_jugo_naranja = ArticuloManufacturadoDetalle.builder()
                    .cantidad(100).build();

            ArticuloManufacturadoDetalle detalle_manufactura_Alfajor = ArticuloManufacturadoDetalle.builder()
                    .cantidad(75).build();

            ArticuloInsumo narajas = ArticuloInsumo.builder().denominacion("Naranja").build();
            ArticuloInsumo tapasDeAlfajor = ArticuloInsumo.builder().denominacion("Tapas de Alfajor").build();
    }

}