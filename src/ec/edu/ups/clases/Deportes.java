package ec.edu.ups.clases;
public final class Deportes extends JuegosDigital {

    private String nombreEquipo;
    private String tiempo;
    private boolean cambioJugador;
    private boolean cambioTactica;

    public Deportes() {
    }

    public Deportes(String nombreEquipo, String tiempo) {
        this.nombreEquipo = nombreEquipo;
        this.tiempo = tiempo;
    }

    public Deportes(String nombreEquipo, String tiempo, boolean cambioJugador, boolean cambioTactica, boolean online, boolean digital, String plataforma, String graficos, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(online, digital, plataforma, graficos, codigo, nombre, categorias, numeroJugadores);
        this.nombreEquipo = nombreEquipo;
        this.tiempo = tiempo;
        this.cambioJugador = cambioJugador;
        this.cambioTactica = cambioTactica;
    }

    
 
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isCambioJugador() {
        return cambioJugador;
    }

    public void setCambioJugador(boolean cambioJugador) {
        this.cambioJugador = cambioJugador;
    }

    public boolean isCambioTactica() {
        return cambioTactica;
    }

    public void setCambioTactica(boolean cambioTactica) {
        this.cambioTactica = cambioTactica;
    }

    @Override
    public String toString() {
        return "\t\tDeportes" + "\nnombreEquipo: " + nombreEquipo + "\ntiempo: " + tiempo + "\ncambioJugador: " + cambioJugador + "\ncambioTactica: " + cambioTactica + '"';
    }

    @Override
    public void Multijugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
