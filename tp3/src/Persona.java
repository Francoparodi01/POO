import java.util.Objects;

public abstract class Persona {
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona(Long id, String dni, String nombre, String apellido, String telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombreCompleto() { return nombre + " " + apellido; }

    // getters/setters básicos
    public Long getId() { return id; }
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override public String toString() { return getNombreCompleto() + " (DNI " + dni + ")"; }
    @Override public boolean equals(Object o) { return o instanceof Persona p && Objects.equals(dni, p.dni); }
    @Override public int hashCode() { return Objects.hash(dni); }
}
