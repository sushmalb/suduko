import java.util.Scanner;

class LibraryCatalog {
    private static final int MAX_BOOKS = 100; // Define maximum number of books
    private static String[][] catalog = new String[MAX_BOOKS][5]; // Initialize catalog array
    private static int bookCount = 4; // Number of books initially in the catalog

    public static void main(String[] args) {
        catalog[0] = new String[]{"101", "HTML and CSS", "Jon Duckett", "Available", "Null"};
        catalog[1] = new String[]{"102", "JavaScript: The Good Parts", "Douglas C", "Available", "Null"};
        catalog[2] = new String[]{"103", "Learning Web Design", "Jennifer N", "CP2014", "23-May-2023"};
        catalog[3] = new String[]{"104", "Responsive Web Design", "Ben Frain", "EC3142", "17-May-2023"};

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    issueBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        // Display menu options
    }

    private static void displayAllBooks() {
        // Display all books in the catalog
    }

    private static void issueBook(Scanner scanner) {
        // Issue a book to a student
    }

    private static void returnBook(Scanner scanner) {
        // Return a book and calculate charges if applicable
    }

    private static int findBookIndex(String bookID) {
        // Find the index of a book in the catalog based on its ID
        return -1;
    }
}
