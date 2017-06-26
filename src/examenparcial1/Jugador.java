package examenparcial1;  
/**
 * @author Alfredo
 */

public class Jugador {
    
    private int Edad;
    private String Nombre;
    private String Posicion;
    private String Pais; 
 
    public Jugador() {}
 
    public Jugador(int Edad, String Nombre, String Posicion, String Pais) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Posicion = Posicion;
        this.Pais = Pais; 
    }
 
    public int getEdad() {
        return Edad;
    } 
    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    } 
    
    public String getNombre() {
        return Nombre;
    } 
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    } 
    
    public String getPosicion() {
        return Posicion;
    }
    
    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
    
    public String getPais() {
        return Pais;
    }
    
    public void setPais(String Pais) {
        this.Pais = Pais;
    } 
    
    @Override
        public String toString() {
            return this.Nombre +". Posicion: "+this.Posicion +". Edad: "+this.Edad;
//            +" Edad: "+this.Edad+"/"+"-Posicion: "+this.Posicion
        }
}
