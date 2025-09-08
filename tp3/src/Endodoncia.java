public class Endodoncia extends Tratamiento {
    private int cantidadSesiones;

    public Endodoncia(String codigo, String descripcion, double precioBase, int cantidadSesiones) {
        super(codigo, descripcion, precioBase);
        this.cantidadSesiones = cantidadSesiones;
    }

    @Override
    public double calcularCosto() { return precioBase * Math.max(1, cantidadSesiones); }
}
