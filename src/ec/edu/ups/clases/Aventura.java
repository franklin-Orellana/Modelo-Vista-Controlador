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
        return super.toString() + "\t\tAventura" + "\nmisiones=" + misiones + "\nobjetivos=" + objetivos + "\nlogro: " + logro + "\nmapa: " + mapa + '"';
    }

    @Override
    public void Multijugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void partidaInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void partidaTerminada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
