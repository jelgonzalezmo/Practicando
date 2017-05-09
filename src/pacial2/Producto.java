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
public class Producto {

    private String nombre;
    private double precio;
    private double referencia;
    private ArrayList<Insumos> insumoos;

    public Producto(String nombre, double precio, double referencia, ArrayList<Insumos> insumoos) {
        this.nombre = nombre;
        this.precio = precio;
        this.referencia = referencia;
        this.insumoos = insumoos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getReferencia() {
        return referencia;
    }

    public void setReferencia(double referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", referencia=" + referencia + ", insumoos=" + insumoos + '}';
    }

}
