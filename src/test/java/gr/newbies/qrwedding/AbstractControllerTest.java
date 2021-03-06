package gr.newbies.qrwedding;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gr.newbies.qrwedding.controllers.BaseController;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public abstract class AbstractControllerTest extends AbstractTest {
    protected MockMvc mvc;
    protected JSONObject json;
    
    @Autowired
    protected WebApplicationContext webApplicationContext;
    
    protected void setUp() throws Exception{
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        json = new JSONObject();
    }
    
    protected void setUp(BaseController controller){
        mvc = MockMvcBuilders.standaloneSetup(controller).build();
        json = new JSONObject();
    }
    
    public void tearDown() {   
        json = null;
    }
    protected String mapToJson(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }
    
    protected <T> T mapFromJson(String json,Class<T> clazz) throws JsonParseException,JsonMappingException,IOException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, clazz);
    }
}
