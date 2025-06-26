import java.util.ArrayList;

public class User {
    private int userId;
    private String name;
    private ArrayList<Integer> issuedBooks;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getIssuedBooks() {
        return issuedBooks;
    }

    public void issueBook(int bookId) {
        issuedBooks.add(bookId);
    }

    public void returnBook(int bookId) {
        issuedBooks.remove(Integer.valueOf(bookId));
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name + ", Issued Books: " + issuedBooks;
    }
}
