package ec.edu.ups.controladores;

import ec.edu.ups.clases.Deporte;
import java.util.ArrayList;
import java.util.List;

public class ControladorDeporte {

    private List<Deporte> lista;

    public ControladorDeporte() {

        lista = new ArrayList<>();

    }

    public void create(Deporte objeto) {
        lista.add(objeto);
    }

    public Deporte read(int codigo) {
        for (Deporte deporte : lista) {
            if (deporte.getCodigo() == codigo) {
                return deporte;
            }
        }
        return null;
    }

    public void update(Deporte objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Deporte elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, objeto);
                break;

            }
        }

    }

    public void delete(Deporte objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Deporte elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.remove(i);
                break;
            }
        }
    }
}
