import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. View All Books");
            System.out.println("4. View All Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    library.addBook(new Book(bookId, title));
                    break;
                case 2: 
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(userId, name));
                   break;
                case 3 : library.showBooks();break;
                case 4 :library.showUsers();break;
                case 5 :
                    System.out.print("Enter Book ID to issue: ");
                    int book_Id = sc.nextInt();
                    System.out.print("Enter User ID to issue to: ");
                    int user_Id = sc.nextInt();
                    library.issueBook(book_Id, user_Id);
                    break;
                case 6 : 
                    System.out.print("Enter Book ID to return: ");
                    int book$Id = sc.nextInt();
                    library.returnBook(book$Id);
                    break;
                case 7 : System.out.println("Exiting...");break;
                default : System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
}
