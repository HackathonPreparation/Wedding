package gr.newbies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    /**
     * intializes the spring framework
     * @param args 
     */
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }    
    
    /**
     * initializes the spring config
     * @param application
     * @return 
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}