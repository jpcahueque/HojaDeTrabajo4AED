/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

import static javafx.scene.input.KeyCode.T;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enmalopezbran
 */
public class PilaTest {
    
    public PilaTest() {
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
     * Test of push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object operando = null;
        Pila instance = new PilaImpl();
        instance.push(operando);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Pila instance = new PilaImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Pila.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Pila instance = new PilaImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class Pila.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        Pila instance = new PilaImpl();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of view method, of class Pila.
     */
    @Test
    public void testView() {
        System.out.println("view");
        int posicion = 0;
        Pila instance = new PilaImpl();
        Object expResult = null;
        Object result = instance.view(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarTodo method, of class Pila.
     */
    @Test
    public void testBorrarTodo() {
        System.out.println("borrarTodo");
        Pila instance = new PilaImpl();
        instance.borrarTodo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PilaImpl extends Pila {

        public void push(T operando) {
        }

        /**
         *
         * @return
         */
        @Override
        public T pop() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public void setPosicion(int posicion) {
        }

        /**
         *
         * @param posicion
         * @return
         */
        @Override
        public T view(int posicion) {
            return null;
        }

        public void borrarTodo() {
        }

        @Override
        public void push(Object operando) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
