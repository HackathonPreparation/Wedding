package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.AbstractControllerTest;
import gr.newbies.qrwedding.services.implementations.EventServiceImpl;
import gr.newbies.qrwedding.services.implementations.VisitorServiceImpl;
import javax.transaction.Transactional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import static org.mockito.Matchers.any;
import org.mockito.Mock;
import org.junit.*;

import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@Transactional
public class EventControllerTest extends AbstractControllerTest {
    String uri;
    
    @Mock 
    EventServiceImpl eventService;
    
    @Mock
    VisitorServiceImpl visitorService;
    
    @InjectMocks
    EventController controller;
    
    public EventControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    @Override
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        
        super.setUp(controller);
        
        uri="/event";
    }
    
    @After
    @Override
    public void tearDown() {
        super.tearDown();
        
        uri=null;
    }
 
    @Test
    public void testEditEventSuccess() throws Exception  {
//        json.put("seats","2");
//        json.put("uuid","12345678-1245-1245-2365-123456789145");
//        json.put("name", "Kwnstantina");
//        json.put("comment", "ufwiefbwubw");
//        
//        when(eventService.update(any())).thenReturn(true);
//        
//        MvcResult result = mvc.perform(MockMvcRequestBuilders.put(uri + "/edit")
//                .content(json.toJSONString()))
//                .andReturn();
//        
//        String content = result.getResponse().getContentAsString();
//        int status = result.getResponse().getStatus();
//        
//        verify(eventService,times(1)).update(any());
//        
//        Assert.assertEquals("Failure expected OK",200 ,HttpStatus.OK);
    }
    
}
