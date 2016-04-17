package gr.newbies.qrwedding.models.entities;

import org.junit.*;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@WebAppConfiguration
public class GenericModelTest{
    
    public GenericModelTest() {
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
    public void testGetUuid() {
        GenericModel model = new GenericModelImpl("b345e2be-a41b-4757-849d-7b9a26d09e72");
        String result = model.getUuid();
        assertEquals("b345e2be-a41b-4757-849d-7b9a26d09e72",result);
    }

    private class GenericModelImpl extends GenericModel {
        @Override
        public String getUuid() {
            return super.getUuid();
        }

        GenericModelImpl(String uuid){
            this.uuid = uuid;
        }
    }
}
