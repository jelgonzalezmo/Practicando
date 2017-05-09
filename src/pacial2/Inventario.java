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
public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void Productos() {
        System.out.println("Inventario= ");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto"+(i+1)+" "+this.productos.get(i).getNombre());
        }
    }

}
