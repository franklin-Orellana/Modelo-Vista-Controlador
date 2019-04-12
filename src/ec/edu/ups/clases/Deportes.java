package ec.edu.ups.clases;
public class Deportes extends JuegosDigital {

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

    public Deportes(String nombreEquipo, String tiempo, boolean cambioJugador, boolean cambioTactica) {
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
    
    
    
}
