import java.util.ArrayList;

public class Admin extends Observer{

    public Admin(Subject subject){

        this.subject = subject;
        this.subject.attach(this);

        this.messages = new ArrayList<String>();

    }

    @Override
    public void update() {

        messages.add(Integer.toString(subject.getState()));

    }

}