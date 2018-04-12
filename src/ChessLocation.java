/**
 
 * 
 * @Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 * 
 * 
 * 
 * ChessLocation allows you to store the rows and cols and have accessible methods
 */
public class ChessLocation
{
    //To determine where these pieces are at the chess board
    private int row1;
    private int col1;
    
    /**
     * Constructor for objects of class ChessLocation
     */
    public ChessLocation(int row,int col)
    {
        // initialise instance variables for row and column
        row1 = row;//setting row into row1
        col1 = col;//setting col into col1
        
    }
    /**
     *GetRow method returns the row
     * 
     */
    public int GetRow()
    {
        return row1;//returns row
    }
    /**
     * Getcol method returns the col
     */public int GetCol()
    {
        return col1;//returns column
    }
}
