package Ejercicio_01;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
        this.titular = titular;
        titular.setPasaporte(this);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular.getNombre() + "]";
    }
}