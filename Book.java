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

    /**
     * Set the author, title, and number of pages when
     * this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
}