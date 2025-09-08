import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ObraSocial osde = new ObraSocial("OSDE", 0.40); // 40% cubierto

        Paciente pac = new Paciente(1L, "32123456", "Juana", "Gómez", "1155555555", "AF-1234", osde);
        Odontologo odo = new Odontologo(2L, "20111222", "Ana", "López", "1144444444", "MAT-9988", "Endodoncia");

        // 1) Pedir turno (sobrecarga)
        Turno turno = pac.solicitarTurno(odo, LocalDateTime.now().plusDays(2));
        turno.confirmar();

        // 2) Asignar un tratamiento (polimorfismo)
        Tratamiento t = new Endodoncia("T-001", "Tratamiento de conducto", 35000, 3);
        odo.asignarTratamiento(t, turno);

        // 3) Facturar con cobertura
        Factura fac = new Factura(t, pac.getObraSocial());
        double aPagar = fac.total();
        System.out.println(fac);

        // 4) Pagar
        Pago pago = new PagoTarjeta(aPagar, "1234");
        System.out.println(pago.procesarPago());

        // 5) Registrar en historia clínica
        pac.getHistoriaClinica().agregarEntrada(
                new EntradaHC("Se realiza " + t.getDescripcion() + ". Estado del turno: " + turno.getEstado()));
        System.out.println("Entradas HC: " + pac.getHistoriaClinica().getEntradas().size());
    }
}
