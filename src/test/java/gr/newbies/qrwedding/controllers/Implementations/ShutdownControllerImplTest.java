package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.AbstractControllerTest;
import gr.newbies.qrwedding.services.implementations.ShutdownServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 *
 * @author KuroiTenshi
 */
@WebAppConfiguration
public class ShutdownControllerImplTest extends AbstractControllerTest {
    
    @Mock
    private ShutdownServiceImpl service;    
    
    @InjectMocks
    ShutdownControllerImpl controller;    
    
    public ShutdownControllerImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Override
    @Before
    public void setUp(){        
        MockitoAnnotations.initMocks(this);
        super.setUp(controller);
    }
    
    @After
    @Override
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public void testTerminateSession() throws Exception {
        
        doNothing().when(service).Shutdown();
        
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/endProg/sessionter"))
                .andReturn();
        
        verify(service,times(1)).Shutdown();
    }    
}
