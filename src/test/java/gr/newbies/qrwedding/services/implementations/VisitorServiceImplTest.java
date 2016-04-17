package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import org.json.simple.JSONArray;
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
public class VisitorServiceImplTest {
    
    public VisitorServiceImplTest() {
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
     * Test of create method, of class VisitorServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        VisitorCreationDTO visitorCreationDTO = null;
        VisitorServiceImpl instance = null;
        Visitor expResult = null;
        Visitor result = instance.create(visitorCreationDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOne method, of class VisitorServiceImpl.
     */
    @Test
    public void testFindOne() {
        System.out.println("findOne");
        String uuid = "";
        VisitorServiceImpl instance = null;
        Visitor expResult = null;
        Visitor result = instance.findOne(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStatus method, of class VisitorServiceImpl.
     */
    @Test
    public void testUpdateStatus() {
        System.out.println("updateStatus");
        String uuid = "";
        VisitorServiceImpl instance = null;
        Visitor expResult = null;
        Visitor result = instance.updateStatus(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findVisitorsByEventId method, of class VisitorServiceImpl.
     */
    @Test
    public void testFindVisitorsByEventId() {
        System.out.println("findVisitorsByEventId");
        String uuid = "";
        VisitorServiceImpl instance = null;
        JSONArray expResult = null;
        JSONArray result = instance.findVisitorsByEventId(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
