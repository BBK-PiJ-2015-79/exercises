package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class EagerSingletonTest {
    @Test
    public void checkThatSingleInstanceCreated() {
        EagerSingleton sing1 = EagerSingleton.getInstance();
        EagerSingleton sing2 = EagerSingleton.getInstance();
        System.out.println(sing1);
        System.out.println(sing2);
        assertEquals(sing1, sing2);
    }
}