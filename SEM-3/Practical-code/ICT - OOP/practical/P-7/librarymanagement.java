import java.util.Scanner;

class librarybook {
    // Fields with access specifiers
    private int bookID;
    private char[] title = new char[30];
    private char[] author = new char[30];
    private char genre;
    private float price;

    // Constructor to initialize book details
    public librarybook(int bookID, char[] title, char[] author, char genre, float price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    // Overloaded methods for different operations

    // Function 1: Display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookID);
        System.out.print("Title: ");
        System.out.println(title);
        System.out.print("Author: ");
        System.out.println(author);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
    }

    // Function 2: Display book by genre
    public void displayByGenre(char genre) {
        if (this.genre == genre) {
            displayBook();
        }
    }

    // Function 3: Display book by price range
    public void displayByPriceRange(float minPrice, float maxPrice) {
        if (this.price >= minPrice && this.price <= maxPrice) {
            displayBook();
        }
    }

    // Getter methods for filters (additional, if needed)
    public char getGenre() {
        return genre;
    }

    public float getPrice() {
        return price;
    }
}

public class librarymanagement {
    public static void main(String[] args) {
        // Taking input for 5 books
        Scanner sc = new Scanner(System.in);
        librarybook[] books = new librarybook[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int bookID = sc.nextInt();
            sc.nextLine(); // consume the newline

            System.out.print("Title: ");
            String titleStr = sc.nextLine();
            char[] title = titleStr.toCharArray();

            System.out.print("Author: ");
            String authorStr = sc.nextLine();
            char[] author = authorStr.toCharArray();

            System.out.print("Genre (one character): ");
            char genre = sc.next().charAt(0);

            System.out.print("Price: ");
            float price = sc.nextFloat();

            // Create new book object
            books[i] = new librarybook(bookID, title, author, genre, price);
        }

        // Menu for displaying books based on user choice
        int choice;
        do {
            System.out.println("\n--- Library Book Management Menu ---");
            System.out.println("1. Display All Books");
            System.out.println("2. Display Books by Genre");
            System.out.println("3. Display Books by Price Range");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Display all books
                    for (librarybook book : books) {
                        book.displayBook();
                    }
                    break;

                case 2:
                    // Display books by genre
                    System.out.print("Enter genre to filter by (one character): ");
                    char genre = sc.next().charAt(0);
                    for (librarybook book : books) {
                        book.displayByGenre(genre);
                    }
                    break;

                case 3:
                    // Display books by price range
                    System.out.print("Enter minimum price: ");
                    float minPrice = sc.nextFloat();
                    System.out.print("Enter maximum price: ");
                    float maxPrice = sc.nextFloat();
                    for (librarybook book : books) {
                        book.displayByPriceRange(minPrice, maxPrice);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
