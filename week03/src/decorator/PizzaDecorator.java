package decorator;

/**
 * Created by chris on 22/01/2016.
 */
public abstract class PizzaDecorator implements Pizza {
    private Pizza basePizza;
    public PizzaDecorator(Pizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public String getDesc() {
        return basePizza.getDesc();
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice();
    }

}
