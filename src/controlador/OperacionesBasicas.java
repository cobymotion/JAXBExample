package controlador;

import java.util.List;
import modelo.Empleado;

/**
 *
 * @author luiscobian
 */
public interface OperacionesBasicas {
    
    // grabar 
    
    public boolean agregarEmpleado(Empleado em);
    
    public List<Empleado> consultar() ; 
    
    // consultar 
    
}
