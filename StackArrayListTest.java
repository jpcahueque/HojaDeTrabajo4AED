/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

import java.util.ArrayList;
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
public class StackArrayListTest {
    
    public StackArrayListTest() {
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
     * Test of setPosicion method, of class StackArrayList.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        StackArrayList instance = new StackArrayList();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrayList method, of class StackArrayList.
     */
    @Test
    public void testSetArrayList() {
        System.out.println("setArrayList");
        StackArrayList instance = new StackArrayList();
        instance.setArrayList(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicion method, of class StackArrayList.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        StackArrayList instance = new StackArrayList();
        int expResult = 0;
        int result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVector method, of class StackArrayList.
     */
    @Test
    public void testGetVector() {
        System.out.println("getVector");
        StackArrayList instance = new StackArrayList();
        ArrayList expResult = null;
        ArrayList result = instance.getVector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackArrayList instance = new StackArrayList();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class StackArrayList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object operando = null;
        StackArrayList instance = new StackArrayList();
        instance.push(operando);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackArrayList instance = new StackArrayList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of view method, of class StackArrayList.
     */
    @Test
    public void testView() {
        System.out.println("view");
        int posicion = 0;
        StackArrayList instance = new StackArrayList();
        Object expResult = null;
        Object result = instance.view(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarTodo method, of class StackArrayList.
     */
    @Test
    public void testBorrarTodo() {
        System.out.println("borrarTodo");
        StackArrayList instance = new StackArrayList();
        instance.borrarTodo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
