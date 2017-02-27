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
public class MiStackTest {
    
    public MiStackTest() {
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
     * Test of push method, of class MiStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object Element = null;
        MiStack instance = new MiStackImpl();
        instance.push(Element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class MiStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        MiStack instance = new MiStackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class MiStack.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        MiStack instance = new MiStackImpl();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MiStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MiStack instance = new MiStackImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getE method, of class MiStack.
     */
    @Test
    public void testGetE() {
        System.out.println("getE");
        MiStack instance = new MiStackImpl();
        Object expResult = null;
        Object result = instance.getE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MiStackImpl implements MiStack {

        public void push(E Element) {
        }

        public E pop() {
            return null;
        }

        public boolean empty() {
            return false;
        }

        public int size() {
            return 0;
        }

        public E getE() {
            return null;
        }
    }

    public class MiStackImpl implements MiStack {

        public void push(E Element) {
        }

        public E pop() {
            return null;
        }

        public boolean empty() {
            return false;
        }

        public int size() {
            return 0;
        }

        public E getE() {
            return null;
        }
    }
    
}
