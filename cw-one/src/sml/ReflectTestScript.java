package sml;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Test Reflection for the Instruction types
 * Created by chris on 16/02/2016.
 */
public class ReflectTestScript {
    //TODO remove this class! It's just a hack!

    //private static final String FILENAME = "/Users/chris/IdeaProjects/exercises/cw-one/src/sml/bean.properties";
    //private static final String FILENAME = "bean.properties";
    private static final String FILENAME = Paths.get("").toAbsolutePath().toString() + "/cw-one/src/sml/bean.properties";

    public static void main(String[] args) {
        ReflectTestScript test = new ReflectTestScript();
        test.run();
    }

    public void run() {
        System.out.println("Testing...");
        /* can I use this to get the path across all systems?
        Path currentRelativePath = Paths.get("");
        String str = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + str);
        str += "/smr/";
        */
        try {
            Properties props = new Properties();
            props.load(new FileReader(FILENAME));
            for(String s : props.stringPropertyNames()) {
                System.out.println();
                System.out.println("====");
                System.out.println(s);
                System.out.println(props.getProperty(s));
                System.out.println("====");

                Class<?> instructionClass = Class.forName(props.getProperty(s));
                Constructor<?>[] insConstructors = instructionClass.getConstructors();
                for(int i = 1; i < insConstructors.length; i++) {
                    Constructor<?> cons = insConstructors[i];
                    Class<?>[] params = cons.getParameterTypes();
                    System.out.println(cons);
                    for(Class<?> cl : params) {
                        System.out.println(cl.getName());
                    }
                }
            }

            Object[] argArray = new Object[4];
            argArray[0] = "add";
            argArray[1] = 8;
            argArray[2] = 22;
            argArray[3] = 23;
            Instruction ins = (Instruction) Class.forName("sml.AddInstruction")
                    .getConstructors()[1].newInstance(argArray);
//            Instruction ins = (Instruction) Class.forName("sml.AddInstruction")
//                    .getConstructors()[1].newInstance("add", 8, 22, 23);
            System.out.println(ins.toString());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
