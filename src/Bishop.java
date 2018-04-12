import java.util.ArrayList;
/**
 *@Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 */
public class Bishop extends ChessPiece
{
    
    /**
     *
     *- call the constructor of the super class with appropriate arguments
     *- check for the player and set the mark accordingly (player can either be “Player1” or “Player2”
     *- set firstMove to false
     */
    public Bishop(String owner, ChessLocation initiallocation, chessGame game,char id)
    
    {
        super(owner,initiallocation,game,id);
    }

   
    /**
     *Check if the Piece Belongs to Player 1 else goes into else loop for player 2 check 
     *check legality of the move
     *o if okay, call the moveTo of the super class, otherwise output an error message
     *(Just remember we are not capturing any pieces right now, so no need to check for a diagonal capture)
     *Also remember to check for the first move exception
     *This method also checks if the Piece that is capturing the other piece does not have to be of the same player
     *it will pop up an error
     */
    public boolean moveto(ChessLocation newLocation)
    {
        if((Math.abs(super.location.GetRow()-newLocation.GetRow())==Math.abs(super.location.GetCol()-newLocation.GetCol()))){  //If the move is legal, get ChessBoard from the object game, 
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
        
        }else{
        System.out.println("Illegal Move");
        return false;
        }
        return true;
    }
    /**
     *
     * Each of these classes will override this method from the superclass to
     * update the threateningLocations array 
     * (threateningLocations array is in the superclass ChessPiece) based on what piece it is.
     */
    public void updateThreateningLocation(ChessLocation newLocation){
    threats = new ArrayList <ChessLocation>();
    threats = new ArrayList<ChessLocation>();
        int x = location.GetCol()+1;
        int y = location.GetRow()+1;
        
        while(checkLineOfSight(location, new ChessLocation(y,x))){
            threats.add(new ChessLocation(y,x));
            x++;
            y++;
            if (x > 7 || x <0 || y >7 || y <0){
                break;
            }
        }
       
        x = location.GetCol()-1;
        y = location.GetRow()+1;
        while(checkLineOfSight(location, new ChessLocation(y,x))){
            threats.add(new ChessLocation(y,x));
            x--;
            y++;
             if (x > 7 || x <0 || y >7 || y <0){
                break;
            }
        }
        
        x = location.GetCol()+1;
        y = location.GetRow()-1;
        while(checkLineOfSight(location, new ChessLocation(y,x))){
            threats.add(new ChessLocation(y,x));
            x++;
            y--;
             if (x > 7 || x <0 || y >7 || y <0){
                break;
            }
        }
        
        x = location.GetCol()-1;
        y = location.GetRow()-1;
        while(checkLineOfSight(location, new ChessLocation(y,x))){
            threats.add(new ChessLocation(y,x));
            x--;
            y--;
             if (x > 7 || x <0 || y >7 || y <0){
                break;
            }
        }
    
    
}
}
