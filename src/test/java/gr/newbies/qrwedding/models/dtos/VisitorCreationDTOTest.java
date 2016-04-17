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
public class VisitorCreationDTOTest {
    
    public VisitorCreationDTOTest() {
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
     * Test of getName method, of class VisitorCreationDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        VisitorCreationDTO instance = new VisitorCreationDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventUUID method, of class VisitorCreationDTO.
     */
    @Test
    public void testGetEventUUID() {
        System.out.println("getEventUUID");
        VisitorCreationDTO instance = new VisitorCreationDTO();
        String expResult = "";
        String result = instance.getEventUUID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
