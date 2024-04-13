package configs;

import appServices.Application;
import appServices.EMailService;
import appServices.MessageService;
import appServices.SMSService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Application application(){
        return new Application(getMessage());
    }

    public EMailService getEmail(){
        return new EMailService();
    }

    public MessageService getMessage(){
        return new MessageService();
    }

    public SMSService getSMS(){
        return new SMSService();
    }

}
