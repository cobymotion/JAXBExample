package controlador;

import java.util.List;
import modelo.Empleado;

/**
 *
 * @author luiscobian
 */
public class ControlEmpleado implements OperacionesBasicas {

    @Override
    public boolean agregarEmpleado(Empleado em) {
        modelo.MiMentisBD.datos.add(em); 
        return true; 
    }

    @Override
    public List<Empleado> consultar() {
        return modelo.MiMentisBD.datos;
    }
    
}
