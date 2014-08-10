/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Final;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristian
 */
public class DoubleListTest {
    
    public DoubleListTest() {
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
     * Test of size method, of class DoubleList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DoubleList instance = new DoubleList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class DoubleList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DoubleList instance = new DoubleList();
        instance.addFirst(null);
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class DoubleList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DoubleList instance = new DoubleList();
        instance.addFirst(null);
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class DoubleList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        DoubleList instance = new DoubleList();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class DoubleList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        DoubleList instance = new DoubleList();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class DoubleList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        DoubleList instance = new DoubleList();
        instance.addLast(null);
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
