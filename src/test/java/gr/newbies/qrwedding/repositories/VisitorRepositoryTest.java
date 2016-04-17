package gr.newbies.qrwedding.repositories;

import gr.newbies.qrwedding.models.entities.Visitor;
import java.util.List;
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
public class VisitorRepositoryTest {
    
    public VisitorRepositoryTest() {
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
     * Test of findVisitorByUUID method, of class VisitorRepository.
     */
    @Test
    public void testFindVisitorByUUID() {
        System.out.println("findVisitorByUUID");
        String uuid = "";
        VisitorRepository instance = new VisitorRepositoryImpl();
        Visitor expResult = null;
        Visitor result = instance.findVisitorByUUID(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findVisitorsByEventUUID method, of class VisitorRepository.
     */
    @Test
    public void testFindVisitorsByEventUUID() {
        System.out.println("findVisitorsByEventUUID");
        String event_id = "";
        VisitorRepository instance = new VisitorRepositoryImpl();
        List<Visitor> expResult = null;
        List<Visitor> result = instance.findVisitorsByEventUUID(event_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateVisitorByUUID method, of class VisitorRepository.
     */
    @Test
    public void testUpdateVisitorByUUID() {
        System.out.println("updateVisitorByUUID");
        String status = "";
        String uuid = "";
        VisitorRepository instance = new VisitorRepositoryImpl();
        Visitor expResult = null;
        Visitor result = instance.updateVisitorByUUID(status, uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VisitorRepositoryImpl implements VisitorRepository {

        public Visitor findVisitorByUUID(String uuid) {
            return null;
        }

        public List<Visitor> findVisitorsByEventUUID(String event_id) {
            return null;
        }

        public Visitor updateVisitorByUUID(String status, String uuid) {
            return null;
        }
    }
    
}
