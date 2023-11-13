public class Album extends Item implements Buyable{
    private String title;
    private String artist;
    private Integer copies;

    public Album(String ID, double price, String title, String artist, Integer NoCopies) {
        super(ID, price);
        this.title = title;
        this.artist = artist;
        this.copies = NoCopies;
    }

    public String getTitle() {
        return title;
    }

    public void addCopies(Integer NoCopies){
        this.copies += NoCopies;
    }

    public void removeCopies(Integer NoCopies){
        this.copies -= NoCopies;
    }

    @Override
    public void buyItem(Integer NoCopies) {
        removeCopies(NoCopies);
    }
}
