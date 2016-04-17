package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
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
public class EventServiceImplTest {
    
    public EventServiceImplTest() {
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
     * Test of create method, of class EventServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        EventCreationDTO eventCreationDTO = null;
        EventServiceImpl instance = null;
        Event expResult = null;
        Event result = instance.create(eventCreationDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOne method, of class EventServiceImpl.
     */
    @Test
    public void testFindOne() {
        System.out.println("findOne");
        String uuid = "";
        EventServiceImpl instance = null;
        Event expResult = null;
        Event result = instance.findOne(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EventServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        EventUpdateDTO eventUpdateDTO = null;
        EventServiceImpl instance = null;
        boolean expResult = false;
        boolean result = instance.update(eventUpdateDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
