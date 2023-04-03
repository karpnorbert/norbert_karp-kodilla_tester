package Book;

import static Book.Book.*;

public class App {
    public static void main(String[] args) {

        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book);
    }
}