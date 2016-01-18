package springdi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by chris on 18/01/2016.
 */
public class HelloWorldSpring {
    private static final String FILENAME = "/Users/chris/IdeaProjects/exercises/week2/src/springdi/bean.properties";

    public static void main(String[] args) throws Exception {
        //get the Bean Factory
        BeanFactory factory = getBeanFactory();

        MessageRenderer mr = (MessageRenderer)factory.getBean("renderer");
        MessageProvider mp = (MessageProvider)factory.getBean("provider");

        mr.setMessageProvider(mp);
        mr.render();
    }

    public static BeanFactory getBeanFactory() throws Exception {
        //
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(factory);

        Properties prop = new Properties();
        prop.load(new FileInputStream(FILENAME));
        rdr.registerBeanDefinitions(prop);

        return factory;
    }
}
