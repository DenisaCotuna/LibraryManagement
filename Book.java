public class Book extends Item implements Borrowable,Buyable{
    private String title;
    private String author;
    private Integer copies;
    private double borrowPrice;
    private Integer borrowed;

    public Book(String ID, double price, String title, String author, Integer NoCopies) {
        super(ID, price);
        this.title = title;
        this.author = author;
        this.copies = NoCopies;
        this.borrowPrice = (20.0/100.0) * price;
        this.borrowed = 0;
    }

    public double getBorrowPrice() {
        return borrowPrice;
    }

    public void addCopies(Integer NoCopies){
        this.copies += NoCopies;
    }

    public void removeCopies(Integer NoCopies){
        this.copies -= NoCopies;
    }

    public void borrowBook(Integer NoCopies){
        this.borrowed += NoCopies;
    }

    public void returnBook(Integer NoCopies) {
        this.borrowed -= NoCopies;
    }

    @Override
    public void buyItem(Integer NoCopies) {
        removeCopies(NoCopies);
    }

    @Override
    public void borrowItem(Integer NoCopies) {
        removeCopies(NoCopies);
        borrowBook(NoCopies);
    }

    @Override
    public void returnItem(Integer NoCopies) {
        returnBook(NoCopies);
        addCopies(NoCopies);
    }
}
