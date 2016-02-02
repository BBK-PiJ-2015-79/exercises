package strategy;

public class TestScript {
    public static void main(String[] args) {
        String testString = "This is some test text.";
        TextEditor ed = new TextEditor(new CapTextFormatter());
        ed.publishText(testString);

        ed = new TextEditor(new LowerTextFormatter());
        ed.publishText(testString);
    }
}
