import static java.lang.Math.abs;
import java.lang.NullPointerException;
import java.util.ArrayList;
/**
 * 
 * @Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 * 
 * Every knight needs to know where it is and what is its color 
 * (who is the owner – black or white?).
 */
public class Knight extends ChessPiece
{
// no instance variables 

/**
     * - call the constructor of the super class with appropriate arguments
     * - check for the player and set the mark accordingly (player can either be “Player1” or “Player2”
     */
    public Knight(String owner, ChessLocation initiallocation, chessGame game,char id)
    
    {
       //Initialize the owner, location and the game
       //Place user on the chessboard with the initialLocation
       super(owner,initiallocation,game,id);
       
    }

    /**
     *This MoveTo method allows you to Move and place piece at a certain location
     *- check legality of the move
     *o if okay, call the moveTo of the super class, otherwise output an error message
     *
     *Check if the Piece Belongs to Player 1 else goes into else loop for player 2 check 
     *check legality of the move
     *o if okay, call the moveTo of the super class, otherwise output an error message
     *(Just remember we are not capturing any pieces right now, so no need to check for a diagonal capture)
     *Also remember to check for the first move exception
     *This method also checks if the Piece that is capturing the other piece does not have to be of the same player
     *it will pop up an error
     *  
     */
    public boolean moveto(ChessLocation newLocation)
    {//Check the legality of the move
        if( (Math.abs(super.location.GetRow()-newLocation.GetRow())==2 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1)|| (Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==2))
        {  //If the move is legal, get ChessBoard from the object game, 
            if(game.board.isPieceAt(newLocation.GetRow(),newLocation.GetCol()) == false){
           game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
            updateThreateningLocation(location);
            
           }else if(game.board.getPieceAt(location).getOwner() != game.board.getPieceAt(newLocation).getOwner() ){
                super.game.board.removePiece(location);
                location=newLocation;
                game.board.placePieceAt(this,location);  
                updateThreateningLocation(location);
            }else if(game.board.getPieceAt(location).getOwner() == game.board.getPieceAt(newLocation).getOwner()  ) {
            System.out.println("Cannot Take own piece");
            return false;
          }
        }
        else {
          System.out.println("Illegal Move");
          return false;
    }
    return true;
}         
/**
*  Each of these classes will override this method from the superclass to
* update the threateningLocations array 
* (threateningLocations array is in the superclass ChessPiece) based on what piece it is.
 */public void updateThreateningLocation(ChessLocation newLocation){
    threats = new ArrayList<ChessLocation>();
        int y = location.GetCol();
        int x = location.GetRow();

        threats.add(new ChessLocation(x+2, y+1));

        threats.add(new ChessLocation(x+1, y+2));

        threats.add(new ChessLocation(x-2, y-1));

        threats.add(new ChessLocation(x-1, y-2));

        threats.add(new ChessLocation(x+2, y-1));

        threats.add(new ChessLocation(x-2, y+1));

        threats.add(new ChessLocation(x+1, y-2));

        threats.add(new ChessLocation(x-1, y-2));
    
    
}
    }