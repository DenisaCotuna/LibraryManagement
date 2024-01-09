package Items;

public abstract class Item {
    private String ID;
    public double price;

    public double getPrice() {
        return price;
    }

    public Item(String ID, double price) {
        this.ID = ID;
        this.price = price;
    }

    public String getID() {
        return ID;
    }


}
