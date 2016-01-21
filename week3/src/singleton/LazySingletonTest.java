package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingletonTest {
    @Test
    public void checkThatSingleInstanceCreated() {
        LazySingleton sing1 = LazySingleton.getInstance();
        LazySingleton sing2 = LazySingleton.getInstance();
        System.out.println(sing1);
        System.out.println(sing2);
        assertEquals(sing1, sing2);
    }
}