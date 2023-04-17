/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda.de.productos.dos;

/**
 *
 * @author SG701-03
 */
public class TiendaDeProductosDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        double resultado1;
        double resultado2;

        Producto marcador = new Producto("Marcador", 1, 55, 10, 1500, 100);

        System.out.println(marcador);

        Producto libreta = new Producto("libreta", 1, 23, 15, 5500, 87);
        System.out.println(libreta);

        Producto leche = new Producto("leche", 2, 150, 30, 2100, 30);

        System.out.println(leche);

        Producto jabón_en_polvo = new Producto("jabón en polvo", 2, 15, 50, 4200, 80);
        System.out.println(jabón_en_polvo);

        Producto aspirina = new Producto("Aspirina", 3, 60, 100, 2400, 200);
        System.out.println(aspirina);
        //cantidad bodega - cantidad minima leche

        int diferenciabodegaMinimo = leche.getCantidadBodega() - leche.getCantidadMinima();
        System.out.println("Diferencia cantidad bodega y inima leche:" + diferenciabodegaMinimo);
//aspiribna val unitario 7(cantidad bodega * 12 )

        double valUnitariVsBodega = aspirina.getValorU() / (aspirina.getCantidadBodega() * 12);
        System.out.println("valor unitario / cantidadbodega * 12 de la aspirina es : " + valUnitariVsBodega);
//jabon valor u x total
        double valorCantidadTotal = (jabón_en_polvo.getTotalProductosVendidos() + jabón_en_polvo.getCantidadBodega()) / (jabón_en_polvo.getValorU() + jabón_en_polvo.getValorU() * Producto.IVA_SUPERMERCADO);
        System.out.println("El valor unitario por la cantidad de productos es:" + valorCantidadTotal);
//valor en bodega / cantidad minima libreta
        double ValorBodegaVsCantidadminima = libreta.getValorU() * libreta.getCantidadBodega() / libreta.getCantidadMinima();
//iva total de la venta de leche
        double valorVentaDeLeche = leche.getValorU() * leche.getTotalProductosVendidos() * Producto.IVA_SUPERMERCADO;
//valoru * iva + 1*productos vendidos/cant bodega aspirina
        double valorUIvaPorBodega = aspirina.getValorU() * (1 + Producto.IVA_FARMACIA) * aspirina.getTotalProductosVendidos() / aspirina.getCantidadBodega();
//crear tienda
        Tienda miTienda = new Tienda(libreta, leche, jabón_en_polvo, aspirina);
        System.out.println("Mi Tienda: " + miTienda.toString());
//valores unitarios
        miTienda.ValoresU();
        System.out.println("El pomedio de los valors unitarios es:");
        miTienda.PromedioVU();
        System.out.println("el iva de la mercancia en bodega de las libretas es: ");
        miTienda.IVAValorUnitarioBodega();

        System.out.println(libreta.getTipo() == Producto.PAPELERIA);
        System.out.println(libreta.getTipo() != Producto.DROGUERIA);
        System.out.println(leche.getCantidadMinima() >= leche.getCantidadBodega());
        System.out.println(jabón_en_polvo.getValorU() <= 1000);
        System.out.println(aspirina.getCantidadBodega() - aspirina.getCantidadMinima() != aspirina.getTotalProductosVendidos());
        System.out.println(jabón_en_polvo.getCantidadBodega() * jabón_en_polvo.getValorU() == jabón_en_polvo.getTotalProductosVendidos() * Producto.IVA_PAPELERIA);
        System.out.println(miTienda.getProducto1().getTotalProductosVendidos() + miTienda.getProducto2().getTotalProductosVendidos() > miTienda.getProducto3().getTotalProductosVendidos());
//calcular valor producto
        miTienda.calcularDineroEncaja();
//miTienda.calcularDineroEncaja()<=miTienda.calcularCajaProducto(miTienda.getProducto4())
        System.out.println("dinero en caja <=producto1.darproductosvendidos" + (miTienda.calcularDineroEncaja() <= miTienda.calcularCajaProducto(miTienda.getProducto4())));
//calcular valores unitarios
miTienda.valorunitarios();
//hacer pedido
miTienda.Pedidotodos();
//pedir productos
System.out.println("pedir productos: ");
miTienda.cuantopedirProductos();
//cambiar valores unitarios

miTienda.cambiarValoresUnitarios();

//venta
System.out.println("productos para vender 255 bolsas de leche= " + leche.haySuficienteCantidad(255));

//descuento 
System.out.println("se hizo un pedido de 20 leches y se le hace un descuento de 10%=" + leche.Descuento(20) );
// se vende 100 leches
System.out.println("se vendieron 200 leches entonces se lñe hace un incremento del 10%=" + leche.seaVendidoMasOMenosdeCien(200));

    }

 
}
