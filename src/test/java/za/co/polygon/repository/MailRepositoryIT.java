package za.co.polygon.repository;

import org.junit.Ignore;
import za.co.reverside.repository.MailRepository;
import org.junit.Test;

import za.co.reverside.domain.Notification;

@Ignore
public class MailRepositoryIT {

    @Test
    
    public void testSend() {
        Notification notification = new Notification("manmay.mohanty@reverside.co.za", "Polygon Notification Test", "This is a test notification");
        try {
            MailRepository mailRepository = new MailRepository("smtp.gmail.com",587,"polygon.testing@gmail.com","Polygon@Testing");
            mailRepository.send(notification);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
