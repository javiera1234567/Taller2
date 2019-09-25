/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class VentaDAO {

    Conexion con;

    public VentaDAO() {
        this.con = new Conexion();
    }

    public ArrayList<Venta> getVentas() {

        ArrayList<Venta> ventas = new ArrayList<>();
        Connection accesoBD = con.getConexion();
        try {
            String sql = "SELECT * FROM venta";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                String sucursal = resultados.getString("sucursal");
                int monto = resultados.getInt("monto");
                int id_vendedor = resultados.getInt("id");
                String fecha = resultados.getString("fecha");
                ventas.add(new Venta(id_vendedor, sucursal, monto, fecha));
            }
            //accesoBD.close();
            return ventas;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }

    }

    public boolean insertarVenta(Venta p) {
        Connection accesoBD = con.getConexion();

        try {
//arreglar esto.
            String sql = "INSERT INTO venta(id_vendedor,sucursal,monto,fecha)"
                    + "VALUES (" + p.getId_Vendedor()+ ",'" + p.getSucursal()
                    + "'," + p.getMonto() + ",'" + p.getFecha() + "')";

            Statement st = accesoBD.createStatement();
            st.executeUpdate(sql);//execute update es para modificar la BD
            return true;
        } catch (Exception e) {
            System.out.println("Error al insertar persona");
            e.printStackTrace();
            return false;
        }
    }
}