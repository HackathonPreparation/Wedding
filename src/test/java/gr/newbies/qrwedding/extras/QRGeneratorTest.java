package gr.newbies.qrwedding.extras;

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
public class QRGeneratorTest {
    
    public QRGeneratorTest() {
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
     * Test of generateQR method, of class QRGenerator.
     */
    @Test
    public void testGenerateQR() {
        System.out.println("generateQR");
        String UUID_Visitor = "";
        String UUID_Event = "";
        QRGenerator instance = new QRGenerator();
        String expResult = "";
        String result = instance.generateQR(UUID_Visitor, UUID_Event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
