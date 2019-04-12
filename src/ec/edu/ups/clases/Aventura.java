package ec.edu.ups.clases;
public class Aventura {

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

    public Aventura(String misiones, String objetivos, String logro, String mapa) {
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

    @Override
    public String toString() {
        return "\t\tAventura" + "\nmisiones=" + misiones + "\nobjetivos=" + objetivos + "\nlogro: " + logro + "\nmapa: " + mapa + '"';
    }

}
