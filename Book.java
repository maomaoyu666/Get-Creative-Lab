import java.util.List;
import java.util.ArrayList;

class Book {
    // Variables to store book information
    String nameOfBook; // The name of the book
    String authorFirstName; // The first name of the author
    String authorLastName; // The last name of the author
    String genre; // The genre of the book
    String ISBN; // The International Standard Book Number
    String publishDate; // The date the book was published
    double price; // The price of the book
    int stock; // The stock level of the book
    boolean isAvailable; // The availability of the book
    String publisher; // The publisher of the book
    List<String> reviews; // List to store the reviews of the book

    // Constructor to initialize book information
    public Book(String nameOfBook, String authorFirstName, String authorLastName, String genre, String ISBN,
            String publishDate, double price, int stock, boolean isAvailable, String publisher) {
        this.nameOfBook = nameOfBook;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
        this.price = price;
        this.stock = stock;
        this.isAvailable = isAvailable;
        this.publisher = publisher;
        this.reviews = new ArrayList<>(); // Initializing the reviews list
    }

    // Methods
    // Method to restock books
    public void restock(int amount) {
        this.stock += amount; // Add amount to the stock
    }

    // Method to sell a book
    public boolean sell() {
        return stock-- > 0; // Return true if the book is in stock, then decrement stock level by 1
    }

    // Method to get the full name of the author
    public String getAuthorFullName() {
        return authorFirstName + " " + authorLastName; // Return the concatenated first and last name of the author
    }

    // Method to add a review to the book
    public void addReview(String review) {
        reviews.add(review); // Add the review to the reviews list
    }

    // Method to get the list of reviews
    public List<String> getReviews() {
        return reviews; // Return the list of reviews
    }

    // Method to update the price of the book
    public void updatePrice(double newPrice) {
        this.price = newPrice; // Set the price to newPrice
    }

    // Method to update the stock level of the book
    public void updateStock(int newStock) {
        this.stock = newStock; // Set the stock to newStock
    }

    // Method to update the availability of the book
    public void updateAvailability(boolean availability) {
        this.isAvailable = availability; // Set availability to isAvailable
    }

    // Method to print book information
    public void printBookInfo() {
        // Print the book name, author full name, and price
        System.out.println("Book: " + nameOfBook + "\nAuthor: " + getAuthorFullName() + "\nPrice: $" + price);
    }

    // Method to calculate the price of the book after a given discount
    public double calculateDiscountPrice(double discount) {
        return price * (1 - discount / 100); // Return the price after applying the discount
    }

