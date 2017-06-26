package examenparcial1; 
/** 
 * @author Alfredo
 */
public class Lista {

    private Nodo cabeza;
    private Nodo ultimo;
    private int size;

    public Lista() {
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo _cabeza) {
        this.cabeza = _cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo _ultimo) {
        this.ultimo = _ultimo;
    }

    public int getSize() {
        return size;
    }

    /**
     * Agrega un nodo al comienzo de la lista.
     *
     * @param pJugador
     * @param pMarca
     * @return boolean
     */
    public boolean addFirst(Jugador pJugador, Jugador pMarca) {
        Nodo nuevoj = new Nodo(pJugador, pMarca);
        if (0 == size) {
            cabeza = nuevoj;
            ultimo = nuevoj;
        } else {
            nuevoj.setSig(cabeza);
            cabeza = nuevoj;
        }
        size++;
        return true;
    }

    /**
     * Ordena la lista por Edad de menor a mayor
     */
    public void OrdenarEdad() {
        for (int i = 0; i < this.getSize(); i++) {
            Nodo Aux = this.getCabeza();
            Nodo Aux2 = Aux.getSig();
            Jugador cambio = null;
            while (Aux2 != null) {
                if (Aux2.getJugador().getEdad() < Aux.getJugador().getEdad()) {
                    cambio = Aux2.getJugador();
                    Aux2.setJugador(Aux.getJugador());
                    Aux.setJugador(cambio);
                }
                Aux = Aux2;
                Aux2 = Aux2.getSig();
            }
        }
    }

    /**
     * Cambia al jugador contenido en nodo, por otro jugador
     *
     * @param jUno
     * @param jDos
     */
    public void Cambio(String jUno, Jugador jDos, Lista Temp) {
        Nodo aux = cabeza;
        for (int i = 0; i < size; i++) {
            if (jUno.equals(aux.getJugador().getNombre())) {
                aux.setJugador(jDos); 
            } 
             aux = aux.getSig();
        }
        if(Temp!=null){
            Nodo aux2 = Temp.getCabeza();
            for (int i = 0; i < Temp.getSize(); i++) {
                if (aux2.getMarca()!=null && jUno.equals(aux2.getMarca().getNombre())) {
                    aux2.setMarca(jDos); 
                } 
                 aux2 = aux2.getSig();
            } 
        }
        OrdenarEdad();
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();

        Nodo aux = cabeza;
        for (int i = 0; i < this.size; i++) {
            x.append(" Jugador: ");
            x.append(aux.getJugador().toString());  
            if (aux.getMarca() != null) {
                x.append(" - Marca: ");
                x.append(aux.getMarca().toString());
            }
            x.append("\n");
            aux = aux.getSig();
        }
        return x.toString();
    }

    //Metodo para darle valores numericos a las posiciones
    private int getPrioridadPorPosicion(String posicion) {
        switch (posicion) {
            case "Portero":
                return 1;
            case "Defensa":
                return 2;
            case "Medio":
                return 3;
            case "Delantero":
                return 4;
        }
        return 0;
    }

    /**
     * Algoritmo de ordenamiento burbuja para ordenar por posicion
     */
    public void OrdenarPosicion() {
        for (int i = 0; i < this.getSize(); i++) {
            Nodo aux = this.getCabeza();
            Nodo aux2 = aux.getSig();
            Jugador vJugador = null;
            Jugador Marca=null;
            while (aux2 != null) {
                if (this.getPrioridadPorPosicion(aux2.getJugador().getPosicion()) < this.getPrioridadPorPosicion(aux.getJugador().getPosicion())) {
                    vJugador = aux2.getJugador();
                    Marca=aux2.getMarca();
                    aux2.setMarca(aux.getMarca());
                    aux2.setJugador(aux.getJugador());
                    aux.setJugador(vJugador);
                    aux.setMarca(Marca);
                }
                aux = aux2;
                aux2 = aux2.getSig();
            }
        }
    }

    /**
     * Metodo para imprimir una alineacion pasada por parametros de un equipo
     *
     * @param def
     * @param med
     * @param del
     * @return boolean
     */
    public boolean printLineUp(int def, int med, int del) {
        if (def + med + del != 10 ||this.size<11) {
            System.out.println("Limite de jugadores excedido\n");
            return false;
        } else {
            String alineacion;
            OrdenarPosicion();
            Nodo aux = this.cabeza;
            alineacion = aux.getJugador().getNombre() + "\n";
            for (int i = 0; i < def; i++) {
                aux = aux.getSig();
                alineacion += aux.getJugador().getNombre() + " - ";
            }
            alineacion += "\n";
            for (int i = 0; i < med; i++) {
                aux = aux.getSig();
                alineacion += aux.getJugador().getNombre() + " - ";
            }
            alineacion += "\n";
            for (int i = 0; i < del; i++) {
                aux = aux.getSig();
                alineacion += aux.getJugador().getNombre() + " - ";
            }
            System.out.println(alineacion+"\n");
        }
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Remueve por index un nodo de la lista
     *
     * @param index
     * @return boolean
     */
    public boolean remove(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            this.cabeza = this.cabeza.getSig();
            size--;
            return true;
        }
        Nodo aux = this.cabeza;
        for (int i = 0; i < size; i++) {
            if (index - 1 == i) {
                aux.setSig(aux.getSig().getSig());
                size--;
                return true;
            }
            aux = aux.getSig();
        }
        return false;
    }

}
