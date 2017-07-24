package modelo;

public class Administrador extends Empleado{
    String area; 
    
    public Administrador(String nombre, String domicilio
                         ,String area) {
        super(nombre, domicilio);
        this.area = area; 
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
}
