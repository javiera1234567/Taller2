/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author cristian
 */
public class Venta{
   int id_Vendedor;
   private String sucursal;
   private int monto;
   private String fecha;

    public Venta(int id_Vendedor, String sucursal, int monto, String fecha) {
        this.id_Vendedor = id_Vendedor;
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
    }

   
    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public void setId_Vendedor(int id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }
   


 
    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto (int modelo) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
 
}
