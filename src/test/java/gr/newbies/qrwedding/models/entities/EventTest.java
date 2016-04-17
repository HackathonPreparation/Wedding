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
public class EventTest {
    
    public EventTest() {
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
     * Test of getName method, of class Event.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Event instance = new Event();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTables_count method, of class Event.
     */
    @Test
    public void testGetTables_count() {
        System.out.println("getTables_count");
        Event instance = new Event();
        int expResult = 0;
        int result = instance.getTables_count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTables_left method, of class Event.
     */
    @Test
    public void testGetTables_left() {
        System.out.println("getTables_left");
        Event instance = new Event();
        int expResult = 0;
        int result = instance.getTables_left();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComments method, of class Event.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        Event instance = new Event();
        String expResult = "";
        String result = instance.getComments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class Event.
     */
    @Test
    public void testToJson() {
        System.out.println("toJson");
        Event instance = new Event();
        JSONObject expResult = null;
        JSONObject result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
