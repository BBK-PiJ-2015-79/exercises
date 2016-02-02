package moredecorators;

public class WhippedCream extends BeverageExtra {
    public WhippedCream(Beverage baseBeverage) {
        super(baseBeverage);
        super.setPrice(120);
        super.setDescription("Whipped Cream");
    }
}