    public static void main(String[] args) {
        // Testing BookStore methods
        Book book1 = new Book("Harry Potter", "J.K.", "Rowling", "Fantasy", "123456", "2000", 20.5, 10, true,
                "Bloomsbury");
        book1.printBookInfo();
        book1.restock(5);
        book1.sell();
        book1.addReview("Magical novel best ever!");
        System.out.println("Updated Stock after selling one: " + book1.stock);
        System.out.println("Author's Full Name: " + book1.getAuthorFullName());
        System.out.println("All Reviews: " + book1.getReviews());
        book1.updatePrice(18.5);
        book1.updateStock(20);
        book1.updateAvailability(false);
        System.out.println("Discounted Price (10% discount): " + book1.calculateDiscountPrice(10));

        // Testing Library methods
        Library santaClaraLibrary = new Library();
        santaClaraLibrary.printLibraryInfo();
        santaClaraLibrary.updateLibraryInfo("Santa Clara Library", "160 N Main St", "111-222-3333");
        santaClaraLibrary.printLibraryInfo();

        Book book2 = new Book("Harry Potter 2", "J.K.", "Rowling", "Fantasy", "123654", "2000", 20.5,
                15, true, "Bloomsbury");
        santaClaraLibrary.addNewBook(book2);
        System.out.println("Available books in the library:");
        for (Book book : santaClaraLibrary.books) {
            System.out.println(book.nameOfBook);
        }
        santaClaraLibrary.removeBook(book2);
        santaClaraLibrary.addNewBook(book2);
        System.out.println("Available books in the library:");
        for (Book book : santaClaraLibrary.books) {
            System.out.println(book.nameOfBook);
        }
        System.out.println("Book count in stock: " + santaClaraLibrary.countBooksInStock());

        Person jade = new Person("Jade", "Liu", "jade@email.com", true, "1972 Lin", "123-456-7899", "1999-01-01",
                "A197", "2025-12-31");
        Person sherry = new Person("Sherry", "Zhang", "sherry@email.com", true, "1973 Lin", "321-456-7899",
                "1999-10-22",
                "A198", "2025-12-31");
        santaClaraLibrary.addCustomer(jade);
        santaClaraLibrary.addCustomer(sherry);
        for (Person customer : santaClaraLibrary.customers) {
            System.out.println(customer.firstName + " " + customer.lastName);
        }
        santaClaraLibrary.removeCustomer(sherry);
        for (Person customer : santaClaraLibrary.customers) {
            System.out.println(customer.firstName + " " + customer.lastName);
        }

        Book searchedBook = santaClaraLibrary.searchBookByISBN("123456");
        if (searchedBook != null) {
            System.out.println("Searched Book by ISBN: " + searchedBook.nameOfBook);
        }

        List<Book> fantasyBooks = santaClaraLibrary.searchBookByGenre("Fantasy");
        System.out.println("Books with genre Fantasy:");
        for (Book book : fantasyBooks) {
            System.out.println(book.nameOfBook);
        }

        System.out.println("The amount of books in stock: " + santaClaraLibrary.countBooksInStock());

        // Testing Person methods
        jade.borrowBook("123456");
        jade.borrowBook("123654");
        jade.returnBook("123456");
        jade.printPersonInfo();
        System.out.println("Borrowed book count: " + jade.countBorrowedBooks());
        jade.renewMembership();
        System.out.println("Membership status: " + jade.checkMembershipStatus());
        jade.updateMembershipID("B002");
        System.out.println("Updated membership ID: " + jade.membershipID);
        jade.updatePersonalInfo("jade@outlook.com", "1972 Linden", "341-345-9999");
        System.out.println("Updated person information: ");
        jade.printPersonInfo();
        System.out.println("New Membership ID: " + jade.membershipID);
        jade.incurFee(5.0);
        System.out.println("Outstanding fees: " + jade.checkOutstandingFees());
        jade.payFees(3.0);
        System.out.println("Outstanding fees after payment: " + jade.checkOutstandingFees());
        jade.printBorrowedBooks(santaClaraLibrary.books);
    }

    static class Library {
        // List to store the books in the library
        List<Book> books;
        // List to store the customers of the library
        List<Person> customers;
        // String to store the date information
        String date;
        // Boolean to check if the book is in stock
        boolean inStock;
        // Variables to store library information
        String name;
        String address;
        String phoneNumber;
        String email;
        String website;
        // Integer to store the capacity of the library
        int capacity;

        // Default constructor initializes books and customers lists
        public Library() {
            this.books = new ArrayList<>();
            this.customers = new ArrayList<>();
        }

        // Method to add a customer to the customers list
        public void addCustomer(Person customer) {
            customers.add(customer);
        }

        // Method to remove a customer from the customers list
        public void removeCustomer(Person customer) {
            customers.remove(customer);
        }

        // Method to add a new book to the books list
        public void addNewBook(Book book) {
            books.add(book);
        }

        // Method to remove a book from the books list
        public void removeBook(Book book) {
            books.remove(book);
        }

        // Method to search a book by ISBN
        public Book searchBookByISBN(String ISBN) {
            for (Book book : books)
                if (book.ISBN.equals(ISBN))
                    return book;
            return null; // Return null if no book is found with the given ISBN
        }

