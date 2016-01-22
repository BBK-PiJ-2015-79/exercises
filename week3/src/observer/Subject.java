package observer;

/**
 * Created by chris on 22/01/2016.
 */
public interface Subject {
    void subscribeObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObservers();
    String subjectDetails();
}
