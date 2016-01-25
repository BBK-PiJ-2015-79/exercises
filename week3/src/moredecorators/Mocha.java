package moredecorators;

public class Mocha extends BeverageExtra {
    public Mocha(Beverage baseBeverage) {
        super(baseBeverage);
        super.setPrice(80);
        super.setDescription("Mocha");
    }
}
