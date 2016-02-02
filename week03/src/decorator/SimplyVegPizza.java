package decorator;

/**
 * Created by chris on 22/01/2016.
 */
public class SimplyVegPizza implements Pizza {
    private String desc;
    private double price;

    public SimplyVegPizza() {
        this.price = 230;
        this.desc = "SimplyVegPizza (" + price + ")";
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
