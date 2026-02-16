/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Zachary Robinson
 * @version 2/15/2026
 */
import java.util.Scanner;
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 0;
        refNumber = "";
        this.courseText = courseText;
    }
    
    // Add the methods here ...
    

    public void setRefNumber(String ref)
    {
        setRefNumber(refNumber);
    }
    
    public String getRefNumber()
    {
        if(refNumber != null && refNumber.length() >= 3 )
        {
            this.refNumber = refNumber;
        }
        else
        {
            System.out.println("Error. Please input three or more characters.");
            refNumber = "";
        }
    }
    
    public void getBorrowed()
    {
        borrowed++;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println(", Author: " + author);
        System.out.println(", Pages: " + pages);
        
        if (refNumber != null && refNumber() > 0) 
        {
            System.out.println("The reference number is: " + refNumber);
        }
        else
        {
            System.out.println("ZZZ");
        }
        System.out.println("Number of times borrowed: " + borrowed);
        
    }
    
    
    
    
    
}
