import java.util.ArrayList;

public abstract class Observer {

    protected Subject subject;
    protected ArrayList<String> messages;

    public abstract void update();

    public Subject getSubject() {
        return subject;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

}