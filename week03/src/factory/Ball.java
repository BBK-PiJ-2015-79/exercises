package factory;

public class Ball implements Product {
    private String name = "Ball";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void drop() {
        System.out.println("BOING!");
    }
}
