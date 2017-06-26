
package examenparcial1;

/**
 * @author Alfredo
 */
public class Nodo {
    private Jugador vJugador;
    private Jugador Marca;
    private Nodo sig;
 
    public Nodo(Jugador pJugador, Jugador pMarca) {
        this.vJugador = pJugador;
        this.Marca=pMarca;
    }
 
    public Jugador getJugador() {
        return vJugador;
    }
 
    public void setJugador(Jugador pJugador) {
        this.vJugador = pJugador;
    }
     
    public Jugador getMarca() {
        return Marca;
    }
 
    public void setMarca(Jugador pMarca) {
        this.Marca = pMarca;
    }
 
    public Nodo getSig() {
        return sig;
    }
 
    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    
}
