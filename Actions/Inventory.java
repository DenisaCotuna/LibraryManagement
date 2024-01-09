package Actions;

import Items.Album;
import Items.Book;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public List<Book> getBooks() {
        return books;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public double getCash() {
        return cash;
    }

    private List<Book> books = new ArrayList<>();
    private List<Album> albums = new ArrayList<>();
    private double cash;

    public Inventory()
    {
        this.cash = 0;
    }

    public void addBook(String ID, double price, String title, String author, Integer NoCopies){
        for(Book b: books)
            if(b.getID().equals(ID))
            {
                b.addCopies(NoCopies);
                return;
            }
        books.add(new Book(ID, price, title, author, NoCopies));
    }

    public void addAlbum(String ID, double price, String title, String artist, Integer NoCopies){
        for (Album a: albums)
            if(a.getID().equals(ID))
            {
                a.addCopies(NoCopies);
                return;
            }
        albums.add(new Album(ID, price, title, artist, NoCopies));
    }


}
