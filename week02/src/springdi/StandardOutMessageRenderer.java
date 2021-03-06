package springdi;

/**
 * Created by chris on 18/01/2016.
 */
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider provider = null;
    @Override
    public void render() {
        if(provider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }
        else {
            System.out.println(provider.getMessage());
        }
    }

    @Override
    public void setMessageProvider(MessageProvider mp) {
        provider = mp;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return provider;
    }
}
