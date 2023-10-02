import java.util.List;
import java.util.ArrayList;

class BookStore {
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
    public BookStore(String nameOfBook, String authorFirstName, String authorLastName, String genre, String ISBN,
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
}


class Library {
    // List to store the books in the library
    List<BookStore> books;
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
    public void addNewBook(BookStore book) {
        books.add(book);
    }

    // Method to remove a book from the books list
    public void removeBook(BookStore book) {
        books.remove(book);
    }

    // Method to search a book by ISBN
    public BookStore searchBookByISBN(String ISBN) {
        for (BookStore book : books)
            if (book.ISBN.equals(ISBN))
                return book;
        return null; // Return null if no book is found with the given ISBN
    }

    // Method to search books by genre
    public List<BookStore> searchBookByGenre(String genre) {
        List<BookStore> result = new ArrayList<>();
        for (BookStore book : books)
            if (book.genre.equals(genre))
                result.add(book); // Add the book to the result list if the genre matches
        return result;
    }

    // Method to get all available books
    public List<BookStore> getAvailableBooks() {
        List<BookStore> availableBooks = new ArrayList<>();
        for (BookStore book : books)
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
        for (BookStore book : books)
            count += book.stock; // Add the stock of each book to the count
        return count;
    }
}


class Person {
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

    // Constructor to initialize the Person object with provided information and some defaults
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

    // Method to renew membership (implementation detail to be added)
    public void renewMembership() {
        // Implement the logic to renew membership
    }

    // Method to update personal information
    public void updatePersonalInfo(String newEmail, String newAddress, String newPhoneNumber) {
        this.email = newEmail;
        this.address = newAddress;
        this.phoneNumber = newPhoneNumber;
    }

    // Method to print personal information of the person
    public void printPersonInfo() {
        System.out.println("Name: " + firstName + " " + lastName + "\nEmail: " + email + "\nPhone Number: " + phoneNumber);
    }

    // Method to check membership status (implementation detail to be added)
    public boolean checkMembershipStatus() {
        // Implement the logic to check membership status
        return true;
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
    public void printBorrowedBooks(List<BookStore> books) {
        System.out.println(firstName + " " + lastName + " has borrowed the following books:");
        for (String ISBN : borrowedBooksISBNs) {
            for (BookStore book : books) {
                if (book.ISBN.equals(ISBN))
                    System.out.println(book.nameOfBook);
            }
        }
    }
}

