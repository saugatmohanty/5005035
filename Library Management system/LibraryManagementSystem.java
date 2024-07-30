import java.util.Arrays;

public class LibraryManagementSystem {
    private Book[] books;
    private int count;

    public LibraryManagementSystem(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full");
        }
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, count, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(10);

        lms.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        lms.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        lms.addBook(new Book(3, "1984", "George Orwell"));

        System.out.println(lms.linearSearchByTitle("1984"));
        System.out.println(lms.binarySearchByTitle("The Great Gatsby"));
    }
}
//Linear Search:

//Algorithm: Linear search sequentially checks each element of the list until the target element is found or the list ends.
//Time Complexity: O(n), where n is the number of elements in the list.
//Usage: Effective for small or unsorted datasets.
//Binary Search:

//Algorithm: Binary search divides the sorted list in half and compares the target element to the middle element. If the target is less than the middle, it searches the left half; otherwise, it searches the right half. This process repeats until the target is found or the search space is empty.
//Time Complexity: O(log n), where n is the number of elements in the list.
//Usage: Effective for large, sorted datasets.
//Time Complexity Analysis:

//Linear Search:

//Best Case: O(1) (if the target is the first element)
//Worst Case: O(n) (if the target is the last element or not present)
//Binary Search:

//Best Case: O(1) (if the target is the middle element)
//Worst Case: O(log n) (due to halving the search space)
//When to Use Each Algorithm:

//Linear Search:

//Unsorted Data: Suitable for unsorted datasets.
//Small Data Sets: Effective for small lists where the overhead of sorting is not justified.
//Dynamic Data: Ideal when elements are frequently inserted or removed, as maintaining sorted order is costly.
//Binary Search:

//Sorted Data: Efficient for large, sorted datasets.
//Static Data: Best for static data where sorting is done once and search operations are frequent.
//File Organization:

//Book.java:

//Contains the Book class definition.
//LibraryManagementSystem.java:

//Contains the LibraryManagementSystem class and the main method for testing.
