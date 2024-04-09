import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloJavaConfig {

    @Bean
    public HelloJava helloJava(){
        return new HelloJava();
    }
}
