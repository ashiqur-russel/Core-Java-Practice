package list;

public class Record {

    private String name;
    private double price;
    private int amount;
    private ProductType productType;

    public Record(String name, double price, int amount, ProductType productType) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public ProductType getProductType() {
        return productType;
    }
}
