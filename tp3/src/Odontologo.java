public class Odontologo extends Persona {
    private String matricula;
    private String especialidad;

    public Odontologo(Long id, String dni, String nombre, String apellido, String telefono,
                      String matricula, String especialidad) {
        super(id, dni, nombre, apellido, telefono);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public void asignarTratamiento(Tratamiento t, Turno turno) { turno.setTratamiento(t); }
}
