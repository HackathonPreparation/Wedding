package gr.newbies.qrwedding.models.entities;

import gr.newbies.qrwedding.AbstractControllerTest;
import gr.newbies.qrwedding.extras.Status;
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
public class VisitorTest extends AbstractControllerTest{
    
    public VisitorTest() {
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
        json.put("event_id","b345e2be-a41b-4757-849d-7b9a26d09e73");
        json.put("table_reg",5);
        json.put("status", Status.ACCEPTED.getData());
        json.put("image_path","C:\\Wedding\\QRCodes\\b345e2be-a41b-4757-849d-7b9a26d09e73\\b345e2be-a41b-4757-849d-7b9a26d09e72");
        Visitor visitor = mapFromJson(json.toString(),Visitor.class);
        String result = visitor.getName();
        assertEquals("testName",result);
    }

    @Test
    public void testGetEvent_id() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("event_id","b345e2be-a41b-4757-849d-7b9a26d09e73");
        json.put("table_reg",5);
        json.put("status", Status.ACCEPTED.getData());
        json.put("image_path","C:\\Wedding\\QRCodes\\b345e2be-a41b-4757-849d-7b9a26d09e73\\b345e2be-a41b-4757-849d-7b9a26d09e72");
        Visitor visitor = mapFromJson(json.toString(),Visitor.class);
        String result = visitor.getEvent_id();
        assertEquals("b345e2be-a41b-4757-849d-7b9a26d09e73",result);
    }

    @Test
    public void testGetStatus() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("event_id","b345e2be-a41b-4757-849d-7b9a26d09e73");
        json.put("table_reg",5);
        json.put("status", Status.ACCEPTED.getData());
        json.put("image_path","C:\\Wedding\\QRCodes\\b345e2be-a41b-4757-849d-7b9a26d09e73\\b345e2be-a41b-4757-849d-7b9a26d09e72");
        Visitor visitor = mapFromJson(json.toString(),Visitor.class);
        String result = visitor.getStatus();
        assertEquals(Status.ACCEPTED.getData(),result);
    }

    @Test
    public void testGetTable_reg() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("event_id","b345e2be-a41b-4757-849d-7b9a26d09e73");
        json.put("table_reg",5);
        json.put("status", Status.ACCEPTED.getData());
        json.put("image_path","C:\\Wedding\\QRCodes\\b345e2be-a41b-4757-849d-7b9a26d09e73\\b345e2be-a41b-4757-849d-7b9a26d09e72");
        Visitor visitor = mapFromJson(json.toString(),Visitor.class);
        int result = visitor.getTable_reg();
        assertEquals(5,result);
    }

    @Test
    public void testGetImage_path() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("event_id","b345e2be-a41b-4757-849d-7b9a26d09e73");
        json.put("table_reg",5);
        json.put("status", Status.ACCEPTED.getData());
        json.put("image_path","C:\\Wedding\\QRCodes\\b345e2be-a41b-4757-849d-7b9a26d09e73\\b345e2be-a41b-4757-849d-7b9a26d09e72");
        Visitor visitor = mapFromJson(json.toString(),Visitor.class);
        String result = visitor.getImage_path();
        assertEquals("C:\\Wedding\\QRCodes\\b345e2be-a41b-4757-849d-7b9a26d09e73\\b345e2be-a41b-4757-849d-7b9a26d09e72",result);
    }

    @Test
    public void testSetStatus() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("event_id","b345e2be-a41b-4757-849d-7b9a26d09e73");
        json.put("table_reg",5);
        json.put("status", Status.ACCEPTED.getData());
        json.put("image_path","C:\\Wedding\\QRCodes\\b345e2be-a41b-4757-849d-7b9a26d09e73\\b345e2be-a41b-4757-849d-7b9a26d09e72");
        Visitor visitor = mapFromJson(json.toString(),Visitor.class);
        visitor.setStatus(Status.PENDING.getData());
        assertEquals(Status.PENDING.getData(),visitor.getStatus());
    }

    @Test
    public void testToJson() throws IOException {
        JSONObject json = new JSONObject();
        json.put("uuid","b345e2be-a41b-4757-849d-7b9a26d09e72");
        json.put("name","testName");
        json.put("event_id","b345e2be-a41b-4757-849d-7b9a26d09e73");
        json.put("table_reg",5);
        json.put("status", Status.ACCEPTED.getData());
        json.put("image_path","C:\\Wedding\\QRCodes\\b345e2be-a41b-4757-849d-7b9a26d09e73\\b345e2be-a41b-4757-849d-7b9a26d09e72");
        Visitor visitor = mapFromJson(json.toString(),Visitor.class);
        JSONObject result = visitor.toJson();
        assertEquals(json,result);
    }
}
