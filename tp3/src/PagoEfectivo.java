public class PagoEfectivo extends Pago {
    public PagoEfectivo(double monto) { super(monto); }
    @Override public String procesarPago() { return "Pago en efectivo: $" + String.format("%.2f", monto); }
}
