import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {

    @Test
    public void test() {

        Subject subject = new Subject();

        User u1 = new User(subject);
        User u2 = new User(subject);
        Admin a1 = new Admin(subject);

        assertTrue(u1.getMessages().size() == 0 && u2.getMessages().size() == 0 && a1.getMessages().size() == 0);
        subject.setState(15);
        assertTrue(u1.getMessages().get(0).equals("15") && u2.getMessages().get(0).equals("15") && a1.getMessages().get(0).equals("15"));
        subject.setState(10);
        assertTrue(u1.getMessages().get(1).equals("10") && u2.getMessages().get(1).equals("10") && a1.getMessages().get(1).equals("10"));

    }

}
