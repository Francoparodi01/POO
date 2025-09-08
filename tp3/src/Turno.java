import java.time.LocalDateTime;

public class Turno {
    private Paciente paciente;
    private Odontologo odontologo;
    private LocalDateTime fechaHora;
    private EstadoTurno estado = EstadoTurno.PENDIENTE;
    private Tratamiento tratamiento;

    public Turno(Paciente paciente, Odontologo odontologo, LocalDateTime fechaHora) {
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaHora = fechaHora;
    }

    public void confirmar() { this.estado = EstadoTurno.CONFIRMADO; }
    public void cancelar()  { this.estado = EstadoTurno.CANCELADO;  }
    public void atender()   { this.estado = EstadoTurno.ATENDIDO;  }

    public void setTratamiento(Tratamiento tratamiento) { this.tratamiento = tratamiento; }
    public Tratamiento getTratamiento() { return tratamiento; }
    public Paciente getPaciente() { return paciente; }
    public Odontologo getOdontologo() { return odontologo; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public EstadoTurno getEstado() { return estado; }

    @Override public String toString() {
        return "Turno " + fechaHora + " - " + paciente.getNombreCompleto() + " con " + odontologo.getNombreCompleto();
    }
}
