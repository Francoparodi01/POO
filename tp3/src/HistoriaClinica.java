import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistoriaClinica {
    private final List<EntradaHC> entradas = new ArrayList<>();

    public void agregarEntrada(EntradaHC e) { entradas.add(e); }
    public List<EntradaHC> getEntradas() { return Collections.unmodifiableList(entradas); }
}
