package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

public final class Poker extends JuegosDeAzar implements Interfaz{

    private int tipoFicha;
    private int numeroPuesto;
    private double apuesta;
    private String mostrarJuegos;

    public Poker() {
    }

    public Poker(int numeroPuesto, double apuesta) {
        this.numeroPuesto = numeroPuesto;
        this.apuesta = apuesta;
    }

    public Poker(int tipoFicha, int numeroPuesto, double apuesta, String mostrarJuegos) {
        this.tipoFicha = tipoFicha;
        this.numeroPuesto = numeroPuesto;
        this.apuesta = apuesta;
        this.mostrarJuegos = mostrarJuegos;
    }



    public int getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(int tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public double getApuesta() {
        return apuesta;
    }

    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }

    public String getMostrarJuegos() {
        return mostrarJuegos;
    }

    public void setMostrarJuegos(String mostrarJuegos) {
        this.mostrarJuegos = mostrarJuegos;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tPoker" + "\nTipo de Ficha: " + tipoFicha + "\nNumero de Puesto: " + numeroPuesto + "\nApuesta: " + apuesta + "\nMostrar Juegos: " + mostrarJuegos + '"';
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
