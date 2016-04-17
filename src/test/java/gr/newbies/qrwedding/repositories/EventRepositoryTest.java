package gr.newbies.qrwedding.repositories;

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
public class EventRepositoryTest {
    
    public EventRepositoryTest() {
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
     * Test of findByUuid method, of class EventRepository.
     */
    @Test
    public void testFindByUuid() {
        System.out.println("findByUuid");
        String uuid = "";
        EventRepository instance = new EventRepositoryImpl();
        Event expResult = null;
        Event result = instance.findByUuid(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEventByUUID method, of class EventRepository.
     */
    @Test
    public void testUpdateEventByUUID() {
        System.out.println("updateEventByUUID");
        int tables_count = 0;
        int tables_left = 0;
        String name = "";
        String comment = "";
        String uuid = "";
        EventRepository instance = new EventRepositoryImpl();
        instance.updateEventByUUID(tables_count, tables_left, name, comment, uuid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EventRepositoryImpl implements EventRepository {

        public Event findByUuid(String uuid) {
            return null;
        }

        public void updateEventByUUID(int tables_count, int tables_left, String name, String comment, String uuid) {
        }
    }
    
}
