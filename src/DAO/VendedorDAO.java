/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Vendedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VendedorDAO {

    Conexion con;

    public VendedorDAO() {
        this.con = new Conexion();
    }


    public ArrayList<Vendedor> getVendedores() {

        ArrayList<Vendedor> vendedores = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM vendedor ";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                int id = resultados.getInt("id");
                String rut =resultados.getString("rut");
                vendedores.add(new Vendedor(id, nombre, apellido, rut));
            }
            //accesoBD.close();
            return vendedores;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
    }
}
