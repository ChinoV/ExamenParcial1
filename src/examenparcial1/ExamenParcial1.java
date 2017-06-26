package examenparcial1;
/** 
 * @author Alfredo
 */
public class ExamenParcial1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Jugador Claudio = new Jugador(27, "Claudio Bravo", "Portero", "Chile");
        Jugador Ismael = new Jugador(28, "Ismael Fuentes", "Defensa", "Chile");
        Jugador Waldo = new Jugador(27, "Waldo Ponce", "Defensa", "Chile");
        Jugador Mark = new Jugador(25, "Mark González", "Delantero", "Chile");
        Jugador Pablo = new Jugador(31, "Pablo Contreras", "Defensa", "Chile");
        Jugador Carlos = new Jugador(23, "Carlos Carmona", "Medio", "Chile");
        Jugador Chupete = new Jugador(23, "Humberto Suazo", "Delantero", "Chile");
        Jugador Valdivia = new Jugador(26, "Jorge Valdivia", "Medio", "Chile");
        Jugador Marco = new Jugador(27, "Marco Estrada", "Medio", "Chile");
        Jugador Gary = new Jugador(26, "Gary Medel", "Defensa", "Chile");
        Jugador Gonzalo = new Jugador(27, "Gonzalo Fierro", "Delantero", "Chile");

        Jugador Casillas = new Jugador(29, "Iker Casillas", "Portero", "Espana");
        Jugador Raul = new Jugador(24, "Raúl Albiol", "Defensa", "Espana");
        Jugador Pique = new Jugador(23, "Gerard Piqué", "Defensa", "Espana");
        Jugador Villa = new Jugador(28, "David Villa", "Delantero", "Espana");
        Jugador Puyol = new Jugador(32, "Carles Puyol", "Defensa", "Espana");
        Jugador Iniesta = new Jugador(26, "Andrés Iniesta", "Medio", "Espana");
        Jugador Torres = new Jugador(26, "Fernando Torres", "Delantero", "Espana");
        Jugador Fàbregas = new Jugador(23, "Cesc Fàbregas", "Medio", "Espana");
        Jugador Xabi = new Jugador(28, "Xabi Alonso", "Medio", "Espana");
        Jugador Ramos = new Jugador(24, "Sergio Ramos", "Defensa", "Espana");
        Jugador Rodríguez = new Jugador(22, "Pedro Rodríguez", "Delantero", "Espana");

        Lista Chile = new Lista();
        Chile.addFirst(Claudio, null);
        Chile.addFirst(Ismael, null);
        Chile.addFirst(Waldo, null);
        Chile.addFirst(Mark, null);
        Chile.addFirst(Pablo, null);
        Chile.addFirst(Carlos, null);
        Chile.addFirst(Chupete, null);
        Chile.addFirst(Valdivia, null);
        Chile.addFirst(Marco, null);
        Chile.addFirst(Gary, null);
        Chile.addFirst(Gonzalo, null);

        Lista Espana = new Lista();
        Espana.addFirst(Casillas, null);
        Espana.addFirst(Raul, Mark);
        Espana.addFirst(Pique, Chupete);
        Espana.addFirst(Villa, Ismael);
        Espana.addFirst(Puyol, Gonzalo);
        Espana.addFirst(Iniesta, Gary);
        Espana.addFirst(Torres, Waldo);
        Espana.addFirst(Fàbregas, Carlos);
        Espana.addFirst(Xabi, Valdivia);
        Espana.addFirst(Ramos, Marco);
        Espana.addFirst(Rodríguez, Pablo);

        
        Chile.OrdenarEdad();
        Chile.Cambio("Humberto Suazo", new Jugador(27, "Mauricio Pinilla", "Delantero", "Chile"), Espana);
        Espana.OrdenarPosicion();
        System.out.println(Chile.toString());
        Chile.printLineUp(3, 4, 3);
        System.out.println(Espana.toString()); 
        

    }

}
