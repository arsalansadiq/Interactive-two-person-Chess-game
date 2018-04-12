
/**
 *
 * 
 * @Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 * 
 * 
 * 
 * ChessBoard class allows you to store different Chess pieces at different locations
 */
public class ChessBoard
{
    // instance variables - replace the example below with your own
    
    public ChessPiece [][] chessboard;//using a two-dimensional Array represent the ChessBoard class.
    public ChessPiece piece;// Defining a piece of type ChessPiece
    /**
     * Constructor for objects of class ChessBoard
     * The constructor will initialize your spaces array to an empty 8x8 array
     */
    public ChessBoard()
    //The constructor will initialize the chess board. 
    //The job of the constructor would be to initialize all the elements in your data structure to all nulls,
    //as initially there aren't any pieces on the board.
    {
         //initialise instance variables
        chessboard = new ChessPiece [8][8];//Initializing a two-dimensional Array represent the ChessBoard class.
    }
    /**
     * 
     * This is method IsPieceAt return true or false when compared to rows and columns if the rows or cols
     * equal to rows and columns
     * 
     */
     public boolean isPieceAt(int row, int col)
    {   
        
        if (chessboard[row][col]==null){//rows and cols are compared are true 
            return false;//return false
        }else{
        return true;//otherwise return true
        }
    }
    
    /**
     * This is method placePieceAt changes rows and columns to row and columnsentered by the user
     * placePieceAt should place the given knight on your ChessBoard at the given location 
     * If the user attempts to add a 
     * piece to a location where one already exists, placePieceAt should overwrite the old piece with the new one.
     * 
     */public void  placePieceAt (ChessPiece piece, ChessLocation location)
    {  chessboard[location.GetRow()][location.GetCol()]=piece;//get the locaton from chessLocation getrow and col method and place the peice in 2d array
        piece.setLocation(location);// Set the location of the piece at loation
    }

    /**
     * This is method getPieceAt returns the piece at the location asked by the 
     * 2D arrays using the getrow method from the location
     * 
     */
    public ChessPiece getPieceAt(ChessLocation location)
    {//This method should return the piece at the specified location
        return chessboard[location.GetRow()][location.GetCol()];// return statement for the chessboard at the location
    }
    /**
     * The method removePiece removes whatever knight 
     * is at the specified row and column from your ChessBoard data structure,
     * setting the index at that row and column to be null.
     * This method is used to remove a piece on the board from the original 
     * location after a move.
     * 
     */
    public void removePiece(ChessLocation location)
    {
        chessboard [location.GetRow()][location.GetCol()]=null;//remove the piece from the location of row and col
    }
    /**
     * This Method PrintChessBoard draws out your ChessBoard
     */public void PrintChessBoard()
    {
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if (chessboard [i][j] == null){
                    System.out.print(" - ");
                }
                else{
                    System.out.print(" "+this.getPieceAt(new ChessLocation(i,j)).getId()+" ");//If I j contains value then return K to be shown on the board
                }
            }
             System.out.println("");
        }
    }
    /**
     *  Getter Method for return the chessboard when asked for it, with the type of ChessPiece[][] 2D array.
     *  
     */public ChessPiece[][] getBoard()
    {
        return chessboard;//return the 8x8 board
    }
}
