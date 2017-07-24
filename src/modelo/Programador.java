package modelo;

public class Programador extends Empleado{
    
    private String lenguaje; 
    
    public Programador(String nombre, String domicilio, 
                       String lenguaje) {
        super(nombre, domicilio);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    
    
}
