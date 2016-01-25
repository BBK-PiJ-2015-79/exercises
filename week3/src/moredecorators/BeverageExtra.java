package moredecorators;

public abstract class BeverageExtra implements Beverage {
    private Beverage baseBeverage;

    private double price;
    private String description;

    public BeverageExtra(Beverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", " + this.description + " (" + this.price + ")";
    }

    @Override
    public double getPrice() {
        return baseBeverage.getPrice() + this.price;
    }
}
