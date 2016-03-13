package sml;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Instruction factory. Given an op code and a list of arguments, the
 * factory constructs an object of an appropriate type and returns it to
 * the caller.
 *
 * This is not thread safe!
 *
 * Created by chris on 16/02/2016.
 */
public class InstructionFactory {

    private static InstructionFactory instance;
    //private static final String FILENAME = "/Users/chris/IdeaProjects/exercises/cw-one/src/sml/bean.properties";
    private static final String FILENAME = Paths.get("").toAbsolutePath().toString() + "/cw-one/src/sml/bean.properties";

    private Properties props;

    private InstructionFactory() {
        System.out.println(FILENAME);
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
        if(instance == null) {
            instance = new InstructionFactory();
        }
        return instance;
    }

    public Instruction getInstruction(String op, String args) throws ClassNotFoundException {
        // TODO implement this
        //System.out.println(op);
        String className = props.getProperty(op);
        Constructor<?> classConstructor = null;
        //System.out.println(className);

        try {
            classConstructor = Class.forName(className).getConstructors()[1];
        }
        catch(ClassNotFoundException e) {
            throw e;
        }
        catch(Exception e) {
            e.printStackTrace();
        }


        String[] argArray = args.split(" ");
        Object[] argObjArray = new Object[argArray.length + 1];
        argObjArray[0] = op;

        Class<?>[] paramTypes = classConstructor.getParameterTypes();
//        System.out.println(argArray.length);
//        System.out.println(paramTypes.length);
//        System.out.println(argArray.length == paramTypes.length);
        for(int i = 1; i < paramTypes.length; i++) {
            //
            if(paramTypes[i].getName().equals("int")) {
                //parse it as an integer and put it in the object array
                argObjArray[i] = Integer.parseInt(argArray[i-1]);
            }
            else {
                //it's a string, just bung it straight in
                argObjArray[i] = argArray[i-1];
            }
        }

        Instruction ins = null;
        try {
            ins = (Instruction) classConstructor.newInstance(argObjArray);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return ins;
    }

}
