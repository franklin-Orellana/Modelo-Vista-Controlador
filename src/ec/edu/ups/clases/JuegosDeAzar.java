package ec.edu.ups.clases;

public class JuegosDeAzar {

    private int numeroMesa;
    private boolean fisico;
    private String nombreDealer;
    private String nombreJuego;

    public JuegosDeAzar() {
    }

    public JuegosDeAzar(int numeroMesa, boolean fisico) {
        this.numeroMesa = numeroMesa;
        this.fisico = fisico;
    }

    public JuegosDeAzar(int numeroMesa, boolean fisico, String nombreDealer, String nombreJuego) {
        this.numeroMesa = numeroMesa;
        this.fisico = fisico;
        this.nombreDealer = nombreDealer;
        this.nombreJuego = nombreJuego;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isFisico() {
        return fisico;
    }

    public void setFisico(boolean fisico) {
        this.fisico = fisico;
    }

    public String getNombreDealer() {
        return nombreDealer;
    }

    public void setNombreDealer(String nombreDealer) {
        this.nombreDealer = nombreDealer;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    @Override
    public String toString() {
        return "\t\tJuegos De Azar" + "\nNumero de Mesa: " + numeroMesa + "\nFisico: " + fisico + "\nNombre del Dealer: " + nombreDealer + "\nNombre de Juego: " + nombreJuego + '"';
    }
    
    
}
