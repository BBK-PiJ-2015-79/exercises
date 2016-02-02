package helloworld;

/**
 * A plain old Hello World, this is the starting point for
 * the dependency injection stuff.
 *
 * Note the dependencies - we are dependent on the mesage
 * string. The class has to be recompiled every time you want
 * to change the message.
 *
 * Dependent on System.out.println() - we can only
 * send the message to the standard output. What
 * happens if we want to change this?
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
