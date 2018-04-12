import java.util.Scanner;
/**
 * @Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 * 
 * 
 * playGame contains the main method which runs the program
 */
public class playGame
{
    // instance variables - replace the example below with your own
   private ChessPiece piece;
   

    /**
     * Constructor for objects of class playGame
     */
    public playGame()
    {
        // initialise instance variables
        //no constructor
    }

    /**
     * This method contains the main void which contains the function to actually run the game
     * this allows you play the game , allows you to quit the game and allows you to reset the game
     * its also allows you automatically switch between turns
     * 
     *  
     */
    public static void main(String[] args)
    {
        // put your code here
        //display an initial menu on the screen describe what the program is about
        
        System.out.println("This is Game Of Chess");
        //initialize a new chessGame
        chessGame NewGame=new chessGame("Player1","Player2");
        int counter=0;//setup counter=0
        int Srow = 0; //inititalize the Srow that will be asked equal to 0
        int Scol= 0;//inititalize the Scol that will be asked equal to 0
        //retrieve and display the chessBoard from this initialized game
        NewGame.board.PrintChessBoard();
        //keep on asking the user to move the knight to a new location until “quit” is typed in
        //each time the knight is moved, display the board with the new location
            
        while(true)
        {    // Scans the next token of the input as an line
            System.out.println("Press Enter to Play the game OR Type 'quit' and Press Enter to end the game OR Type 'reset' and Press enter to restart the game");
            Scanner reader = new Scanner(System.in); // Reading from System.in
            String start = reader.nextLine();
            
            if(start.equals("quit")==true)
            {   System.out.println("Thank You for the playing the game.");
                System.exit(0);
            }else if(start.equals("reset")== true){//reset case.if user types reset
                System.out.println("The Game has been successfully reset.");//show the error message
                System.out.println();//gaps
                System.out.println();//gaps
                String[] arg ={};//setup a new argument of string
                playGame.main(arg);//and call the main function again with the new argument{}
                
            }else{
               
                if(counter %2 == 0){//player turns
                    System.out.println("Player 1's turn");
                
                do{
                System.out.println("Enter any value for source row from 0-7");
                Srow=reader.nextInt();
                while(Srow < 0 || Srow > 7 ){
                        System.out.println("Out of bound Values!. Enter any value for source row from 0-7: ");
                        Srow = reader.nextInt(); 
                    }
                System.out.println("Enter any value for source column from 0-7");
                Scol=reader.nextInt();
                while(Scol < 0 || Scol > 7){ 
                        System.out.println("Out of bound Values!. Enter any value for source column from 0-7");
                        Scol = reader.nextInt();
                    }    
                if(NewGame.getBoard().isPieceAt (Srow, Scol) == true && "Player1".equals(NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).getOwner())== false){
                        System.out.println();
                        System.out.println("Not Your turn");
                        System.out.println("Player 1's turn");
                    }
                if(NewGame.board.isPieceAt(Srow,Scol) == false){
                        System.out.println("Unfortunately,there is no piece at the location");
                    }
                    
                    
                }while(NewGame.getBoard().isPieceAt (Srow, Scol) == false || "Player1".equals(NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).getOwner())== false);
                System.out.println("Enter any value for destination row from 0-7");
                int Drow=reader.nextInt();
                while(Drow < 0 || Drow > 7){
                        System.out.println("Out of bound values!. Enter any value for destination row from 0-7");
                        Drow = reader.nextInt();
                    }
                System.out.println("Enter any value for destination column from 0-7");
                int Dcol=reader.nextInt();
                while(Dcol < 0 || Dcol > 7){
                        System.out.println("Out of bound values!. Enter any value for destination column from 0-7");
                        Dcol = reader.nextInt();
                    }
                    if(NewGame.getBoard().isPieceAt(Srow,Scol)==true){
                    if(  NewGame.getBoard().getPieceAt(new ChessLocation(Srow,Scol)).checkLineOfSight(new ChessLocation(Srow,Scol),new ChessLocation(Drow,Dcol))==true && NewGame.getBoard().isPieceAt(Drow,Dcol)== false){
                        NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).moveto(new ChessLocation(Drow,Dcol));
                        counter++;
                }else if(NewGame.getBoard().isPieceAt(Drow,Dcol)==true){
                     NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).moveto(new ChessLocation(Drow,Dcol));
                     counter++;
                }
                }else if(NewGame.getBoard().isPieceAt(Srow,Scol)==false){
                    System.out.println("Unfortunately,there is no piece at the location");
                }
                
               }else{
                    System.out.println("Player 2's turn");
                
                do{
                System.out.println("Enter any value for source row from 0-7");
                Srow=reader.nextInt();
                while(Srow < 0 || Srow > 7 ){
                        System.out.println("Out of bound Values!. Enter any value for source row from 0-7: ");
                        Srow = reader.nextInt(); 
                    }
                System.out.println("Enter any value for source column from 0-7");
                Scol=reader.nextInt();
                while(Scol < 0 || Scol > 7){ 
                        System.out.println("Out of bound Values!. Enter any value for source column from 0-7");
                        Scol = reader.nextInt();
                    }    
                if(NewGame.getBoard().isPieceAt (Srow, Scol) == true && "Player2".equals(NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).getOwner())== false){
                        System.out.println();
                        System.out.println("Not Your turn");
                        System.out.println("Player 2's turn");
                    }
                if(NewGame.board.isPieceAt(Srow,Scol) == false){
                    System.out.println("Unfortunately,there is no piece at the location");
                    }
                }while(NewGame.getBoard().isPieceAt (Srow, Scol) == false || "Player2".equals(NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).getOwner())== false);
                System.out.println("Enter any value for destination row from 0-7");
                int Drow=reader.nextInt();
                while(Drow < 0 || Drow > 7){
                        System.out.println("Out of bound values!. Enter any value for destination row from 0-7");
                        Drow = reader.nextInt();
                    }
                System.out.println("Enter any value for destination column from 0-7");
                int Dcol=reader.nextInt();
                while(Dcol < 0 || Dcol > 7){
                        System.out.println("Out of bound values!. Enter any value for destination column from 0-7");
                        Dcol = reader.nextInt();
                    }
                    if(NewGame.getBoard().isPieceAt(Srow,Scol)==true){
                    if(  NewGame.getBoard().getPieceAt(new ChessLocation(Srow,Scol)).checkLineOfSight(new ChessLocation(Srow,Scol),new ChessLocation(Drow,Dcol))==true && NewGame.getBoard().isPieceAt(Drow,Dcol)== false){
                        NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).moveto(new ChessLocation(Drow,Dcol));
                        counter++;
                }else if(NewGame.getBoard().isPieceAt(Drow,Dcol)==true){
                     NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).moveto(new ChessLocation(Drow,Dcol));
                     counter++;
                }
                }else if(NewGame.getBoard().isPieceAt(Srow,Scol)==false){
                    System.out.println("Unfortunately,there is no piece at the location");
                }
                }
                
                
                
                
                
                NewGame.board.PrintChessBoard();
            }
            
        }
        
    }
    
    }
