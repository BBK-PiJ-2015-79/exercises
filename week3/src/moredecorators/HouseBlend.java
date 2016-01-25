package moredecorators;

public class HouseBlend implements Beverage {
    private String description;
    private double price;

    public HouseBlend() {
        this.description = "House Blend";
        this.price = 200;
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
