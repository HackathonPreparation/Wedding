package gr.newbies.qrwedding.models.entities;

import gr.newbies.qrwedding.AbstractControllerTest;
import org.json.simple.JSONObject;
import org.junit.*;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@WebAppConfiguration
public class EventTest extends AbstractControllerTest{
    
    public EventTest() {
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
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("comments","testComment");
        json.put("tables_count",10);
        json.put("tables_left",9);
        Event event = mapFromJson(json.toString(),Event.class);
        String result = event.getName();
        assertEquals("testName",result);
    }

    @Test
    public void testGetTables_count() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("comments","testComment");
        json.put("tables_count",10);
        json.put("tables_left",9);
        Event event = mapFromJson(json.toString(),Event.class);
        int result = event.getTables_count();
        assertEquals(10,result);
    }

    @Test
    public void testGetTables_left() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("comments","testComment");
        json.put("tables_count",10);
        json.put("tables_left",9);
        Event event = mapFromJson(json.toString(),Event.class);
        int result = event.getTables_left();
        assertEquals(9,result);
    }

    @Test
    public void testGetComments() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("comments","testComment");
        json.put("tables_count",10);
        json.put("tables_left",9);
        Event event = mapFromJson(json.toString(),Event.class);
        String result = event.getComments();
        assertEquals("testComment",result);
    }

    @Test
    public void testToJson() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("comments","testComment");
        json.put("tables_count",10);
        json.put("tables_left",9);
        Event event = mapFromJson(json.toString(),Event.class);
        JSONObject result = event.toJson();
        assertEquals(json,result);
    }
    
}
