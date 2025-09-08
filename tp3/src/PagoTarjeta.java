public class PagoTarjeta extends Pago {
    private String ultimos4;
    public PagoTarjeta(double monto, String ultimos4) {
        super(monto);
        this.ultimos4 = ultimos4;
    }
    @Override public String procesarPago() { return "Pago con tarjeta **** **** **** " + ultimos4 + " por $" + String.format("%.2f", monto); }
}
