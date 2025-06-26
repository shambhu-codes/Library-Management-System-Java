import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getBookId() == book.getBookId()) {
                System.out.println("Book ID already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void addUser(User user) {
        for (User u : users) {
            if (u.getUserId() == user.getUserId()) {
                System.out.println("User ID already exists.");
                return;
            }
        }
        users.add(user);
        System.out.println("User added successfully.");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("--- Book List ---");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void showUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("--- User List ---");
            for (User u : users) {
                System.out.println(u);
            }
        }
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book.isIssued()) {
            System.out.println("Book already issued.");
            return;
        }

        book.issueTo(userId);
        user.issueBook(bookId);
        System.out.println("Book issued to " + user.getName());
    }

    public void returnBook(int bookId) {
        Book book = findBookById(bookId);
        if (book == null || !book.isIssued()) {
            System.out.println("Book not issued or not found.");
            return;
        }

        int userId = book.getIssuedToUserId();
        User user = findUserById(userId);
        if (user != null) {
            user.returnBook(bookId);
        }

        book.returnBook();
        System.out.println("Book returned successfully.");
    }

    private Book findBookById(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) return b;
        }
        return null;
    }

    private User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) return u;
        }
        return null;
    }
}
