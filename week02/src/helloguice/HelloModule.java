package helloguice;

import com.google.inject.AbstractModule;

public class HelloModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MessageRenderer.class).to(StandardOutMessageRenderer.class);
        bind(MessageProvider.class).to(HelloWorldMessageProvider.class);
    }
}
