/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Pablo Merck
 */
public class LSimpleTest {
    
    public LSimpleTest() {
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
     * Test of size method, of class LSimple.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LSimple instance = new LSimple();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class LSimple.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        LSimple instance = new LSimple();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class LSimple.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        LSimple instance = new LSimple();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPrimero method, of class LSimple.
     */
    @Test
    public void testAgregarPrimero() {
        System.out.println("agregarPrimero");
        Object valor = null;
        LSimple instance = new LSimple();
        instance.agregarPrimero(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarUltimo method, of class LSimple.
     */
    @Test
    public void testAgregarUltimo() {
        System.out.println("agregarUltimo");
        Object valor = null;
        LSimple instance = new LSimple();
        instance.agregarUltimo(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimero method, of class LSimple.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.getPrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class LSimple.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePrimero method, of class LSimple.
     */
    @Test
    public void testRemovePrimero() {
        System.out.println("removePrimero");
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.removePrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class LSimple.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeElement method, of class LSimple.
     */
    @Test
    public void testRemoveElement() {
        System.out.println("removeElement");
        Object valor = null;
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.removeElement(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class LSimple.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Object valor = null;
        LSimple instance = new LSimple();
        instance.agregar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class LSimple.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class LSimple.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object valor = null;
        LSimple instance = new LSimple();
        boolean expResult = false;
        boolean result = instance.contains(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class LSimple.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object valor = null;
        LSimple instance = new LSimple();
        int expResult = 0;
        int result = instance.indexOf(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastIndexOf method, of class LSimple.
     */
    @Test
    public void testLastIndexOf() {
        System.out.println("lastIndexOf");
        Object valor = null;
        LSimple instance = new LSimple();
        int expResult = 0;
        int result = instance.lastIndexOf(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPos method, of class LSimple.
     */
    @Test
    public void testGetPos() {
        System.out.println("getPos");
        int i = 0;
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.getPos(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPos method, of class LSimple.
     */
    @Test
    public void testSetPos() {
        System.out.println("setPos");
        int i = 0;
        Object o = null;
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.setPos(i, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addElim method, of class LSimple.
     */
    @Test
    public void testAddElim() {
        System.out.println("addElim");
        int i = 0;
        Object o = null;
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.addElim(i, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class LSimple.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int i = 0;
        LSimple instance = new LSimple();
        Object expResult = null;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class LSimple.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        LSimple instance = new LSimple();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LSimple.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LSimple instance = new LSimple();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
