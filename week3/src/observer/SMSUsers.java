package observer;

/**
 * Created by chris on 22/01/2016.
 */
public class SMSUsers implements Observer {
    private Subject subject;
    private String name;

    public SMSUsers(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update(String desc) {
        System.out.println(name + ": " + desc);
    }

    @Override
    public void subscribe() {
        subject.subscribeObserver(this);
    }

    @Override
    public void unSubscribe() {
        subject.unSubscribeObserver(this);
    }
}
