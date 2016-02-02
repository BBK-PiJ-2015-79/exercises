package factory;

public class ConcreteProduct implements Product {
    private String name = "Concrete Product";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void drop() {
        System.out.println("THUNK!");
    }
}
