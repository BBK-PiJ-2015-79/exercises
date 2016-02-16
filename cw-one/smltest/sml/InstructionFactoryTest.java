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
        assertEquals(factory, anotherFactory);
    }


    @Test
    public void testGetInstructionDoesNotReturnNull() {
        InstructionFactory factory = InstructionFactory.getInstance();
        Instruction ins = factory.getInstruction("Nowt", "21 22 Hello");

        assertNotNull(ins);
    }

}
