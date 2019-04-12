package ec.edu.ups.clases;
public class JuegosDigital extends Juegos {

    private boolean online;
    private boolean digital;
    private String plataforma;
    private String graficos;

    public JuegosDigital() {
    }

    public JuegosDigital(boolean digital, String plataforma) {
        this.digital = digital;
        this.plataforma = plataforma;
    }

    public JuegosDigital(boolean online, boolean digital, String plataforma, String graficos, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(codigo, nombre, categorias, numeroJugadores);
        this.online = online;
        this.digital = digital;
        this.plataforma = plataforma;
        this.graficos = graficos;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
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

    @Override
    public String toString() {
        return "\t\tJuegos Digitales" + "Online: " + online + "\nDigital: " + digital + "\nPlataforma: " + plataforma + "\nGraficos: " + graficos + '"';
    }
    
    
}
