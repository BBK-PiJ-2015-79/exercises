package sml;A

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chris on 16/02/2016.
 */
public class InstructionFactoryTest {

    @Test
    public void testGetInstance() throws Exception {
        InstructionFactory factory = InstructionFactory.getInstance();
        assertNotNull(factory);
    }

    /*
    @Test
    public void testGetInstruction() throws Exception {

    }
    */
}