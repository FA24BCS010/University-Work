package LibraryManagement11March;

public class Library {
    private String name;
    private Book book;
    private Person incharge;
    private Person staff;

    public Library(String name, Book book, Person incharge, Person staff) {
        this.name = name;
        this.book = new Book(book);
        this.incharge = new Person(incharge);
        this.staff = new Person(staff);
    }

    public Library(Library other) {
        this.name = other.name;
        this.book = new Book(other.book);
        this.incharge = new Person(other.incharge);
        this.staff = new Person(other.staff);
    }

    public void showLibraryDetails() {
        System.out.println("Library Name: " + name);
        book.showBookDetails();
        incharge.showPersonDetails();
        staff.showPersonDetails();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
