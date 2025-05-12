import java.util.*;


public class ProductoManager {
    private final List<Producto> productos = new ArrayList<>();
    private int ultimoId = 0;

    public void agregarProducto(String nombre, double precio, String categoria) {
        Producto producto = new Producto(ultimoId++, nombre, precio, categoria);
        productos.add(producto);
        System.out.println("Producto agregado.");
    }

    public void verProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    public Producto buscarProductoPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    public void removerProductoPorId(int id) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Producto eliminado.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
}