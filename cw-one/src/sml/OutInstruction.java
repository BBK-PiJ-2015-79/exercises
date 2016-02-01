package sml;

/**
 * Created by chris on 01/02/2016.
 */
public class OutInstruction extends Instruction {
    public OutInstruction(String l, String op) {
        super(l, op);
    }
    private int op;

    public OutInstruction(String label, int op) {
        this(label, "out");
        this.op = op;
    }

    @Override
    public void execute(Machine m) {
        System.out.println(m.getRegisters().getRegister(op));
    }
}
