package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
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
public class VisitorControllerTest {
    
    public VisitorControllerTest() {
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
     * Test of NewEvent method, of class VisitorController.
     */
    @Test
    public void testNewEvent() {
        System.out.println("NewEvent");
        VisitorCreationDTO visitorCreationDTO = null;
        VisitorController instance = new VisitorController();
        ResponseEntity<Visitor> expResult = null;
        ResponseEntity<Visitor> result = instance.NewEvent(visitorCreationDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEvent method, of class VisitorController.
     */
    @Test
    public void testGetEvent() {
        System.out.println("GetEvent");
        String uuid = "";
        VisitorController instance = new VisitorController();
        HttpEntity<JSONObject> expResult = null;
        HttpEntity<JSONObject> result = instance.GetEvent(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateVis method, of class VisitorController.
     */
    @Test
    public void testUpdateVis() {
        System.out.println("updateVis");
        String uuid = "";
        VisitorController instance = new VisitorController();
        ResponseEntity<Visitor> expResult = null;
        ResponseEntity<Visitor> result = instance.updateVis(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
