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

    public Bingo(int numeroTabla, int numeroBolas, String tipoPremio, boolean comprobarTabla, int numeroMesa, boolean fisico, String nombreDealer, String nombreJuego, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(numeroMesa, fisico, nombreDealer, nombreJuego, codigo, nombre, categorias, numeroJugadores);
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

    public void cambiarTabla(){
        
    }
    
    public void cambiartipoPremio(){
        
    }
    
    public void modificarnumeroBolas(){
        
    }
    
    @Override
    public void Reglas() {
        System.out.println("En el "+this.getNombre()+" no puede haber mas de dos fichas en el mismo casillero ");
    }

    @Override
    public void partidaInicio() {
        System.out.println("Partida a dado inicio "+this.getNombre());
    }

    @Override
    public void partidaTerminada() {
        System.out.println("La Partida a terminado "+this.getNombre());
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\t\tBingo" + "\nnumeroTabla: " + numeroTabla + "\nnumeroBolas: " + numeroBolas + "\ntipoPremio: " + tipoPremio + "\ncomprobarTabla: " + comprobarTabla + '"';
    }


}
