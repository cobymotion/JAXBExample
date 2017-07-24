/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Frame;
import modelo.MiMentisBD;
import modelo.Programador;

/**
 *
 * @author luiscobian
 */
public class FrmAddProgramador extends FrmAddEmpleado {
    
    public FrmAddProgramador(Frame parent, boolean modal) {
        super(parent, modal);
        jLabel1.setText("Agregar Programador");
        jLabel4.setText("Lenguaje");
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Selecciona uno...");
        jComboBox1.addItem("Java");
        jComboBox1.addItem("C++");
        jComboBox1.addItem("C");
        jComboBox1.addItem("Python");
        jComboBox1.addItem("Ruby");
        jComboBox1.addItem("Swift");        
    }
    
    @Override
    public void grabarParticular(){
        System.out.println("Programador");
        String nombre = jTextField1.getText(); 
        String domicilio = jTextField2.getText(); 
        String lenguaje = jComboBox1.getSelectedItem()
                .toString();
        Programador p = new Programador
                   (nombre, domicilio, lenguaje); 
        MiMentisBD.datos.add(p);        
        this.dispose();
    }
    
}
