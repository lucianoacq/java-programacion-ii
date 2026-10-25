package Ejercicio_08;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento(String titulo, String contenido, Usuario usuario, String codigoHash, String fecha){
        
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getContenido(){
        return contenido;
    }
    
    public FirmaDigital getFirmaDigital(){
        return firmaDigital;
    }
    
    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + "]";
    }
    
}
