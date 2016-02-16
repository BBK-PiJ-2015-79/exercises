package sml;

import java.io.FileReader;
import java.util.Properties;

/**
 * Instruction factory. Given an op code and a list of arguments, the
 * factory constructs an object of an appropriate type and returns it to
 * the caller.
 *
 * This in not thread safe!
 *
 * Created by chris on 16/02/2016.
 */
public class InstructionFactory {

    private static InstructionFactory instance;
    private static final String FILENAME = "/Users/chris/IdeaProjects/exercises/cw-one/src/sml/bean.properties";

    private Properties props;

    private InstructionFactory() {
        try {
            props = new Properties();
            props.load(new FileReader(FILENAME));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Get an instance of the InstructionFactory
     */
    public static InstructionFactory getInstance() {
        //if(instance == null) {
        //    instance = new InstructionFactory();
        //}
        //return instance;
        return null;
    }

    public Instruction getInstruction(String op, String args) {
        // TODO implement this
        return null;
    }

}
