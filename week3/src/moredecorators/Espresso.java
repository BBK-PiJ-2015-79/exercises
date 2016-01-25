package moredecorators;

public class Espresso implements Beverage {
    private String description;
    private double price;

    public Espresso() {
        this.description = "Espresso";
        this.price = 180;
    }

    @Override
    public String getDescription() {
        return description + " (" + price + ")";
    }

    @Override
    public double getPrice() {
        return price;
    }
}
