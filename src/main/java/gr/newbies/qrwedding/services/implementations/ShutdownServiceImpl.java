package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.services.ShutdownService;
import org.springframework.stereotype.Service;

/**
 *
 * @author KuroiTenshi
 */
@Service
public class ShutdownServiceImpl implements ShutdownService {
    @Override
    public void Shutdown() {
        System.out.println("Session terminated by the user");
        System.exit(0);
    }    
}
