package factory;

public class MakeStuff {
    public static void main(String[] args) {
        Creator factory = new ConcreteCreator();
        Product myVase = factory.getProduct("Vase");
        System.out.println(myVase.getName());
        myVase.drop();

        Product myConcreteProduct = factory.getProduct("ConcreteProduct");
        System.out.println(myConcreteProduct.getName());
        myConcreteProduct.drop();

        Product myBall = factory.getProduct("Ball");
        System.out.println(myBall.getName());
        myBall.drop();

        Product randomThing = factory.getProduct("RandomThing");
        System.out.println(randomThing.getName());
        randomThing.drop();
    }
}
