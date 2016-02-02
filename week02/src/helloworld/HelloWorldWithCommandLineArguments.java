package helloworld;

/**
 * First stage refactoring. We now have a way to pass
 * in the message string via command line arguments
 * which is more flexible than just having it hard coded.
 * No longer any need to recompile every time we want
 * to change the message.
 */

public class HelloWorldWithCommandLineArguments {
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println(args[0]);
        }
        else {
            System.out.println("Hello, world!");
        }
    }
}
