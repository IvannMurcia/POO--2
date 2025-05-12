public class GeneradorDeReportes implements IGeneradorDeReportes {
    @Override
    public void generarReporte(String tipo) {
        if (tipo.equalsIgnoreCase("PDF")) {
            System.out.println("Generando reporte en PDF");
        } else if (tipo.equalsIgnoreCase("EXCEL")) {
            System.out.println("Generando reporte en Excel");
        } else {
            System.out.println("Formato no soportado");
        }
    }
}
