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
public class NodoTest {
    
    public NodoTest() {
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
     * Test of proximo method, of class Nodo.
     */
    @Test
    public void testProximo() {
        System.out.println("proximo");
        Nodo instance = null;
        Nodo expResult = null;
        Nodo result = instance.proximo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProximo method, of class Nodo.
     */
    @Test
    public void testSetProximo() {
        System.out.println("setProximo");
        Nodo instance = null;
        instance.setProximo(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valor method, of class Nodo.
     */
    @Test
    public void testValor() {
        System.out.println("valor");
        Nodo instance = null;
        Object expResult = null;
        Object result = instance.valor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Nodo.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Object valor = null;
        Nodo instance = null;
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
