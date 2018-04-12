import java.util.ArrayList;
/**
 * * @Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 *
 */
public class Pawn extends ChessPiece
{
    
    private boolean ChkFirst;//Boolean checkFirst variable to check if Pawn is at the location which is its first
    private boolean move;//Boolean varable to return true or false for moveto method for awn when a piece is replaced

/**
     *
     *- call the constructor of the super class with appropriate arguments
     *- check for the player and set the mark accordingly (player can either be “Player1” or “Player2”
     *- set firstMove to false
     */
    public Pawn(String owner, ChessLocation initiallocation, chessGame game,char id)
    
    {
        super(owner,initiallocation,game,id);
    
      
    }
/**
     * Method to check if the Pawn is at the inital location or no
     */public boolean CheckFirst(ChessLocation Location){
    if(super.owner.equals("Player1")){
        if (location.GetRow() ==1){
        ChkFirst= true;
        }else{
         ChkFirst= false;   
    
        }
    }
    if (super.owner.equals("Player2")){
       if (location.GetRow() ==6){
        ChkFirst= true;
        }else{
         ChkFirst= false;
        }
    }
    return ChkFirst;
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
        // put your code here
       
        if(super.owner.equals("Player1")){
            
          if(this.CheckFirst(new ChessLocation(super.location.GetRow(),super.location.GetCol()))==false && checkLineOfSight(location,newLocation)== true){
                if((newLocation.GetRow()-super.location.GetRow())==1 && (newLocation.GetCol()-super.location.GetCol())==0 ){
                    super.game.board.removePiece(location);
                    location=newLocation;
                    game.board.placePieceAt(this,location);
                    move = true;
                    updateThreateningLocation(location);
                }
            }
          if(this.CheckFirst(new ChessLocation(super.location.GetRow(),super.location.GetCol()))==true){
                if(((newLocation.GetRow()-super.location.GetRow())==1 || (newLocation.GetRow()-super.location.GetRow())==2) && ((newLocation.GetCol()-super.location.GetCol())==0) && checkLineOfSight(location,newLocation)== true ){
                    super.game.board.removePiece(location);
                    location=newLocation;
                    game.board.placePieceAt(this,location);
                    move = true;
                    updateThreateningLocation(location);
                }
            }
          
          
           if(super.game.board.getPieceAt(location).getOwner() != super.game.board.getPieceAt(newLocation).getOwner() && Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1){
                super.game.board.removePiece(location);
                location=newLocation;
                game.board.placePieceAt(this,location);  
                move = true;
                updateThreateningLocation(location);
            }
           if(game.board.getPieceAt(location).getOwner() == game.board.getPieceAt(newLocation).getOwner() && Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1) {
            System.out.println("Cannot Take own piece");//same player, then cannot capture
            move = false;
          }
       
     }
    
    
     if(super.owner.equals("Player2")){
            
          if(this.CheckFirst(new ChessLocation(super.location.GetRow(),super.location.GetCol()))==false && checkLineOfSight(location,newLocation)== true){
                if((newLocation.GetRow()-super.location.GetRow())==-1 && (newLocation.GetCol()-super.location.GetCol())==0 ){
                    super.game.board.removePiece(location);
                    location=newLocation;
                    game.board.placePieceAt(this,location);
                    move = true;
                    updateThreateningLocation(location);
                }
            }
          if(this.CheckFirst(new ChessLocation(super.location.GetRow(),super.location.GetCol()))==true){
                if(((newLocation.GetRow()-super.location.GetRow())==-1 || (newLocation.GetRow()-super.location.GetRow())==-2) && ((newLocation.GetCol()-super.location.GetCol())==0) && checkLineOfSight(location,newLocation)== true ){
                    super.game.board.removePiece(location);
                    location=newLocation;
                    game.board.placePieceAt(this,location);
                    move = true;
                    updateThreateningLocation(location);
                }
            }
          if(game.board.getPieceAt(location).getOwner() != game.board.getPieceAt(newLocation).getOwner() && Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1){
                super.game.board.removePiece(location);
                location=newLocation;
                game.board.placePieceAt(this,location);  
                move = true;
                updateThreateningLocation(location);
            }
           if(game.board.getPieceAt(location).getOwner() == game.board.getPieceAt(newLocation).getOwner() && Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1) {
            System.out.println("Cannot Take own piece");//same player, then cannot capture
            move = false;
          }
        
     }
     return move;
}
/**
 *  Each of these classes will override this method from the superclass to
 * update the threateningLocations array 
* (threateningLocations array is in the superclass ChessPiece) based on what piece it is.
 */public void updateThreateningLocation(ChessLocation newLocation){
    threats = new ArrayList <ChessLocation>();
    
        int y = location.GetCol();
        int x = location.GetRow();
        
        if (checkLineOfSight(new ChessLocation(x,y), new ChessLocation(x+1, y-1))){
            threats.add(new ChessLocation(x+1, y-1));
        }
        
        if (checkLineOfSight(new ChessLocation(x,y), new ChessLocation(x+1, y+1))){
            threats.add(new ChessLocation(x+1, y+1));
        }
    
    
}
}
