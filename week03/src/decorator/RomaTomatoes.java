package decorator;

/**
 * Created by chris on 25/01/2016.
 */
public class RomaTomatoes extends PizzaDecorator implements Pizza {
    private String desc;
    private double price;
    public RomaTomatoes(Pizza basePizza) {
        super(basePizza);
        this.desc = "Roma Tomatoes";
        this.price = 5.2;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", " + this.desc + " (" + this.price + ")";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.price;
    }
}
