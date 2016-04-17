package gr.newbies.qrwedding.models.dtos;

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
public class EventUpdateDTOTest {
    
    public EventUpdateDTOTest() {
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
     * Test of getUuid method, of class EventUpdateDTO.
     */
    @Test
    public void testGetUuid() {
        System.out.println("getUuid");
        EventUpdateDTO instance = new EventUpdateDTO();
        String expResult = "";
        String result = instance.getUuid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class EventUpdateDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        EventUpdateDTO instance = new EventUpdateDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComment method, of class EventUpdateDTO.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        EventUpdateDTO instance = new EventUpdateDTO();
        String expResult = "";
        String result = instance.getComment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeats method, of class EventUpdateDTO.
     */
    @Test
    public void testGetSeats() {
        System.out.println("getSeats");
        EventUpdateDTO instance = new EventUpdateDTO();
        int expResult = 0;
        int result = instance.getSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
