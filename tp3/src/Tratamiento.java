public abstract class Tratamiento {
    protected String codigo;
    protected String descripcion;
    protected double precioBase;

    public Tratamiento(String codigo, String descripcion, double precioBase) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    public abstract double calcularCosto(); // polimórfico
    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
}
