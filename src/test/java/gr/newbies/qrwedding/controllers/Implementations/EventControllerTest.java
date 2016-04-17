package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author SoUlKeePeR
 */
public class EventControllerTest {
    
    public EventControllerTest() {
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
     * Test of NewEvent method, of class EventController.
     */
    @Test
    public void testNewEvent() {
        System.out.println("NewEvent");
        EventCreationDTO dto = null;
        EventController instance = new EventController();
        ResponseEntity<JSONObject> expResult = null;
        ResponseEntity<JSONObject> result = instance.NewEvent(dto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelInvitation method, of class EventController.
     */
    @Test
    public void testCancelInvitation() {
        System.out.println("cancelInvitation");
        String toDelete = "";
        EventController instance = new EventController();
        boolean expResult = false;
        boolean result = instance.cancelInvitation(toDelete);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelEvent method, of class EventController.
     */
    @Test
    public void testCancelEvent() {
        System.out.println("cancelEvent");
        String toDelete = "";
        EventController instance = new EventController();
        boolean expResult = false;
        boolean result = instance.cancelEvent(toDelete);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditEvent method, of class EventController.
     */
    @Test
    public void testEditEvent() {
        System.out.println("EditEvent");
        EventUpdateDTO dto = null;
        EventController instance = new EventController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.EditEvent(dto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEvent method, of class EventController.
     */
    @Test
    public void testGetEvent() {
        System.out.println("GetEvent");
        String uuid = "";
        EventController instance = new EventController();
        HttpEntity<JSONObject> expResult = null;
        HttpEntity<JSONObject> result = instance.GetEvent(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
