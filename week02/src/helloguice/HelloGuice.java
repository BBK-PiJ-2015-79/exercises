package helloguice;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class HelloGuice {
    private MessageProvider provider;
    private MessageRenderer renderer;

    @Inject
    HelloGuice(MessageProvider provider, MessageRenderer renderer) {
        this.provider = provider;
        this.renderer = renderer;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HelloModule());
        HelloGuice hg = injector.getInstance(HelloGuice.class);
        hg.run();
    }
    public void run() {
        renderer.render();
    }
}
