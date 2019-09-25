/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.VentaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author cristian
 */
public class ControladorReporte implements ActionListener{
  VentaDAO.getVentas();

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
