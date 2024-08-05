public class Book {
    private Author author;
    private int year;
    private String title;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }


    public void setYear(int year) {
        this.year = year;
    }


}
