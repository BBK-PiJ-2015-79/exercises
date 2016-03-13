package sml;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chris on 16/02/2016.
 */
public class InstructionFactoryTest {

    @Test
    public void testGetInstance() throws Exception {
        InstructionFactory factory = InstructionFactory.getInstance();
        InstructionFactory anotherFactory = InstructionFactory.getInstance();

        assertNotNull(factory);
        assertEquals(factory, anotherFactory); //singleton
    }

    @Test
    public void testPropsIsLoadedOnFactoryInstantiation() {
        InstructionFactory factory = InstructionFactory.getInstance();

    }

    @Test
    public void testGetInstructionDoesNotReturnNull() {
        InstructionFactory factory = InstructionFactory.getInstance();
        Instruction ins = null;
        try {
            ins = factory.getInstruction("add", "8 22 23");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(ins);
        assertNotNull(ins);
    }

}
