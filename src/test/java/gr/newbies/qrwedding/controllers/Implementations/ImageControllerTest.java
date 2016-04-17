package gr.newbies.qrwedding.controllers.Implementations;

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
public class ImageControllerTest {
    
    public ImageControllerTest() {
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
     * Test of getImage method, of class ImageController.
     */
    @Test
    public void testGetImage() throws Exception {
        System.out.println("getImage");
        String uuid_ev = "";
        String uuid_vis = "";
        ImageController instance = new ImageController();
        byte[] expResult = null;
        byte[] result = instance.getImage(uuid_ev, uuid_vis);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
