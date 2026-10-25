package Ejercicio_09;

public class CitaMedica {

    private String fecha;
    private String hora;
    private Profesional profesional;
    private Paciente paciente;
    
    public CitaMedica(String fecha, String hora, Profesional profesional, Paciente paciente){
        
        this.fecha = fecha;
        this.hora = hora;
        this.profesional = profesional;
        this.paciente = paciente;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public String getHora(){
        return hora;
    }
    
    public Profesional getProfesional(){
        return profesional;
    }
    
    public Paciente getPaciente(){
        return paciente;
    }
    
    @Override
    public String toString(){
        return "Cita medica [fecha=" + fecha + ", hora=" + hora + ", profesional=" + profesional + ", paciente=" + paciente + "]";
    }
    
}
