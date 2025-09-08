public class Factura implements Facturable {
    private Tratamiento tratamiento;
    private ObraSocial obraSocial; // puede ser null si no tiene

    public Factura(Tratamiento tratamiento, ObraSocial obraSocial) {
        this.tratamiento = tratamiento;
        this.obraSocial = obraSocial;
    }

    // Polimorfismo por Tratamiento y aplicación de cobertura
    @Override
    public double total() {
        double base = tratamiento.calcularCosto();
        return (obraSocial != null) ? obraSocial.aplicarCobertura(base) : base;
    }

    @Override public String toString() {
        return "Factura{" + tratamiento.getDescripcion() + ", total=" + total() + "}";
    }
}