        // Method to search books by genre
        public List<Book> searchBookByGenre(String genre) {
            List<Book> result = new ArrayList<>();
            for (Book book : books)
                if (book.genre.equals(genre))
                    result.add(book); // Add the book to the result list if the genre matches
            return result;
        }

        // Method to get all available books
        public List<Book> getAvailableBooks() {
            List<Book> availableBooks = new ArrayList<>();
            for (Book book : books)
                if (book.isAvailable)
                    availableBooks.add(book); // Add the book to the availableBooks list if it is available
            return availableBooks;
        }

        // Method to update library information
        public void updateLibraryInfo(String newName, String newAddress, String newPhoneNumber) {
            this.name = newName;
            this.address = newAddress;
            this.phoneNumber = newPhoneNumber;
        }

        // Method to print library information
        public void printLibraryInfo() {
            System.out.println("Library Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber);
        }

        // Method to count the books in stock in the library
        public int countBooksInStock() {
            int count = 0;
            for (Book book : books)
                count += book.stock; // Add the stock of each book to the count
            return count;
        }
    }

    static class Person {
        // Class variables to store personal information of the person
        String firstName;
        String lastName;
        String email;
        // List to store ISBNs of borrowed books
        List<String> borrowedBooksISBNs;
        // Boolean to check if the person is a member
        boolean isMember;
        // Other relevant personal information
        String address;
        String phoneNumber;
        String dateOfBirth;
        String membershipID;
        String membershipExpiryDate;
        // Double to store any outstanding fees
        double outstandingFees;

        // Constructor to initialize the Person object with provided information and
        // some defaults
        public Person(String firstName, String lastName, String email, boolean isMember, String address,
                String phoneNumber, String dateOfBirth, String membershipID, String membershipExpiryDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.borrowedBooksISBNs = new ArrayList<>();
            this.isMember = isMember;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.dateOfBirth = dateOfBirth;
            this.membershipID = membershipID;
            this.membershipExpiryDate = membershipExpiryDate;
            this.outstandingFees = 0.0;
        }

        // Method to add a borrowed book's ISBN to the list
        public void borrowBook(String ISBN) {
            borrowedBooksISBNs.add(ISBN);
        }

        // Method to remove a returned book's ISBN from the list
        public void returnBook(String ISBN) {
            borrowedBooksISBNs.remove(ISBN);
        }

        // Method to renew membership
        public void renewMembership() {
            this.membershipExpiryDate = (Integer.parseInt(membershipExpiryDate.split("-")[0]) + 1) + "-12-31";
        }

        // Method to update personal information
        public void updatePersonalInfo(String newEmail, String newAddress, String newPhoneNumber) {
            this.email = newEmail;
            this.address = newAddress;
            this.phoneNumber = newPhoneNumber;
        }

        // Method to print personal information of the person
        public void printPersonInfo() {
            System.out.println(
                    "Name: " + firstName + " " + lastName + "\nEmail: " + email + "\nPhone Number: " + phoneNumber);
        }

        // Method to check membership status
        public boolean checkMembershipStatus() {
            return isMember;
        }

        // Method to count the number of borrowed books
        public int countBorrowedBooks() {
            return borrowedBooksISBNs.size();
        }

        // Method to update membership ID
        public void updateMembershipID(String newID) {
            this.membershipID = newID;
        }

        // Method to make a payment towards outstanding fees
        public void payFees(double amount) {
            this.outstandingFees -= amount;
        }

        // Method to incur a fee
        public void incurFee(double amount) {
            this.outstandingFees += amount;
        }

        // Method to check the amount of outstanding fees
        public double checkOutstandingFees() {
            return this.outstandingFees;
        }

        // Method to print the list of borrowed books
        public void printBorrowedBooks(List<Book> books) {
            System.out.println(firstName + " " + lastName + " has borrowed the following books:");
            for (String ISBN : borrowedBooksISBNs) {
                for (Book book : books) {
                    if (book.ISBN.equals(ISBN))
                        System.out.println(book.nameOfBook);
                }
            }
        }
    }
}
