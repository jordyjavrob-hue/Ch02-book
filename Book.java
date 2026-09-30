/**
 * A class that maintains information about a book.
 * This might form part of a larger application such
 * as a library system.
 *
 * @author Jordy Robalino
 * @version September 29, 2026
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    // Exercise 2.85: Store the number of pages.
    private int pages;

    // Exercise 2.88: Store the library reference number.
    private String refNumber;

    // Exercise 2.91: Store how many times the book was borrowed.
    private int borrowed;

    // Exercise 2.92: Record whether this is a course textbook.
    private boolean courseText;

    /**
     * Set the initial values when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle,
                int bookPages, boolean bookIsCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookIsCourseText;
    }

    /**
     * Exercise 2.83
     * Return the author of the book.
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Exercise 2.83
     * Return the title of the book.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Exercise 2.84
     * Print the author of the book.
     */
    public void printAuthor()
    {
        System.out.println(author);
    }

    /**
     * Exercise 2.84
     * Print the title of the book.
     */
    public void printTitle()
    {
        System.out.println(title);
    }

    /**
     * Exercise 2.85
     * Return the number of pages in the book.
     */
    public int getPages()
    {
        return pages;
    }

    /**
     * Exercises 2.89, 2.91, and 2.92
     * Print all the current details about the book.
     */
    public void printDetails()
    {
        System.out.println("Title: " + title +
                           ", Author: " + author +
                           ", Pages: " + pages);

        if(refNumber.length() > 0) {
            System.out.println("Reference number: " + refNumber);
        }
        else {
            System.out.println("Reference number: ZZZ");
        }

        System.out.println("Times borrowed: " + borrowed);
        System.out.println("Course textbook: " + courseText);
    }

    /**
     * Exercise 2.90
     * Set the reference number only when it contains
     * at least three characters.
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3) {
            refNumber = ref;
        }
        else {
            System.out.println(
                "Error: reference number must contain at least three characters.");
        }
    }

    /**
     * Exercise 2.88
     * Return the library reference number.
     */
    public String getRefNumber()
    {
        return refNumber;
    }

    /**
     * Exercise 2.91
     * Record that the book has been borrowed one more time.
     */
    public void borrow()
    {
        borrowed = borrowed + 1;
    }

    /**
     * Exercise 2.91
     * Return the number of times the book has been borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }

    /**
     * Exercise 2.92
     * Return whether this book is being used as a course textbook.
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}