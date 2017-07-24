/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Frame;
import modelo.Administrador;
import modelo.MiMentisBD;
import modelo.Programador;

/**
 *
 * @author luiscobian
 */
public class FrmAddAdministrador extends FrmAddEmpleado{
    
    public FrmAddAdministrador(Frame parent, boolean modal) {
        super(parent, modal);
        jLabel1.setText("Agregar Administrador");
        jLabel4.setText("Area");
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Selecciona uno...");
        jComboBox1.addItem("Finanzas");
        jComboBox1.addItem("Recursos Humanos");
        jComboBox1.addItem("Direccion");
        jComboBox1.addItem("Sistemas");
        jComboBox1.addItem("Compras");
        jComboBox1.addItem("Mantenimiento");        
    }
    
     @Override
    public void grabarParticular(){
        System.out.println("Administrador");
        String nombre = jTextField1.getText(); 
        String domicilio = jTextField2.getText(); 
        String area = jComboBox1.getSelectedItem()
                .toString();
         Administrador p = new Administrador(nombre, domicilio, area)
                   ; 
        MiMentisBD.datos.add(p);        
        this.dispose();
    }
    
}
