/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.de.productos.dos;

/**
 *
 * @author SG701-03
 */
public class Producto {
    //constantes 
    public final static int PAPELERIA=1;
    public final static int MERCADO=2;
    public final static int DROGUERIA=3;
    //IVA CONSTANTE  
    public final static double IVA_PAPELERIA=0.16;
    public final static double IVA_SUPERMERCADO=0.04;
    public final static double IVA_FARMACIA=0.12;
    //atributos
    private String nombre;
    private int tipo;
    private int cantidadBodega;
    private int cantidadMinima;
    private double ValorU;
    private int totalProductosVendidos;
    
    //constructores

    public Producto() {
    }

    public Producto(String nombre, int tipo, int cantidadBodega, int cantidadMinima, double ValorU, int totalProductosVendidos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.ValorU = ValorU;
        this.totalProductosVendidos = totalProductosVendidos;
    }
    
    //get  y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public double getValorU() {
        return ValorU;
    }

    public void setValorU(double ValorU) {
        this.ValorU = ValorU;
    }

    public int getTotalProductosVendidos() {
        return totalProductosVendidos;
    }

    public void setTotalProductosVendidos(int totalProductosVendidos) {
        this.totalProductosVendidos = totalProductosVendidos;
    }
    
//to string

    @Override
    public String toString() {
        return "Producto{" + "\nombre=" + nombre + ",\n tipo=" + tipo + ",\n cantidadBodega=" + cantidadBodega + ", \ncantidadMinima=" + cantidadMinima + ", \nValorU=" + ValorU + "\n, totalProductosVendidos=" + totalProductosVendidos + '}';
    }
//cantidad 
    public boolean haySuficienteCantidad (int
cantidad){
    if(this.cantidadBodega>=cantidad){
        return true;
        
    
    }
    else{
    return false;
    }
    }

//descuento 
    public double  descuento(){
    double venta=this.totalProductosVendidos*this.ValorU-((this.totalProductosVendidos*this.ValorU)*0.10);
    return venta;
            
    
    }
    public double Descuento (int cantidad ){
     if (this.totalProductosVendidos>cantidad){
     return descuento();
     }
     else{
         return 0;
     }
    
    }
 //venta menos o mas de     productos
       public double  menosdecien(){
    double venta=this.totalProductosVendidos*this.ValorU-((this.totalProductosVendidos*this.ValorU)*0.20);
    return venta;
       }
       
         public double  masdecien(){
    double venta=this.totalProductosVendidos*this.ValorU+((this.totalProductosVendidos*this.ValorU)*0.10);
    return venta;
       }
        
         public double seaVendidoMasOMenosdeCien(int cantidad){
         
             if (cantidad>=100){
             
             return masdecien();
             
             }
             else {
             
             return masdecien();
             }
         
         
         
         }
        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }


    
  





    
    
    
    
    
    
    
