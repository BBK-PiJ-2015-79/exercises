package springdi;

/**
 * Created by chris on 18/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    private String message = "Hello, world!";
    @Override
    public String getMessage() {
        return message;
    }
}
