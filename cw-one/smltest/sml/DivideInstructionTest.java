package sml;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chris on 01/02/2016.
 */
public class DivideInstructionTest {
    private Machine m;

    @Before
    public void setupMachine() {
        m = new Machine();
        m.setRegisters(new Registers());
    }

    @Test
    public void TestDivideInstruction() {
        m.getRegisters().setRegister(0, 10);
        m.getRegisters().setRegister(1, 5);
        Instruction subtr = new MultiplyInstruction("sub", 2, 0, 1);
        subtr.execute(m);
        assertEquals(2, m.getRegisters().getRegister(2));
    }
}