package helloguice;

/**
 * Created by chris on 18/01/2016.
 */
public interface MessageRenderer {
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
    void render();
}
