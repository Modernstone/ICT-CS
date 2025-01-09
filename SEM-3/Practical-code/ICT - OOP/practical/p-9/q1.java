import java.util.Scanner;

class Book {
    int bookID;
    String bookName;

    // Constructor
    Book(int bookID, String bookName) {
        this.bookID = bookID;
        this.bookName = bookName;
    }

    // Display Book details
    void displayBook() {
        System.out.println("Book ID: " + bookID + ", Book Name: " + bookName);
    }
}

public class LibraryManagement {
    static Scanner sc = new Scanner(System.in);
    static Book[] books = new Book[5]; // Array to store 5 book records

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nLibrary Management");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Update Book by ID");
            System.out.println("5. Delete Book by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBooks();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }

    // Method to add books
    public static void addBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();
            books[i] = new Book(id, name);
        }
        System.out.println("Books added successfully.");
    }

    // Method to display all books
    public static void displayBooks() {
        for (Book book : books) {
            if (book != null) {
                book.displayBook();
            }
        }
    }

    // Method to search for a book by ID
    public static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Book book : books) {
            if (book != null && book.bookID == id) {
                book.displayBook();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Method to update a book's name by ID
    public static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        boolean updated = false;

        for (Book book : books) {
            if (book != null && book.bookID == id) {
                System.out.print("Enter new Book Name: ");
                book.bookName = sc.nextLine();
                updated = true;
                System.out.println("Book updated successfully.");
                break;
            }
        }

        if (!updated) {
            System.out.println("Book not found.");
        }
    }

    // Method to delete a book by ID
    public static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();
        boolean deleted = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].bookID == id) {
                books[i] = null; // Remove the book
                deleted = true;
                break;
            }
        }
        if (deleted) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}

/*
Library Management
1. Add Book
2. Display All Books
3. Search Book by ID
4. Update Book by ID
5. Delete Book by ID
6. Exit
Enter your choice: 1
Enter Book ID: 1
Enter Book Name: qqq
Enter Book ID: 2
Enter Book Name: qqqq
Enter Book ID: 3
Enter Book Name: qqqqq
Enter Book ID: 4
Enter Book Name: qqqqqq
Enter Book ID: 5
Enter Book Name: qqqqqqq
Books added successfully.

Library Management
1. Add Book
2. Display All Books
3. Search Book by ID
4. Update Book by ID
5. Delete Book by ID
6. Exit
Enter your choice: 2
Book ID: 1, Book Name: qqq
Book ID: 2, Book Name: qqqq
Book ID: 3, Book Name: qqqqq
Book ID: 4, Book Name: qqqqqq
Book ID: 5, Book Name: qqqqqqq

Library Management
1. Add Book
2. Display All Books
3. Search Book by ID
4. Update Book by ID
5. Delete Book by ID
6. Exit
Enter your choice: 3
Enter Book ID to search: 2
Book ID: 2, Book Name: qqqq

Library Management
1. Add Book
2. Display All Books
3. Search Book by ID
4. Update Book by ID
5. Delete Book by ID
6. Exit
Enter your choice: 4
Enter Book ID to update: 5
Enter new Book Name: q
Book updated successfully.

Library Management
1. Add Book
2. Display All Books
3. Search Book by ID
4. Update Book by ID
5. Delete Book by ID
6. Exit
Enter your choice: 2
Book ID: 1, Book Name: qqq
Book ID: 2, Book Name: qqqq
Book ID: 3, Book Name: qqqqq
Book ID: 4, Book Name: qqqqqq
Book ID: 5, Book Name: q

Library Management
1. Add Book
2. Display All Books
3. Search Book by ID
4. Update Book by ID
5. Delete Book by ID
6. Exit
Enter your choice: 5
Enter Book ID to delete: 1
Book deleted successfully.

Library Management
1. Add Book
2. Display All Books
3. Search Book by ID
4. Update Book by ID
5. Delete Book by ID
6. Exit
Enter your choice: 2
Book ID: 2, Book Name: qqqq
Book ID: 3, Book Name: qqqqq
Book ID: 4, Book Name: qqqqqq
Book ID: 5, Book Name: q

Library Management
1. Add Book
2. Display All Books
3. Search Book by ID
4. Update Book by ID
5. Delete Book by ID
6. Exit
Enter your choice: 6
Exiting...
 */