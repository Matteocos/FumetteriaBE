package school.devskill.FumetteriaBE;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
    @Bean
    public ObjectMapper mapper(){return new ObjectMapper();}
    /**@Bean
    public WebMvcConfigurer cors(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMapping (CorsRegistry registry){
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
            }
        };
    }**/

}
