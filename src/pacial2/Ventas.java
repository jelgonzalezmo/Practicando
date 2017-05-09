/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacial2;

import java.util.ArrayList;

/**
 *
 * @author jeisson
 */
public class Ventas {
    private Producto productos;
    private int cantidad;

    public Ventas(Producto productos, int cantidad) {
        this.productos = productos;
        this.cantidad = cantidad;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ventas{" + "productos= " + productos.getNombre() +" "+ "cantidad= "+ cantidad + '}';
    }

    

    
    
    
    public double totalv(){
        double vent= (this.productos.getPrecio()*cantidad);
        return vent;
    }
    
}
