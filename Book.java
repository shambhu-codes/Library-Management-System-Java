public class Book {
    private int bookId;
    private String title;
    private boolean isIssued;
    private int issuedToUserId;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
        this.issuedToUserId = -1;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public int getIssuedToUserId() {
        return issuedToUserId;
    }

    public void issueTo(int userId) {
        isIssued = true;
        issuedToUserId = userId;
    }

    public void returnBook() {
        isIssued = false;
        issuedToUserId = -1;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title +
                (isIssued ? " (Issued to User ID: " + issuedToUserId + ")" : " (Available)");
    }
}
