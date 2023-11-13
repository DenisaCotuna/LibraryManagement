public abstract class Item {
    public String ID;
    public double price;

    public Item(String ID, double price) {
        this.ID = ID;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

}
