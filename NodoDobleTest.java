/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja;

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
public class NodoDobleTest {
    
    public NodoDobleTest() {
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
     * Test of mSiguiente method, of class NodoDoble.
     */
    @Test
    public void testMSiguiente() {
        System.out.println("mSiguiente");
        NodoDoble instance = null;
        NodoDoble expResult = null;
        NodoDoble result = instance.mSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valor method, of class NodoDoble.
     */
    @Test
    public void testValor() {
        System.out.println("valor");
        NodoDoble instance = null;
        Object expResult = null;
        Object result = instance.valor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mAnterior method, of class NodoDoble.
     */
    @Test
    public void testMAnterior() {
        System.out.println("mAnterior");
        NodoDoble instance = null;
        NodoDoble expResult = null;
        NodoDoble result = instance.mAnterior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSig method, of class NodoDoble.
     */
    @Test
    public void testSetSig() {
        System.out.println("setSig");
        NodoDoble instance = null;
        instance.setSig(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
