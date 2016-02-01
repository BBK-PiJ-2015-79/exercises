package sml;

/**
 * Subtract instruction for SML
 */
public class SubtractInstruction extends Instruction {
    private int result;
    private int op1;
    private int op2;

    public SubtractInstruction(String l, String op) {
        super(l, op);
    }

    public SubtractInstruction(String label, int result, int op1, int op2) {
        this(label, "sub");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }


    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }
}
