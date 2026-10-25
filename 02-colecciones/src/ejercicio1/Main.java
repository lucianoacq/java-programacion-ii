
package ejercicio1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1. Crear el inventario y agregar 5 productos
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("P001", "Arroz", 1500, 20, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Leche", 1200, 35, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P003", "Auriculares", 22000, 12, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P004", "Remera", 2800, 18, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P005", "Lampara", 4500, 8, CategoriaProducto.HOGAR));

        // 2. Listar todos los productos
        System.out.println("=== LISTA DE PRODUCTOS ===");
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\n=== BUSCAR PRODUCTO POR ID ===");
        Producto buscado = inventario.buscarProductoPorId("P003");

        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado");
        }

        // 4. Filtrar productos por categoria
        System.out.println("\n=== PRODUCTOS DE ALIMENTOS ===");
        ArrayList<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        for (Producto p : alimentos) {
            p.mostrarInfo();
        }

        // 5. Eliminar un producto
        System.out.println("\n=== ELIMINAR PRODUCTO P005 ===");
        inventario.eliminarProducto("P005");
        inventario.listarProductos();

        // 6. Actualizar el stock
        System.out.println("\n=== ACTUALIZAR STOCK ===");
        inventario.actualizarStock("P001", 50);

        Producto actualizado = inventario.buscarProductoPorId("P001");

        if (actualizado != null) {
            actualizado.mostrarInfo();
        }

        // 7. Mostrar el total de stock
        System.out.println("\n=== TOTAL DE STOCK ===");
        System.out.println("Unidades disponibles: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();

        if (mayor != null) {
            mayor.mostrarInfo();
        }

        // 9. Filtrar productos por precio
        System.out.println("\n=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        ArrayList<Producto> productosFiltrados = inventario.filtrarProductosPorPrecio(1000, 3000);

        for (Producto p : productosFiltrados) {
            p.mostrarInfo();
        }

        // 10. Mostrar categorias disponibles
        System.out.println("\n=== CATEGORIAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();

    }
}
