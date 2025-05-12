import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoManager gestorProductos = new ProductoManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú de Productos ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver productos");
            System.out.println("3. Buscar producto por ID");
            System.out.println("4. Eliminar producto por ID");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Categoría: ");
                    String categoria = scanner.nextLine();
                    gestorProductos.agregarProducto(nombre, precio, categoria);
                    break;

                case 2:
                    gestorProductos.verProductos();
                    break;

                case 3:
                    System.out.print("ID del producto: ");
                    int idBusqueda = scanner.nextInt();
                    scanner.nextLine(); 
                    Producto productoEncontrado = gestorProductos.buscarProductoPorId(idBusqueda);
                    if (productoEncontrado != null) {
                        System.out.println("Producto encontrado: " + productoEncontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();
                    gestorProductos.removerProductoPorId(idEliminar);
                    break;

                case 5:
                    System.out.println("¡Hasta pronto!");
                    return;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
