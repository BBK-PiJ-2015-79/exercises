package decoupledWithFactory;

public class HelloWorldMessageProvider implements MessageProvider {
    private String message = "Hello World!";

    public String getMessage() {
        return message;
    }

}
