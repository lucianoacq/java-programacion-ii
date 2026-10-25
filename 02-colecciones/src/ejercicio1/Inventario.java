package ejercicio1;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public void listarProductos(){
        
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }    
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoriaProducto() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }
    
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);

        if (p != null) {
            productos.remove(p);
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);

        if (p != null) {
            p.setCantidad(nuevaCantidad);
        }
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;

        for (Producto p : productos) {
            totalStock += p.getCantidad();
        }
        
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock() {
        Producto mayorStock = null;
        
        for (Producto p : productos){
            if (mayorStock == null){
                mayorStock = p;
            } else if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        
        return mayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        
        ArrayList<Producto> resultado = new ArrayList<>();
        
        for (Producto p : productos){
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                resultado.add(p);
            }
        }

        return resultado;
    }
    
    public void mostrarCategoriasDisponibles() {
        
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("Categoria: " + categoria + " - Descripcion: " + categoria.getDescripcion());
        }
    }
    
    
}