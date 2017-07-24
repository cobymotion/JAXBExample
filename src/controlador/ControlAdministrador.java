/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Administrador;
import modelo.Empleado;
import modelo.MiMentisBD;
import modelo.Programador;

/**
 *
 * @author luiscobian
 */
public class ControlAdministrador  extends ControlEmpleado{
    
    @Override
    public List<Empleado> consultar() {
       List<Empleado> datos = new ArrayList<>(); 
       for(Empleado em : MiMentisBD.datos)
           if(em instanceof Administrador)
               datos.add(em);  
       return datos;
    }
    
}
