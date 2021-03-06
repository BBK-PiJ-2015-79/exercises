package decoupledWithFactory;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider mp);
    MessageProvider getMessageProvider();
}
