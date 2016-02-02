package strategy;

public class LowerTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[" + this.getClass().getSimpleName() + "]: " + text.toLowerCase());
    }
}
