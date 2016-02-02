package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 22/01/2016.
 */
public class CommentaryObject implements Subject, Commentary {
    private List<Observer> observers;
    private String event;
    private String desc;

    public CommentaryObject(List<Observer> observers, String event) {
        if(observers == null) {
            this.observers = new ArrayList<>();
        }
        else {
            this.observers = observers;
        }
        if(event == null) {
            this.event = "Unknown sporting event";
        }
        else {
            this.event = event;
        }
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer); // boolean discarded
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer); // boolean discarded
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return event;
    }
}
