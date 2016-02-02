package decorator;

/**
 * Created by chris on 22/01/2016.
 */
public class SimplyNonVegPizza implements Pizza {
    private String desc;
    private double price;

    public SimplyNonVegPizza() {
        this.price = 350;
        this.desc = "SimplyNonVegPizza (" + price + ")";
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
