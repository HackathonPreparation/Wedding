package gr.newbies.qrwedding.models.entities;

import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SoUlKeePeR
 */
public class VisitorTest {
    
    public VisitorTest() {
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
     * Test of getName method, of class Visitor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Visitor instance = new Visitor();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvent_id method, of class Visitor.
     */
    @Test
    public void testGetEvent_id() {
        System.out.println("getEvent_id");
        Visitor instance = new Visitor();
        String expResult = "";
        String result = instance.getEvent_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Visitor.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Visitor instance = new Visitor();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTable_reg method, of class Visitor.
     */
    @Test
    public void testGetTable_reg() {
        System.out.println("getTable_reg");
        Visitor instance = new Visitor();
        int expResult = 0;
        int result = instance.getTable_reg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage_path method, of class Visitor.
     */
    @Test
    public void testGetImage_path() {
        System.out.println("getImage_path");
        Visitor instance = new Visitor();
        String expResult = "";
        String result = instance.getImage_path();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Visitor.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Visitor instance = new Visitor();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class Visitor.
     */
    @Test
    public void testToJson() {
        System.out.println("toJson");
        Visitor instance = new Visitor();
        JSONObject expResult = null;
        JSONObject result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
