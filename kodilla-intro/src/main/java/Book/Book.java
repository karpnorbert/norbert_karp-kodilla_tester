package Book;

public class Book {
    private String author;
    private String title;

    public void of (String author, String title){
        this.author = author;
        this.title = title;
    }
    public String getAuthor(){return author;}

    public  String getTitle(){return title;}
}
