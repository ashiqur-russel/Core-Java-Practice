package Exercise7;

public class Customer {
    private int items;

    public Customer() {
        items = (int) (Math.random() * 300);
    }

    public int getItems() {
        return items;
    }

    public void itemHandeled() {
        this.items--;
    }
}
