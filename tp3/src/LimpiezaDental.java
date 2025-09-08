public class LimpiezaDental extends Tratamiento {
    private boolean usaFluor;

    public LimpiezaDental(String codigo, String descripcion, double precioBase, boolean usaFluor) {
        super(codigo, descripcion, precioBase);
        this.usaFluor = usaFluor;
    }

    @Override
    public double calcularCosto() { return usaFluor ? precioBase * 1.20 : precioBase; }
}
