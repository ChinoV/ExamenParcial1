/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alfredo
 */
public class ListaTest {
    
    public ListaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    /**
     * Test of addFirst method, of class Lista.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Jugador pJugador = new Jugador(1,"Test1","Test1","Test1");
        Jugador pMarca = new Jugador(2,"Test2","Test2","Test2");
        Lista instance = new Lista();
        instance.addFirst(pJugador, pMarca);
        assertTrue(instance.getCabeza().getJugador() == pJugador && instance.getCabeza().getMarca()== pMarca);
    }

    /**
     * Test of OrdenarEdad method, of class Lista.
     */
    @Test
    public void testOrdenarEdad() {
        System.out.println("OrdenarEdad");
        Lista instance = new Lista();
        Jugador vJugador = new Jugador(1,"Test1","Test1","Test1");
        Jugador vJugador2 = new Jugador(2,"Test2","Test2","Test2");
        instance.addFirst(vJugador, null);
        instance.addFirst(vJugador2,null);
        instance.OrdenarEdad(); 
        assertTrue(instance.getCabeza().getJugador() == vJugador);
    }

    /**
     * Test of Cambio method, of class Lista.
     */
    @Test
    public void testCambio() {
        System.out.println("Cambio");
        Jugador vJugador = new Jugador(1,"Test1","Test1","Test1");
        Jugador vJugador2 = new Jugador(2,"Test2","Test2","Test2");
        Lista instance = new Lista();
        instance.addFirst(vJugador, null);
        instance.Cambio("Test1", vJugador2, null);
        assertTrue(instance.getCabeza().getJugador() == vJugador2);
    }

    /**
     * Test of OrdenarPosicion method, of class Lista.
     */
    @Test
    public void testOrdenarPosicion() {
        System.out.println("OrdenarPosicion");
        Lista instance = new Lista();
        Jugador vJugador = new Jugador(1,"Test1","Portero","Test1");
        Jugador vJugador2 = new Jugador(2,"Test2","Delantero","Test2");
        instance.addFirst(vJugador, null);
        instance.addFirst(vJugador2,null);
        instance.OrdenarPosicion();
        assertTrue(instance.getCabeza().getJugador() == vJugador);
    }

    /**
     * Test of printLineUp method, of class Lista.
     */
    @Test
    public void testPrintLineUp() {
        System.out.println("printLineUp");
        int def = 3;
        int med = 3;
        int del = 4;
        Lista instance = new Lista(); 
        instance.addFirst(new Jugador(1,"Test1","Test1","Test1"),null);
        instance.addFirst(new Jugador(2,"Test2","Test2","Test2"),null);
        instance.addFirst(new Jugador(3,"Test3","Test3","Test3"),null);
        instance.addFirst(new Jugador(4,"Test4","Test4","Test4"),null);
        instance.addFirst(new Jugador(5,"Test5","Test5","Test5"),null);
        instance.addFirst(new Jugador(6,"Test6","Test6","Test6"),null);
        instance.addFirst(new Jugador(7,"Test7","Test7","Test7"),null);
        instance.addFirst(new Jugador(8,"Test8","Test8","Test8"),null);
        instance.addFirst(new Jugador(9,"Test9","Test9","Test9"),null);
        instance.addFirst(new Jugador(10,"Test10","Test10","Test10"),null);
        instance.addFirst(new Jugador(11,"Test11","Test11","Test11"),null); 
        assertTrue(instance.printLineUp(def, med, del));
    }
    
}
