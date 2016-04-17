package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.AbstractControllerTest;
import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import gr.newbies.qrwedding.services.implementations.VisitorServiceImpl;
import javax.transaction.Transactional;
import junit.framework.Assert;
import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import static org.mockito.Matchers.any;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@Transactional
@WebAppConfiguration
@ActiveProfiles({"mixalis", "mixalis"})
public class VisitorControllerTest extends AbstractControllerTest{    
    String uri;
    
    @Mock
    VisitorServiceImpl service;
    
    @InjectMocks
    EventController controller;
    
    public VisitorControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        
        super.setUp(controller);
        
        uri="http://localhost:8080/visitor";
    }
    
    @After
    public void tearDown() {
        super.tearDown();
        
        uri=null;
    }

    @Test
    public void testNewSuccess() throws Exception{
        json.put("name","milena");
        json.put("eventUUID","12345678-2541-5236-7458-123456789521");
        
        when(service.create(any(VisitorCreationDTO.class)))
                .thenReturn(new Visitor());
        
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post(uri + "/new")
                .content(json.toJSONString())
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        
        String content = result.getResponse().getContentAsString();
        int status = result.getResponse().getStatus();
        
        verify(service,times(1)).create(any(VisitorCreationDTO.class));
        
        Assert.assertEquals("Expected to be 200", 200, status);
    }
    
    @Test
    public void testNewFail() throws Exception{
        json.put("name","milena");
        json.put("eventUUID","12345678-2541-5236-7458-123456789521");
        
        when(service.create(any(VisitorCreationDTO.class)))
                .thenReturn(null);
        
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post(uri + "/new")
                .content(json.toJSONString())
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        
        String content = result.getResponse().getContentAsString();
        int status = result.getResponse().getStatus();
        
        verify(service,times(1)).create(any(VisitorCreationDTO.class));
        
        Assert.assertEquals("Expected to be 500", 500, status);
    }
    
    @Test
    public void testGetEventSuccesss() throws Exception{
        json.put("name","milena");
        json.put("eventUUID","12345678-2541-5236-7458-123456789521");
        
        when(service.findOne("12345678-1234-1234-1234-12345678912345"))
                .thenReturn(new Visitor());
        
        MvcResult result = mvc.perform(MockMvcRequestBuilders
                .post(uri + "/12345678-1234-1234-1234-12345678912345")
                .content(json.toJSONString())
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        
        String content = result.getResponse().getContentAsString();
        int status = result.getResponse().getStatus();
        
        verify(service,times(1)).findOne("12345678-1234-1234-1234-12345678912345");
        
        Assert.assertEquals("Expected to be 200", 200, status);
    }
    
    @Test
    public void testGetEventFail() throws Exception{
        json.put("name","milena");
        json.put("eventUUID","1234567-22541-5236-7458-123456789521");
        
        MvcResult result = mvc.perform(MockMvcRequestBuilders
                .post(uri + "/1234567-22541-5236-7458-123456789521")
                .content(json.toJSONString())
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        
        verify(service,times(0)).findOne(Matchers.anyString());        
    }
    
    @Test
    public void testAcceptMethondSuccess() throws Exception{
        
    }
    
}
