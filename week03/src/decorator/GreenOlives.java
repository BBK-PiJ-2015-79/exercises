package decorator;

/**
 * Created by chris on 25/01/2016.
 */
public class GreenOlives extends PizzaDecorator implements Pizza {
    private String desc;
    private double price;
    public GreenOlives(Pizza basePizza) {
        super(basePizza);
        this.desc = "Green Olives";
        this.price = 5.47;
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
