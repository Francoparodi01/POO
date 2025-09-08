public class ObraSocial {
    private String nombre;
    // porcentaje entre 0 y 1 (ej: 0.4 = 40% cubierto)
    private double porcentajeCobertura;

    public ObraSocial(String nombre, double porcentajeCobertura) {
        this.nombre = nombre;
        this.porcentajeCobertura = porcentajeCobertura;
    }

    /** Devuelve el monto que paga el paciente (copago) */
    public double aplicarCobertura(double monto) {
        return monto * (1 - porcentajeCobertura);
    }

    @Override public String toString() { return nombre + " (" + (int)(porcentajeCobertura*100) + "%)"; }
}
