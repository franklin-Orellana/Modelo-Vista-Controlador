                    package ec.edu.ups.controladores;

import ec.edu.ups.clases.Aventura;
import java.util.ArrayList;
import java.util.List;

public class ControladorAventura {

    private List<Aventura> lista;

    public ControladorAventura() {
        lista = new ArrayList<>();
    }

    public void create(Aventura objeto) {
        lista.add(objeto);
    }

    public Aventura read(int codigo) {
        for (Aventura aventura : lista) {
            if (aventura.getCodigo() == codigo) {
                return aventura;
            }
        }
        return null;
    }

    public void update(Aventura objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Aventura elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, objeto);
                break;
            }
        }
    }

    public void delete(Aventura objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Aventura elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.remove(i);
                break;
            }
        }

    }
}
