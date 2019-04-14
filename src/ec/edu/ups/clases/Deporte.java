package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

public final class Deporte extends JuegosDigital implements Interfaz {

    private String nombreEquipo;
    private String tiempo;
    private boolean cambioJugador;
    private boolean cambioTactica;

    public Deporte() {
    }

    public Deporte(String nombreEquipo, String tiempo) {
        this.nombreEquipo = nombreEquipo;
        this.tiempo = tiempo;
    }

    public Deporte(String nombreEquipo, String tiempo, boolean cambioJugador, boolean cambioTactica, boolean modoOnline, boolean digital, String plataforma, String graficos, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(modoOnline, digital, plataforma, graficos, codigo, nombre, categorias, numeroJugadores);
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

    public void cambiarnombreEquipo(){
        
    }
    
    public void modificarTiempo(){
        
    }
    
    public void modificarTactica(){
        
    }
    
    @Override
    public void Multijugador() {
        System.out.println("El juego es multijugador y pueden jugar hasta "+this.getNumeroJugadores()+" jugadores");    
    }

    @Override
    public void partidaInicio() {
        System.out.println("La Partida a dado inicio " +this.getNombre());    
    }

    @Override
    public void partidaTerminada() {
        System.out.println("La Partida a terminado "+ this.getNombre());    
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\t\tDeporte\n" + "\nNombre De Equipo: " + nombreEquipo + "\nTiempo De Juego: " + tiempo + "\nCambio De Jugador: " + cambioJugador + "\nCambio De Tactica: " + cambioTactica + '"';
    }

    
    
    
    
}
