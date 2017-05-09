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
public class Baby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Insumos I1 = new Insumos("boton", 300, 5465);
        Insumos I2 = new Insumos("broche", 300, 5465);
        Insumos I3 = new Insumos("cremallera", 300, 5465);
        Insumos I4 = new Insumos("bordado", 300, 5465);
        ArrayList<Insumos> Insumo1 = new ArrayList<>();
        Insumo1.add(I1);
        Insumo1.add(I2);

        ArrayList<Insumos> Insumo2 = new ArrayList<>();
        Insumo2.add(I3);
        Insumo2.add(I4);

        Producto P1 = new Producto("body", 30.000, 12345, Insumo1);
        Producto P2 = new Producto("esqueleto", 10.000, 11343, Insumo2);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(P1);
        productos.add(P2);

        Ventas v1 = new Ventas(P1, 4);
        Ventas v2 = new Ventas(P2, 5);
        ArrayList<Ventas> ventas = new ArrayList<>();
        ventas.add(v1);
        ventas.add(v2);

        Inventario Invent = new Inventario(productos);
        Invent.Productos();
        Factura fac = new Factura("13-03-17", "oscar", ventas);

        System.out.println(productos.toString() + " " + fac.toString());
        fac.total();

    }

}
