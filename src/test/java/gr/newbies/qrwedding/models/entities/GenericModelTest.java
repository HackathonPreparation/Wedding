package gr.newbies.qrwedding.models.entities;

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
public class GenericModelTest {
    
    public GenericModelTest() {
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
     * Test of getUuid method, of class GenericModel.
     */
    @Test
    public void testGetUuid() {
        System.out.println("getUuid");
        GenericModel instance = new GenericModelImpl();
        String expResult = "";
        String result = instance.getUuid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GenericModelImpl extends GenericModel {
    }
    
}
