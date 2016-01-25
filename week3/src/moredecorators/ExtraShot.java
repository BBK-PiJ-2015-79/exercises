package moredecorators;

public class ExtraShot extends BeverageExtra {
    public ExtraShot(Beverage baseBeverage) {
        super(baseBeverage);
        super.setPrice(70);
        super.setDescription("Extra Shot");
    }
}
