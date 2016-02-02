package factory;

public class ConcreteCreator implements Creator {
    @Override
    public Product getProduct(String productType) {
        if(productType == null) {
            return null;
        }
        else if(productType.equals("Vase")) {
            return new Vase();
        }
        else if(productType.equals("Ball")) {
            return new Ball();
        }
        else if(productType.equals("ConcreteProduct")) {
            return new ConcreteProduct();
        }
        else {
            return new Product() {
                @Override
                public String getName() {
                    return "THIS PRODUCT DOES NOT EXIST";
                }

                @Override
                public void drop() {
                    System.out.println("Eery silence...");
                }
            };
        }
    }
}
