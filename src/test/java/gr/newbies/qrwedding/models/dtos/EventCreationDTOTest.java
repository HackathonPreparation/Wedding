package gr.newbies.qrwedding.models.dtos;

import gr.newbies.qrwedding.AbstractControllerTest;
import org.json.simple.JSONObject;
import org.junit.*;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@WebAppConfiguration
public class EventCreationDTOTest extends AbstractControllerTest{
    
    public EventCreationDTOTest() {
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
        json.put("name","testName");
        json.put("comment","testComment");
        EventCreationDTO eventCreationDTO = mapFromJson(json.toString(),EventCreationDTO.class);
        String result = eventCreationDTO.getName();
        assertEquals("testName",result);
    }

    @Test
    public void testGetComment() throws IOException {
        JSONObject json = new JSONObject();
        json.put("name","testName");
        json.put("comment","testComment");
        EventCreationDTO eventCreationDTO = mapFromJson(json.toString(),EventCreationDTO.class);
        String result = eventCreationDTO.getComment();
        assertEquals("testComment",result);
    }
    
}
