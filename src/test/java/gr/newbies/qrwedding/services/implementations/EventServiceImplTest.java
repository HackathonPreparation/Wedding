package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.AbstractControllerTest;
import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.repositories.EventRepository;
import gr.newbies.qrwedding.services.EventService;
import org.json.simple.JSONObject;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@WebAppConfiguration
public class EventServiceImplTest extends AbstractControllerTest{

    @Mock
    private EventRepository repository;

    @InjectMocks
    private EventServiceImpl mockService;

    @Autowired
    private EventService service;

    public EventServiceImplTest() {
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
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCreateSuccess() throws IOException {
        JSONObject json = new JSONObject();
        json.put("name","testName");
        json.put("comment","testComment");
        EventCreationDTO eventCreationDTO = mapFromJson(json.toString(),EventCreationDTO.class);
        Event event = new Event(eventCreationDTO);
        when(repository.save(new Event(eventCreationDTO))).thenReturn(event);
        Event result = service.create(eventCreationDTO);
        assertEquals(event.getName(),result.getName());
        assertEquals(event.getComments(),result.getComments());
    }

    @Test
    public void testCreateNull() throws IOException {
        JSONObject json = new JSONObject();
        json.put("name",null);
        json.put("comment",null);
        EventCreationDTO eventCreationDTO = mapFromJson(json.toString(),EventCreationDTO.class);
        when(repository.save(new Event(eventCreationDTO))).thenReturn(null);
        Event result = mockService.create(eventCreationDTO);
        assertEquals(null,result);
    }

    @Test
    public void testFindOneSuccess() throws IOException {
        JSONObject json = new JSONObject();
        json.put("name","testName");
        json.put("comment","testComment");
        EventCreationDTO eventCreationDTO = mapFromJson(json.toString(),EventCreationDTO.class);
        Event event = new Event(eventCreationDTO);
        String uuid = event.getUuid();
        when(repository.findByUuid(uuid)).thenReturn(event);
        Event result = mockService.findOne(uuid);
        assertEquals(event,result);
    }

    @Test
    public void testFindOneNull() throws IOException {
        String uuid = "fakeUUID";
        when(repository.findByUuid("fakeUUID")).thenReturn(null);
        Event result = mockService.findOne(uuid);
        assertEquals(null,result);
    }

    @Test
    public void testUpdateNull() throws IOException {
        JSONObject json = new JSONObject();
        json.put("name","testName");
        json.put("comment","testComment");
        json.put("seats",10);
        json.put("uuid","abcdcf85-d6e5-4c19-95bd-bd5113be9ae0");
        EventUpdateDTO eventUpdateDTO = mapFromJson(json.toString(),EventUpdateDTO.class);
        when(repository.findByUuid(eventUpdateDTO.getUuid())).thenReturn(null);
        Boolean response = mockService.update(eventUpdateDTO);
        assertEquals(false, response);
    }

    @Test
    public void testUpdateSuccess() throws IOException {
        JSONObject json = new JSONObject();
        json.put("name","testName");
        json.put("comment","testComment");
        json.put("seats",10);
        json.put("uuid","abcdcf85-d6e5-4c19-95bd-bd5113be9ae0");
        EventUpdateDTO eventUpdateDTO = mapFromJson(json.toString(),EventUpdateDTO.class);
        when(repository.findByUuid(eventUpdateDTO.getUuid())).thenReturn(new Event());
        Boolean response = mockService.update(eventUpdateDTO);
        assertEquals(true, response);
    }
}
