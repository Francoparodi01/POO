import java.time.LocalDateTime;

public class Paciente extends Persona {
    private String numeroAfiliado;
    private ObraSocial obraSocial;
    private HistoriaClinica historiaClinica = new HistoriaClinica();

    public Paciente(Long id, String dni, String nombre, String apellido, String telefono,
                    String numeroAfiliado, ObraSocial obraSocial) {
        super(id, dni, nombre, apellido, telefono);
        this.numeroAfiliado = numeroAfiliado;
        this.obraSocial = obraSocial;
    }

    // Sobrecarga: pedir turno con String o con LocalDateTime
    public Turno solicitarTurno(Odontologo odontologo, String fechaHoraISO) {
        return solicitarTurno(odontologo, LocalDateTime.parse(fechaHoraISO));
    }
    public Turno solicitarTurno(Odontologo odontologo, LocalDateTime fechaHora) {
        return new Turno(this, odontologo, fechaHora);
    }

    public HistoriaClinica getHistoriaClinica() { return historiaClinica; }
    public ObraSocial getObraSocial() { return obraSocial; }
}
