package observer;

/**
 * Created by chris on 22/01/2016.
 */
public interface Observer {
    void update(String desc);
    void subscribe();
    void unSubscribe();
}
