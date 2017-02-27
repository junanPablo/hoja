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
public class ICalculadoraTest {
    
    public ICalculadoraTest() {
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
     * Test of Calcular method, of class ICalculadora.
     */
    @Test
    public void testCalcular() {
        System.out.println("Calcular");
        String datos = "";
        ICalculadora instance = new ICalculadoraImpl();
        int expResult = 0;
        int result = instance.Calcular(datos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lectura method, of class ICalculadora.
     */
    @Test
    public void testLectura() {
        System.out.println("lectura");
        String direc = "";
        ICalculadora instance = new ICalculadoraImpl();
        String expResult = "";
        String result = instance.lectura(direc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICalculadoraImpl implements ICalculadora {

        public int Calcular(String datos) {
            return 0;
        }

        public String lectura(String direc) {
            return "";
        }
    }

    public class ICalculadoraImpl implements ICalculadora {

        public int Calcular(String datos) {
            return 0;
        }

        public String lectura(String direc) {
            return "";
        }
    }
    
}
