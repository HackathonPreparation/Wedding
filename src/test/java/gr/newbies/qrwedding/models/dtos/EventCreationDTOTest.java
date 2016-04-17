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
public class EventCreationDTOTest {
    
    public EventCreationDTOTest() {
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
     * Test of getName method, of class EventCreationDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        EventCreationDTO instance = new EventCreationDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComment method, of class EventCreationDTO.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        EventCreationDTO instance = new EventCreationDTO();
        String expResult = "";
        String result = instance.getComment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
