package gr.newbies.qrwedding.extras;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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
public class CORSFilterTest {
    
    public CORSFilterTest() {
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
     * Test of destroy method, of class CORSFilter.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        CORSFilter instance = new CORSFilter();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doFilter method, of class CORSFilter.
     */
    @Test
    public void testDoFilter() throws Exception {
        System.out.println("doFilter");
        ServletRequest req = null;
        ServletResponse res = null;
        FilterChain chain = null;
        CORSFilter instance = new CORSFilter();
        instance.doFilter(req, res, chain);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class CORSFilter.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        FilterConfig config = null;
        CORSFilter instance = new CORSFilter();
        instance.init(config);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
