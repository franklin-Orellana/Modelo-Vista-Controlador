package ec.edu.ups.clases;
public class Bingo extends JuegosDeAzar {

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
 
        return "\t\tBingo" + "\nnumeroTabla: " + numeroTabla + "\nnumeroBolas: " + numeroBolas + "\ntipoPremio: " + tipoPremio + "\ncomprobarTabla: " + comprobarTabla + '"';
    }
    
    
}
