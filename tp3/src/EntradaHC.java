import java.time.LocalDateTime;

public class EntradaHC {
    private LocalDateTime fecha = LocalDateTime.now();
    private String texto;

    public EntradaHC(String texto) { this.texto = texto; }
    public LocalDateTime getFecha() { return fecha; }
    public String getTexto() { return texto; }
}
