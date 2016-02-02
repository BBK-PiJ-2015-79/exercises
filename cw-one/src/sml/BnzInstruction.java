package sml;

import java.util.List;

public class BnzInstruction extends Instruction {
    private int checkReg;
    private String nextInstruction;

    public BnzInstruction(String l, String op) {
        super(l, op);
    }

    public BnzInstruction(String label, int checkReg, String nextInstruction) {
        this(label, "bnz");
        this.checkReg = checkReg;
        this.nextInstruction = nextInstruction;
    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(checkReg) == 0) {
            return;
        }
        List<Instruction> prog = m.getProg();
        int newPc = m.getLabels().indexOf(nextInstruction);
        if(newPc > -1) {
            m.setPc(newPc);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " if " + checkReg + " = 0, jump to " + nextInstruction;
    }
}
