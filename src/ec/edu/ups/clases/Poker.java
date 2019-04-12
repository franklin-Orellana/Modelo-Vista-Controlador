package ec.edu.ups.clases;

public class Poker extends JuegosDeAzar{

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

    public Poker(int tipoFicha, int numeroPuesto, double apuesta, String mostrarJuegos, int numeroMesa, boolean fisico, String nombreDealer, String nombreJuego, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(numeroMesa, fisico, nombreDealer, nombreJuego, codigo, nombre, categorias, numeroJugadores);
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
        return "\t\tPoker" + "\nTipo de Ficha: " + tipoFicha + "\nNumero de Puesto: " + numeroPuesto + "\nApuesta: " + apuesta + "\nMostrar Juegos: " + mostrarJuegos + '"';
    }

    @Override
    public void Reglas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
