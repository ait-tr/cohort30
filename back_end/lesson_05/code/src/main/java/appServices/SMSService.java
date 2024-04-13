package appServices;

import org.springframework.stereotype.Component;

//@Component
public class SMSService implements Service{
    @Override
    public String getServiceName() {
        return "SMS service";
    }

    @Override
    public void run() {
        System.out.println("SMS is on the way");
    }

    @Override
    public void stop() {
        System.out.println("SMS service is stopped");
    }
}
