/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.de.productos.dos;

/**
 *
 * @author SG701-03
 */
public class Tienda {

    //atributos
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private Producto producto4;

//constructor
    public Tienda() {
        producto1 = new Producto();
        producto2 = new Producto();
        producto3 = new Producto();
        producto4 = new Producto();

    }

    public Tienda(Producto producto1, Producto producto2, Producto producto3, Producto producto4) {
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
        this.producto4 = producto4;

    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public Producto getProducto4() {
        return producto4;
    }

    public void setProducto4(Producto producto4) {
        this.producto4 = producto4;
    }
    //to string

    @Override
    public String toString() {
        return "Tienda{" + "producto1=" + producto1 + ", producto2=" + producto2 + ", producto3=" + producto3 + ", producto4=" + producto4 + '}';
    }

    //valo unitario 
    public void ValoresU() {

        System.out.println("\nlos valores unitarios son: " + this.producto1.getNombre() + this.producto1.getValorU() + " " + this.producto2.getNombre() + this.producto2.getValorU() + " " + this.producto3.getNombre() + this.producto3.getValorU() + " " + this.producto4.getNombre() + this.producto4.getValorU());
    }

    // promedio valores unitarios 
    public void PromedioVU() {
        System.out.println((this.producto1.getValorU() + this.producto2.getValorU() + this.producto3.getValorU() + this.producto4.getValorU()) / 4);

    }

    //detalles producto 1
    public void IVAValorUnitarioBodega() {
        System.out.println((this.producto1.getCantidadBodega() - this.producto1.getCantidadMinima()) * (this.producto1.getValorU() * (1 + Producto.IVA_PAPELERIA)));

    }
//dinero en caja 

    public double DineroEnCajaPapeleria(Producto prod) {

        double dinero = prod.getTotalProductosVendidos() * prod.getValorU() * (1 * Producto.IVA_PAPELERIA);
        System.out.println("Prar el producto " + prod.getNombre() + " su dinero en caja es " + dinero);
        return dinero;
    }
//dinero caja mercado

    public double DineroEnCajaMercado(Producto prod) {

        double dinero = prod.getTotalProductosVendidos() * prod.getValorU() * (1 * Producto.IVA_SUPERMERCADO);
        System.out.println("Prar el producto " + prod.getNombre() + " su dinero en caja es " + dinero);
        return dinero;
    }
//dinero en caja farmacia   

    public double DineroEnCajaFarmacia(Producto prod) {

        double dinero = prod.getTotalProductosVendidos() * prod.getValorU() * (1 * Producto.IVA_FARMACIA);
        System.out.println("Prar el producto " + prod.getNombre() + " su dinero en caja es " + dinero);
        return dinero;
    }
    //calcular dinero en caja de un producto

    public double calcularCajaProducto(Producto prod) {
        if (prod.getTipo() == Producto.PAPELERIA) {
            return DineroEnCajaPapeleria(prod);
        } else {
            if (prod.getTipo() == Producto.IVA_FARMACIA) {
                return DineroEnCajaFarmacia(prod);
            } else {

                return DineroEnCajaMercado(prod);
            }
        }

    }

    //
    public double calcularDineroEncaja() {
        return calcularCajaProducto(producto1)
                + calcularCajaProducto(producto2)
                + calcularCajaProducto(producto3)
                + calcularCajaProducto(producto4);

    }
//

    public double SuvirbalorBunitarioUnoporciento(Producto prod) {
        double valorU = prod.getValorU() + (prod.getValorU() * 0.01);
        System.out.println("Parar el producto " + prod.getNombre() + " su vlaor unitario es  " + valorU);
        return valorU;
    }

    public double SuvirbalorBunitarioDosporciento(Producto prod) {
        double valorU = prod.getValorU() + (prod.getValorU() * 0.02);
        System.out.println("Parar el producto " + prod.getNombre() + " su vlaor unitario es  " + valorU);
        return valorU;
    }

    public double SuvirbalorBunitarioTresporciento(Producto prod) {
        double valorU = prod.getValorU() + (prod.getValorU() * 0.03);
        System.out.println("Parar el producto " + prod.getNombre() + " su vlaor unitario es  " + valorU);
        return valorU;
    }

    //
    public double SubirValorUnitario(Producto prod) {

        if (prod.getValorU() < 1000) {
            return SuvirbalorBunitarioUnoporciento(prod);
        } else {
            if (prod.getValorU() >= 1000 && prod.getValorU() <= 5000) {
                return SuvirbalorBunitarioDosporciento(prod);
            } else {

                return SuvirbalorBunitarioTresporciento(prod);

            }

        }
    }

    public double valorunitarios() {
        return SubirValorUnitario(producto1)
                + SubirValorUnitario(producto2)
                + SubirValorUnitario(producto3)
                + SubirValorUnitario(producto4);

    }

   

    public void hacerPedido(Producto prod) {
        if (prod.getCantidadBodega() < prod.getCantidadMinima()) {
            System.out.println("el pedido del producto " + prod.getNombre()+ " se puede hacer");
          

        } else {
            
            System.out.println("no se puede hacer el pedido del producto " + prod.getNombre());
        }

    }

    public void Pedidotodos() {
        hacerPedido(producto1);
        hacerPedido(producto2);
        hacerPedido(producto3);
        hacerPedido(producto4);

    }
///

    public double pedircantidadPapeleria(Producto prod) {
        double pedido = prod.getCantidadMinima() * 3;
        System.out.println("la cantidad a pedir es " + pedido);
        return pedido;
    }

    public double pedircantidadFarmacia(Producto prod) {
        double pedido = prod.getCantidadMinima() * 2;
        System.out.println("la cantidad a pedir es " + pedido);
        return pedido;
    }

    public double pedircantidadMercado(Producto prod) {
        double pedido = prod.getCantidadMinima() * 4;
        System.out.println("la cantidad a pedir es " + pedido);
        return pedido;
    }

    public void cuantoPedir(Producto prod) {
        if (prod.getCantidadBodega() < prod.getCantidadMinima()) {
            if (prod.getTipo() == Producto.PAPELERIA) {
                pedircantidadPapeleria(prod);
            } else {
                if (prod.getTipo() == Producto.MERCADO) {
                    pedircantidadMercado(prod);
                }
            }
        } else {
            if (prod.getTipo() == Producto.DROGUERIA) {
                pedircantidadFarmacia(prod);
            }
        }

        
        
    }
public void cuantopedirProductos(){
    cuantoPedir(producto1);
        cuantoPedir(producto2);
         cuantoPedir(producto3);
          cuantoPedir(producto4);
}

//cambiar valores unitarios
public double valorUnitariosDroggeriaYPapeleria(Producto prod){
double valorU= prod.getValorU() - (prod.getValorU()*0.10);
        return valorU;
}
public double valorUnitariosMercado(Producto prod){
double valorU= prod.getValorU() - (prod.getValorU()*0.05);
        return valorU;
}

public double cambiarValorUnitario(Producto prod){
if (prod.getTipo()==Producto.IVA_PAPELERIA || prod.getTipo()==Producto.DROGUERIA){
    return valorUnitariosDroggeriaYPapeleria(prod);

}
else{
   return valorUnitariosMercado(prod);
    
}

}
public double cambiarValoresUnitarios(){
return cambiarValorUnitario(producto1)
        +cambiarValorUnitario(producto2)
        +cambiarValorUnitario(producto3)
        +cambiarValorUnitario(producto4);


}
//determinar cantidad de productos
public boolean ProductosParaVenta(Producto prod){
if (prod.getCantidadMinima()<prod.getCantidadBodega()){
    System.out.println("se puede hacer la venta " + prod.getTipo());
    return true;
}
else{
        return false;
}

} 
//return productos para venta

public void ProductosParaLaVenta(){
    ProductosParaVenta(producto1);
    ProductosParaVenta(producto2);
    ProductosParaVenta(producto3);
    ProductosParaVenta(producto4);

}

 public double getIvaProducto (Producto prod){
 
 
 double ivaProd=0.0;
 switch (prod.getTipo()){
     case Producto.PAPELERIA:
     
          ivaProd=prod.IVA_PAPELERIA;
     
      
         
     case Producto.DROGUERIA:
         ivaProd = prod.IVA_FARMACIA;
           break;
     
     case Producto.MERCADO:
            ivaProd = prod.IVA_SUPERMERCADO;
         break;
 
 
 }           
 return ivaProd;
 }
   






}


