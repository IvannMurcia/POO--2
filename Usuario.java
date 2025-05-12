import java.util.ArrayList;
import java.util.List;

public class Usuario implements IUsuario {
    private List<String> usuarios;
    private ServiciodeArchivo servicioArchivo;
    private ServicioCorreoBienvenida servicioCorreo;

    public Usuario(ServiciodeArchivo servicioArchivo, ServicioCorreoBienvenida servicioCorreo) {
        this.usuarios = new ArrayList<>();
        this.servicioArchivo = servicioArchivo;
        this.servicioCorreo = servicioCorreo;
    }

    @Override
    public void agregarUsuario(String correo) {
        if (correo.contains("@")) {
            usuarios.add(correo);
            System.out.println("Usuario agregado: " + correo);
            servicioArchivo.guardarEnArchivo(correo);
            servicioCorreo.enviarCorreo(correo); // nueva responsabilidad delegada
        } else {
            System.out.println("Correo inválido");
        }
    }
}
