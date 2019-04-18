
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Poker;
import java.util.HashSet;
import java.util.Set;

public class ControladorPoker {

    private Set<Poker> lista;
    private int codigo;

    public ControladorPoker() {
    
        lista = new HashSet<>();
        codigo = 0;
    
    }

    public void create(Poker objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public Poker read(Poker objeto){
        for (Poker poker : lista) {
            if(poker.getCodigo() == codigo){
                return poker;
            }
        }
        return null;
    }
    
    public void update(Poker objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delet(int codigo){
        for (Poker poker : lista) {
            if(poker.getCodigo() == codigo){
                lista.remove(poker);
            }
        }
    }
}

