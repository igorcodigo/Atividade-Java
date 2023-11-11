import java.util.ArrayList;

public class Main {

    private static ArrayList<Book> createManyBooks(int qnt) {
        var books = new ArrayList<Book>();

        while (qnt > 0) {
            books.add(new Book(
                    String.format("%f", Math.random()),
                    String.format("%f", Math.random())));
            qnt--;
        }
        return books;
    }

    private static void printBooks(ArrayList<Book> books) {
        books.forEach((book) -> {
            System.out.print("livro de nome "+book.getName()+"\n");
        });
    }

    public static void main(String[] args) {
        var user1 = new User("vini");
        var employee1 = new Employee();
        var livro1 = new Book("abcedario", "vini");
        var shelf1 = new Shelf();
        var library1 = new Library();

        employee1.alugar(livro1);
        user1.setFavoriteBook(livro1);
        shelf1.addBook(livro1);

        library1.addshelf(new Shelf());

        var manyBooks = createManyBooks(3);
        printBooks(manyBooks);

        System.out.println("pelo menos chegou ate aqui");
    }
}