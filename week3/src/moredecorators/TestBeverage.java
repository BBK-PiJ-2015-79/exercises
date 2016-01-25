package moredecorators;

import java.text.DecimalFormat;

public class TestBeverage {
    private static DecimalFormat dformat;
    static {
        dformat = new DecimalFormat("#.##");
    }

    public static void main(String[] args) {
        Beverage coffee = new Espresso();
        printBeverage(coffee);
        coffee = new WhippedCream(coffee);
        printBeverage(coffee);
        coffee = new Mocha(coffee);
        printBeverage(coffee);

        coffee = new ExtraShot(new Mocha(new HouseBlend()));
        printBeverage(coffee);
    }

    public static void printBeverage(Beverage beverage) {
        System.out.println("Desc: " + beverage.getDescription());
        System.out.println("Price: " + dformat.format(beverage.getPrice()));
    }
}
