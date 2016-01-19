package factory;

public interface Creator {
    default Product getProduct(String productType) {
        return new Product() {
            @Override
            public String getName() {
                return "I have no idea what I am";
            }

            @Override
            public void drop() {
                System.out.println("Eery silence...");
            }
        };
    }
}
