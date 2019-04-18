package ec.edu.ups.controladores;

import ec.edu.ups.clases.Bingo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControladorBingo {

    private Set<Bingo> lista;
    private int codigo;
    
    public ControladorBingo() {
    
        lista = new HashSet<>();
        codigo = 0;
    }
    
    public void create(Bingo objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
                
    }
    
    public Bingo read(Bingo objeto){
        for (Bingo bingo : lista) {
            if(bingo.getCodigo() == codigo){
                return bingo;
            }
            
        }
        return null;
    }
    
    public void upday(Bingo objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Bingo bingo : lista) {
            if(bingo.getCodigo() == codigo){
                lista.remove(bingo);
            }
            
        }
     
    }
    
}
