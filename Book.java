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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
    
    
    
}
