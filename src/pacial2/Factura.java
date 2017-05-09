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
public class Factura {

    private String fecha;
    private String Nombrecliente;
    private ArrayList<Ventas> ventas;

    public Factura(String fecha, String Nombrecliente, ArrayList<Ventas> ventas) {
        this.fecha = fecha;
        this.Nombrecliente = Nombrecliente;
        this.ventas = ventas;
    }

   

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombrecliente() {
        return Nombrecliente;
    }

    public void setNombrecliente(String Nombrecliente) {
        this.Nombrecliente = Nombrecliente;
    }

    public ArrayList<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Ventas> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Factura{" + "fecha=" + fecha + ", Nombrecliente=" + Nombrecliente + ", ventas=" + ventas + '}';
    }

  
   
   

     public void total() {
        double total = 0;
        for (int i = 0; i < ventas.size(); i++) {
           total += this.ventas.get(i).totalv();
        }
        System.out.println("total= " + total);

    }
}
