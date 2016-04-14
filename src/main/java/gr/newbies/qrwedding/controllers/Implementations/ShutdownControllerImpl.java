package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.controllers.BaseController;
import gr.newbies.qrwedding.services.ShutdownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author KuroiTenshi
 */
@Controller
@RequestMapping(value = "/endProg")
public class ShutdownControllerImpl extends BaseController{
    
    @Autowired
    ShutdownService service;
    
    /**
     * Ending the current session of the program manually
     */
    @RequestMapping(value = "/sessionter", method = RequestMethod.POST)
    public void terminateSession(){
        service.Shutdown();
    }
    
}
