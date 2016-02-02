package factory;

public class Vase implements Product {
    private String name = "Vase";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void drop() {
        System.out.println("SMASH!");
    }
}
