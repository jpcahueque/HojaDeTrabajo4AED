/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

import java.util.Vector;
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
public class StackVectorTest {
    
    public StackVectorTest() {
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
     * Test of setVector method, of class StackVector.
     */
    @Test
    public void testSetVector() {
        System.out.println("setVector");
        StackVector instance = new StackVector();
        instance.setVector(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicion method, of class StackVector.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        StackVector instance = new StackVector();
        int expResult = 0;
        int result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVector method, of class StackVector.
     */
    @Test
    public void testGetVector() {
        System.out.println("getVector");
        StackVector instance = new StackVector();
        Vector expResult = null;
        Vector result = instance.getVector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackVector instance = new StackVector();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class StackVector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object operando = null;
        StackVector instance = new StackVector();
        instance.push(operando);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackVector.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackVector instance = new StackVector();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class StackVector.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        StackVector instance = new StackVector();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of view method, of class StackVector.
     */
    @Test
    public void testView() {
        System.out.println("view");
        int posicion = 0;
        StackVector instance = new StackVector();
        Object expResult = null;
        Object result = instance.view(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarTodo method, of class StackVector.
     */
    @Test
    public void testBorrarTodo() {
        System.out.println("borrarTodo");
        StackVector instance = new StackVector();
        instance.borrarTodo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
