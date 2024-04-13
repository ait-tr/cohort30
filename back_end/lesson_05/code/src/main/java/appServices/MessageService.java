package appServices;

import org.springframework.stereotype.Component;

//@Component
public class MessageService implements Service{
    @Override
    public String getServiceName() {
        return "MessageService";
    }

    @Override
    public void run() {
        System.out.println("Message service is running");
    }

    @Override
    public void stop() {
        System.out.println("Message service is stopped");
    }
}
