package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.controllers.BaseController;
import gr.newbies.qrwedding.extras.ProgPaths;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/image")
public class ImageController extends BaseController{
    
    @RequestMapping(value = "/{uuid_ev:^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}}" +
        "/{uuid_vis:[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$}",method = RequestMethod.GET)
    public @ResponseBody byte[] getImage(@PathVariable("uuid_ev") String uuid_ev, @PathVariable("uuid_vis") String uuid_vis)
            throws IOException{
        String str = ProgPaths.IMAGES_OUTPUT_FOLDER.getData(uuid_ev, uuid_vis , "\\");
        File f = new File(str + ".png");
        if(!f.exists()){
            return Files.readAllBytes(
                    new File(ProgPaths.IMAGES_DEFAULT.getData()).toPath()); 
        } 
        return Files.readAllBytes(f.toPath());
    }
}
