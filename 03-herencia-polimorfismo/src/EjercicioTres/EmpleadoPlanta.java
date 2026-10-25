package EjercicioTres;

public class EmpleadoPlanta extends Empleado{
    
    private double sueldoBase;
    private int antiguedad;
    
    public EmpleadoPlanta(double sueldoBase, int antiguedad){
        
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * 0.05 * antiguedad);
    }
    
}
