package gr.newbies.qrwedding.services;

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
public class GeneralServiceImplTest {
    
    public GeneralServiceImplTest() {
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
     * Test of create method, of class GeneralServiceImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object entity = null;
        GeneralServiceImpl instance = new GeneralServiceImplImpl();
        Object expResult = null;
        Object result = instance.create(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class GeneralServiceImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        GeneralServiceImpl instance = new GeneralServiceImplImpl();
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class GeneralServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object entity = null;
        GeneralServiceImpl instance = new GeneralServiceImplImpl();
        boolean expResult = false;
        boolean result = instance.delete(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GeneralServiceImplImpl extends GeneralServiceImpl {
    }
    
}
