package Ejercicio_14;

public class Main {
    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {
        
        Proyecto proyecto = new Proyecto("Proyect12", 10);
        String formato = "MP4";

        EditorVideo editor = new EditorVideo();
        editor.exportar(formato, proyecto);
    }    
}
