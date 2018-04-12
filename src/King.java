import java.util.ArrayList;
/**
 * @Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 */
    public class King extends ChessPiece
{
 /**
  * - call the constructor of the super class with appropriate arguments
  * - check for the player and set the mark accordingly (player can either be “Player1” or “Player2”
  */
public King(String owner, ChessLocation initiallocation, chessGame game,char id)
{ 
   //Place user on the chessboard with the initialLocation
   super(owner,initiallocation,game,id);
       
}
/**
 *  * M *This MoveTo method allows you to Move and place piece at a certain location
     *- check legality of the move
     *o if okay, call the moveTo of the super class, otherwise output an error message
     *
     *Check if the Piece Belongs to Player 1 else goes into else loop for player 2 check 
     *check legality of the move
     *o if okay, call the moveTo of the super class, otherwise output an error message
     *(Just remember we are not capturing any pieces right now, so no need to check for a diagonal capture)
     *Also remember to check for the first move exception
     *This method also checks if the Piece that is capturing the other piece does not have to be of the same player
     *it
 */public boolean moveto(ChessLocation newLocation)
   {//Check the legality of the move
       if( Math.abs(super.location.GetRow()-newLocation.GetRow())==0 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1)
        {  //If the move is legal, get ChessBoard from the object game, 
           //remove the king from the old location and place the king at the newLocation 
           if(game.board.isPieceAt(newLocation.GetRow(),newLocation.GetCol()) == false){
           game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
            
           }else if(game.board.getPieceAt(location).getOwner() != game.board.getPieceAt(newLocation).getOwner() ){
                super.game.board.removePiece(location);
                location=newLocation;
                game.board.placePieceAt(this,location);  
                
            }else if(game.board.getPieceAt(location).getOwner() == game.board.getPieceAt(newLocation).getOwner()  ) {
            System.out.println("Cannot Take own piece");
            return false;
          }
    }else if ( Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==0)
        {//If the move is legal, get ChessBoard from the object game, 
           //remove the king from the old location and place the king at the newLocation
           if(game.board.isPieceAt(newLocation.GetRow(),newLocation.GetCol()) == false){
           game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
            
           }else if(game.board.getPieceAt(location).getOwner() != game.board.getPieceAt(newLocation).getOwner() ){
                super.game.board.removePiece(location);
                location=newLocation;
                game.board.placePieceAt(this,location);  
                
            }else if(game.board.getPieceAt(location).getOwner() == game.board.getPieceAt(newLocation).getOwner()  ) {
            System.out.println("Cannot Take own piece");
            return false;
          }
    }else if ( Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1)
        {//If the move is legal, get ChessBoard from the object game, 
           //remove the king from the old location and place the king at the newLocation
           if(game.board.isPieceAt(newLocation.GetRow(),newLocation.GetCol()) == false){
           game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
            
           }else if(game.board.getPieceAt(location).getOwner() != game.board.getPieceAt(newLocation).getOwner() ){
                super.game.board.removePiece(location);
                location=newLocation;
                game.board.placePieceAt(this,location);  
                
            }else if(game.board.getPieceAt(location).getOwner() == game.board.getPieceAt(newLocation).getOwner()  ) {
            System.out.println("Cannot Take own piece");
            return false;
          }
    }else
        {//Error if the move is not legal
            System.out.println("Ilegal Move");
            return false;
        }
        return true;
    }
    /**
*Each of these classes will override this method from the superclass to
* update the threateningLocations array 
* (threateningLocations array is in the superclass ChessPiece) based on what piece it is.
     */public void updateThreateningLocation(ChessLocation newLocation){
    threats = new ArrayList<ChessLocation>();
        int x = location.GetCol();
        int y = location.GetRow();
        if (checkLineOfSight(new ChessLocation(y, x), new ChessLocation(y+1, x))){
            threats.add(new ChessLocation(y+1, x));
        }
        
        if (checkLineOfSight(new ChessLocation(y, x), new ChessLocation(y, x+1))){
            threats.add(new ChessLocation(y, x+1));
        }
        
        if (checkLineOfSight(new ChessLocation(y, x), new ChessLocation(y+1, x+1))){
            threats.add(new ChessLocation(y+1, x+1));
        }
        
        if (checkLineOfSight(new ChessLocation(y, x), new ChessLocation(y-1, x))){
            threats.add(new ChessLocation(y-1, x));
        }
        
        if (checkLineOfSight(new ChessLocation(y, x), new ChessLocation(y, x-1))){
            threats.add(new ChessLocation(y, x-1));
        }
        
        if (checkLineOfSight(new ChessLocation(y, x), new ChessLocation(y-1, x-1))){
            threats.add(new ChessLocation(y-1, x-1));
        }
        
        if (checkLineOfSight(new ChessLocation(y, x), new ChessLocation(y+1, x-1))){
            threats.add(new ChessLocation(y+1, x-1));
        }
        
        if (checkLineOfSight(new ChessLocation(y, x), new ChessLocation(y-1, x+1))){
            threats.add(new ChessLocation(y-1, x+1));
        }
    
    
}
}
