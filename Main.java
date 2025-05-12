
public class Main {
    public static void main(String[] args) {
        ServiciodeArchivo archivo = new ServiciodeArchivo();
        ServicioCorreoBienvenida correo = new ServicioCorreoBienvenida();
        Usuario usuario = new Usuario(archivo, correo);

        usuario.agregarUsuario("juan@example.com");

        IGeneradorDeReportes reporte = new GeneradorDeReportes();
        reporte.generarReporte("WORD");
    }
}
