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
public class FactoryTest {
    
    public FactoryTest() {
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
     * Test of getStack method, of class Factory.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        int op1 = 0;
        int op2 = 0;
        Factory instance = new Factory();
        AbStack expResult = null;
        AbStack result = instance.getStack(op1, op2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getL method, of class Factory.
     */
    @Test
    public void testGetL() {
        System.out.println("getL");
        int op1 = 0;
        Factory instance = new Factory();
        AbLista expResult = null;
        AbLista result = instance.getL(op1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
