import java.util.ArrayList;

public class User extends Observer{

    public User(Subject subject){

        this.subject = subject;
        this.subject.attach(this);

        this.messages = new ArrayList<String>();

    }

    @Override
    public void update() {

        messages.add(Integer.toString(subject.getState()));

    }

}