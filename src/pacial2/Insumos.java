/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacial2;

/**
 *
 * @author jeisson
 */
public class Insumos {

    private String nombre;
    private double precio;
    private double referencia;

    public Insumos(String nombre, double precio, double referencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.referencia = referencia;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Insumos{" + "nombre=" + nombre + ", precio=" + precio + ", referencia=" + referencia + '}';
    }

}
