package ec.edu.ups.clases;

public abstract class JuegosDigital extends Juego {

    private boolean modoOnline;
    private boolean digital;
    private String plataforma;
    private String graficos;

    public JuegosDigital() {
    }

    public JuegosDigital(boolean digital, String plataforma) {
        this.digital = digital;
        this.plataforma = plataforma;
    }

    public JuegosDigital(boolean modoOnline, boolean digital, String plataforma, String graficos, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(codigo, nombre, categorias, numeroJugadores);
        this.modoOnline = modoOnline;
        this.digital = digital;
        this.plataforma = plataforma;
        this.graficos = graficos;
    }

    public boolean isOnline() {
        return modoOnline;
    }

    public void setmodoOnline(boolean online) {
        this.modoOnline = online;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGraficos() {
        return graficos;
    }

    public void setGraficos(String graficos) {
        this.graficos = graficos;
    }

    public void cambioPlataforma() {

    }

    public void cambiomodoOnline() {
        
    }

    public abstract void Multijugador();

    @Override
    public String toString() {
        return super.toString() + "\n\t\tJuegos Digitales" + "\nOnline: " + modoOnline + "\nDigital: " + digital + "\nPlataforma: " + plataforma + "\nGraficos: " + graficos + '"';
    }

}
