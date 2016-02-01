package sml;

/**
 * Created by chris on 01/02/2016.
 */
public class MultiplyInstruction extends Instruction {
    private int result;
    private int op1;
    private int op2;

    public MultiplyInstruction(String l, String op) {
        super(l, op);
    }

    public MultiplyInstruction(String label, int result, int op1, int op2) {
        this(label, "mul");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }
    @Override
    public void execute(Machine m) {
        //To-do

    }
}
