package helloguice;

import com.google.inject.Inject;

public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider = null;

    @Inject
    public StandardOutMessageRenderer(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }
}
