package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

public final class Aventura extends JuegosDigital implements Interfaz {

    private String misiones;
    private String objetivos;
    private String logro;
    private String mapa;

    public Aventura() {
    }

    public Aventura(String misiones, String objetivos) {
        this.misiones = misiones;
        this.objetivos = objetivos;
    }

    public Aventura(String misiones, String objetivos, String logro, String mapa, boolean modoOnline, boolean digital, String plataforma, String graficos, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(modoOnline, digital, plataforma, graficos, codigo, nombre, categorias, numeroJugadores);
        this.misiones = misiones;
        this.objetivos = objetivos;
        this.logro = logro;
        this.mapa = mapa;
    }

    

    public String getMisiones() {
        return misiones;
    }

    public void setMisiones(String misiones) {
        this.misiones = misiones;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getLogro() {
        return logro;
    }

    public void setLogro(String logro) {
        this.logro = logro;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public void guardarMisiones(){
        
    }
    
    public void guardarMapa(){
        
    }
    
    public void guardarLogros(){
        
    }
    
    @Override
    public void Multijugador() {
        System.out.println("El juego es multijugador y pueden jugar hasta "+this.getNumeroJugadores()+" jugadores");    
    }

    @Override
    public void partidaInicio() {
        System.out.println("Partida a dado inicio " +this.getNombre());    
    }

    @Override
    public void partidaTerminada() {
        System.out.println("La Partida a terminado " +this.getNombre());    
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nAventura" + "\nmisiones: " + misiones + "\nobjetivos: " + objetivos + "\nlogro: " + logro + "\nmapa: " + mapa + '"';
    }

    

}
