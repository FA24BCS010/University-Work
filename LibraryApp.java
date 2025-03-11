package LibraryManagement11March;

public class LibraryApp {
    public static void main(String[] args) {


        Address address = new Address("123 Main St", "City 1");
        Person author = new Person("Ahmer ", "Author", address);
        Date pubDate = new Date(26, 6, 2025);
        Book book = new Book("Java", "1234-5678", pubDate, author);

        Person incharge = new Person("Ali", "Librarian", address);
        Person staff = new Person("Ijaz", "Assistant", address);

        Library library = new Library("City Library", book, incharge, staff);
        library.showLibraryDetails();
    }
}