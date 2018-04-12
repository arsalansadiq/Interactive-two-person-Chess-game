import java.util.ArrayList;
/**
 * @Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 * 
 * 
 * ChessPiece contains the moveto method as a SuperClass and Contains the LineOfSight method which checks the condition of the moving method
 */
public abstract class ChessPiece implements ChessPieceInterface// abstact class created with implentation of chesspieceInterace
{
    // instance variables - replace the example below with your own
    protected chessGame game;//To determine which game does this piece belong to
    protected String owner;//Ideally Chess is a 2 person game identified by colours black and white. 
    //In this assignment, even though you do not have a 2nd person playing, I still want you to identify the owner of the piece (i.e. player = “player1” or “player2”). Keep it as “player1” for all your pieces
    protected ChessLocation location;//Current location of the chess piece
    protected char id;//This identifies the piece on your board when you are displaying your chess board
    public ArrayList <ChessLocation> threats;// New ArrayList for threats to add into threatening locations

   /**
     * - Initialize the owner, and the game to the given variables
     * - Initialize the location to null
     * - Place yourself on the chessboard with the initialLocation (hint: you need to get the chessboard reference from the game object passed)
     * 
     */
    public ChessPiece(String owner, ChessLocation initialLocation,chessGame game,char id)
    {
       this.owner=owner;
       this.game=game;
       location=initialLocation;
       this.id=id;
       threats = new ArrayList <ChessLocation>();
       
    }
   /**
     * Method Setlocation stores the value of the location with the newLocation
     */
   public void setLocation (ChessLocation newLocation)
    {
        this.location=newLocation;// the newLocation gets stored in the location
    }
   /**
     * getId is a getter method which returns the id of the piece
     */
   public char getId()
    {
    return id;// id of the piece gets returned
    }

   /**
     * - Check the legality of the move
     * - If the move is legal, get ChessBoard from the object game, remove that piece from the old location and place that piece at the newLocation
     * - make sure the pieces can not be moved to indexes outside of the bounds of the chessboard
     */
    public boolean moveto(ChessLocation newLocation)
    {
        System.out.println(newLocation);
        System.out.println(newLocation.GetRow());
        
        if(newLocation.GetRow()<0 || newLocation.GetRow()>7 ){
            System.out.println("Out of bound location entered");//if the row is out of bounds then print error
            return false;
        }else if(newLocation.GetCol()<0 || newLocation.GetCol()>7 ){
            System.out.println("Out of bound location entered");//if the col is out of bounds then print error
            return false;
        }else {
            game.board.removePiece(location);//remove the piece from the location
            game.board.placePieceAt(this,newLocation);//place the place at the newlocation
            return true;
        }
        //return x + y;
    }
    /**
     * - this is a complex function
     * - it should return if there is a line of sight from the position start to the position end. This means there are no obstructions from start to end i.e. there are no pieces between start to end.
     * - Between start to end can means:
     * o you should check horizontally,
     * o you should check vertically and
     * o you should diagonally (perfect diagonal) with a slope of either 1 or -1
     */
    protected boolean checkLineOfSight(ChessLocation start, ChessLocation end){
    boolean freeMove = true;
    int y= end.GetRow() - start.GetRow();
    int x = end.GetCol() - start.GetCol();
    if (x < 0 && y == 0){
     for (int i= start.GetCol() - 1; i<= end.GetCol(); i--){
        if(game.getBoard().getBoard()[start.GetRow()][i] != null){
            freeMove = false;
        }
        }
    }
    else if(x>0 && y==0){
    for (int i= start.GetCol() + 1; i<= end.GetCol(); i++){
        if(game.getBoard().getBoard()[start.GetRow()][i] != null){
            freeMove = false;
        }
        }
    }
    else if(y>0 && x==0){
    for (int i= start.GetRow() + 1; i<= end.GetRow(); i++){
        if(game.getBoard().getBoard()[i][start.GetCol()] != null){
            freeMove = false;
        }
        }
    }
    else if(y<0 && x==0){
    for (int i= start.GetRow() - 1; i<= end.GetRow(); i--){
        if(game.getBoard().getBoard()[i][start.GetCol()] != null){
            freeMove = false;
        }
        }
    }
    else if(y==x && y>0){
    for (int i= start.GetRow() + 1, j = start.GetCol() +1 ; i< end.GetRow(); i++,j++){
        if(game.getBoard().getBoard()[i][j] != null){
            freeMove = false;
        }
        }
    }
    else if(y==x && y>0 && x<0){
    for (int i= start.GetRow() -1 , j = start.GetCol() - 1; i> end.GetRow(); i--, j--){
        if(game.getBoard().getBoard()[i][j] != null){
            freeMove = false;
        }
        }
    }
    else if(-y==x && y<0 && x<0){
    for (int i= start.GetRow() - 1, j = start.GetCol() +1; i> end.GetRow(); i--, j++){
        if(game.getBoard().getBoard()[i][j] != null){
            freeMove = false;
        }
        }
    }
    else if(-x==y && x< 0 && y>0){
    for (int i= start.GetRow() + 1, j = start.GetCol() -1; i< end.GetRow(); i++, j--){
        if(game.getBoard().getBoard()[i][j] != null){
            freeMove = false;
        }
        }
    }
    if(freeMove == false){
       System.out.println();
       System.out.println("The Move is invalid due to a piece blocking it!");
    }
    System.out.println();
    return freeMove;   
   }
   
   /**
    * GetOwner Method to return the owner of which a ChessPiece belongs to either Player1 or Player 2
    
//
    *
    */public String getOwner(){//getOwner getter method
       return owner;
    }
   /**
    * * There should be no implementation for this in the super class. 
    *Each of the sub classes will override 
    * this method to update the threateningLocations array based on what piece it is.
    */public abstract void updateThreateningLocation(ChessLocation newLocation);
}

