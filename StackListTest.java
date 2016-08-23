/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

import java.util.LinkedList;
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
public class StackListTest {
    
    public StackListTest() {
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
     * Test of setPosicion method, of class StackList.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        StackList instance = new StackList();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrayList method, of class StackList.
     */
    @Test
    public void testSetArrayList() {
        System.out.println("setArrayList");
        StackList instance = new StackList();
        instance.setArrayList(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicion method, of class StackList.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        StackList instance = new StackList();
        int expResult = 0;
        int result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVector method, of class StackList.
     */
    @Test
    public void testGetVector() {
        System.out.println("getVector");
        StackList instance = new StackList();
        LinkedList expResult = null;
        LinkedList result = instance.getVector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackList instance = new StackList();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class StackList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object operando = null;
        StackList instance = new StackList();
        instance.push(operando);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackList instance = new StackList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of view method, of class StackList.
     */
    @Test
    public void testView() {
        System.out.println("view");
        int posicion = 0;
        StackList instance = new StackList();
        Object expResult = null;
        Object result = instance.view(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarTodo method, of class StackList.
     */
    @Test
    public void testBorrarTodo() {
        System.out.println("borrarTodo");
        StackList instance = new StackList();
        instance.borrarTodo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
