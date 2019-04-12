
package ec.edu.ups.clases;

public class Juegos {

    private int codigo;
    private String nombre;
    private String categorias;
    private int numeroJugadores;

    public Juegos() {
    }

    public Juegos(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Juegos(int codigo, String nombre, String categorias, int numeroJugadores) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categorias = categorias;
        this.numeroJugadores = numeroJugadores;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    @Override
    public String toString() {
        return "\t\tJuegos" + "\ncodigo: " + codigo + "\nnombre: " + nombre + "\ncategorias: " + categorias + "\nnumeroJugadores: " + numeroJugadores + '"';
    }
    
    
}
