import java.util.ArrayList;

public class Library {
    private ArrayList<Shelf> shelfs;

    public Boolean addshelf(Shelf newShelf) {
        this.shelfs.add(newShelf);
        return true;
    }

    public Boolean addBookOnShelf(String category, Book newBook) {
        this.shelfs.get(1).addBook(newBook);
        return true;
    }

    public ArrayList<Shelf> listShelfs() {
        return this.shelfs;
    }
}
