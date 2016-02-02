package decoupledWithFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
    private static final String FILENAME = "/Users/chris/IdeaProjects/exercises/week2/src/decoupledWithFactory/bean.properties";
    private static MessageSupportFactory instance;
    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory() {
        //instance = new MessageSupportFactory(); // I don't think you need this.
        props = new Properties();

        try {
            props.load(new FileInputStream(FILENAME));

            String mrClass = props.getProperty("renderer");
            String mpClass = props.getProperty("provider");

            renderer = (MessageRenderer) Class.forName(mrClass).newInstance();
            provider = (MessageProvider) Class.forName(mpClass).newInstance();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static MessageSupportFactory getInstance() {
        if(instance == null) {
            instance = new MessageSupportFactory();
        }
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
