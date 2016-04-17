package gr.newbies.qrwedding.models.dtos;

import gr.newbies.qrwedding.AbstractControllerTest;
import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

import static org.junit.Assert.*;

@WebAppConfiguration
public class VisitorCreationDTOTest extends AbstractControllerTest{
    
    public VisitorCreationDTOTest() {
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

    @Test
    public void testGetName() throws IOException {
        JSONObject json = new JSONObject();
        json.put("eventUUID","9c02adda-3e69-436f-85d8-17326dc5655a");
        json.put("name","testName");
        VisitorCreationDTO visitorCreationDTO = mapFromJson(json.toString(),VisitorCreationDTO.class);
        String result = visitorCreationDTO.getEventUUID();
        assertEquals("9c02adda-3e69-436f-85d8-17326dc5655a",result);
    }

    @Test
    public void testGetEventUUID() throws IOException {
        JSONObject json = new JSONObject();
        json.put("eventUUID","9c02adda-3e69-436f-85d8-17326dc5655a");
        json.put("name","testName");
        VisitorCreationDTO visitorCreationDTO = mapFromJson(json.toString(),VisitorCreationDTO.class);
        String result = visitorCreationDTO.getName();
        assertEquals("testName",result);
    }
}
