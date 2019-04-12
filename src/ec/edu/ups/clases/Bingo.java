package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

public final class Bingo extends JuegosDeAzar implements Interfaz {

    private int numeroTabla;
    private int numeroBolas;
    private String tipoPremio;
    private boolean comprobarTabla;

    public Bingo() {
    }

    public Bingo(int numeroTabla, int numeroBolas) {
        this.numeroTabla = numeroTabla;
        this.numeroBolas = numeroBolas;
    }

    public Bingo(int numeroTabla, int numeroBolas, String tipoPremio, boolean comprobarTabla) {
        this.numeroTabla = numeroTabla;
        this.numeroBolas = numeroBolas;
        this.tipoPremio = tipoPremio;
        this.comprobarTabla = comprobarTabla;
    }

    public int getNumeroTabla() {
        return numeroTabla;
    }

    public void setNumeroTabla(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    public int getNumeroBolas() {
        return numeroBolas;
    }

    public void setNumeroBolas(int numeroBolas) {
        this.numeroBolas = numeroBolas;
    }

    public String getTipoPremio() {
        return tipoPremio;
    }

    public void setTipoPremio(String tipoPremio) {
        this.tipoPremio = tipoPremio;
    }

    public boolean isComprobarTabla() {
        return comprobarTabla;
    }

    public void setComprobarTabla(boolean comprobarTabla) {
        this.comprobarTabla = comprobarTabla;
    }

    @Override
    public String toString() {
 
        return super.toString() + "\t\tBingo" + "\nnumeroTabla: " + numeroTabla + "\nnumeroBolas: " + numeroBolas + "\ntipoPremio: " + tipoPremio + "\ncomprobarTabla: " + comprobarTabla + '"';
    }

    @Override
    public void Reglas() {
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
