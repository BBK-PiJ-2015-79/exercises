package sml;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyInstructionTest {
    private Machine m;

    @Before
    public void setupMachine() {
        m = new Machine();
        m.setRegisters(new Registers());
    }

    @Test
    public void TestSubtractInstruction() {
        m.getRegisters().setRegister(0, 10);
        m.getRegisters().setRegister(1, 5);
        Instruction subtr = new SubtractInstruction("sub", 2, 0, 1);
        subtr.execute(m);
        assertEquals(50, m.getRegisters().getRegister(2));
    }

}