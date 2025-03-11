package LibraryManagement11March;

public class Book {
    private String title;
    private String issn;
    private Date publicationDate;
    private Person author;

    public Book(String title, String issn, Date publicationDate, Person author) {
        this.title = title;
        this.issn = issn;
        this.publicationDate = new Date(publicationDate);
        this.author = new Person(author);
    }

    public Book(Book other) {
        this.title = other.title;
        this.issn = other.issn;
        this.publicationDate = new Date(other.publicationDate);
        this.author = new Person(other.author);
    }

    public void showBookDetails() {
        System.out.println("Title: " + title + ", ISSN: " + issn);
        publicationDate.showDate();
        author.showPersonDetails();
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getIssn() {
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }
}
