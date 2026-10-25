package Ejercicio_14;

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
        Render rd = new Render(formato, proyecto);
        System.out.println("Render: " + rd.getFormato());        
    }
    
}
