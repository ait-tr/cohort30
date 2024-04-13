package appServices;

import org.springframework.stereotype.Component;

//@Component
public class EMailService implements Service{
    @Override
    public String getServiceName() {
        return "E-mail service";
    }

    @Override
    public void run() {
        System.out.println("E-mail is on the way");
    }

    @Override
    public void stop() {
        System.out.println("E-mail service is stopped");
    }
}
