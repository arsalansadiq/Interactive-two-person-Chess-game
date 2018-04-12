    /**
 * 
 * 
 * @Student Name (Arsalan Sadiq) 
 * @Date (11/27/16)
 * @Student Number(101020133)
 * 
 * ChessGame class allows you to store different chess piece at different locations
 * 
 */
public class chessGame
{
    public ChessBoard board;//Chess board to play the game on
    public String player1;//Declaring the player1 with type string
    public String player2;//Declaring the player2 with type string
    public Knight N1;//Declaring the N1 with type Knight
    public Knight N2;//Declaring the N2 with type Knight
    public King K;//Declaring the K with type King
    public Queen Q;//Declaring the Q with type Queen
    public Bishop B1;//Declaring the B1 with type Bishop
    public Bishop B2;//Declaring the B2 with type Bishop
    public Rook R1;//Declaring the R1 with type Rook
    public Rook R2;//Declaring the R2 with type Rook
    public Pawn P1;//Declaring the P1 with type Pawn
    public Pawn P2;//Declaring the P2 with type Pawn
    public Pawn P3;//Declaring the P3 with type Pawn
    public Pawn P4;//Declaring the P4 with type Pawn
    public Pawn P5;//Declaring the P5 with type Pawn
    public Pawn P6;//Declaring the P6 with type Pawn
    public Pawn P7;//Declaring the P7 with type Pawn
    public Pawn P8;//Declaring the P8 with type Pawn
    
    //player 2
    public Knight n1;//Declaring the n1 with type Knight
    public Knight n2;//Declaring the n2 with type Knight
    public King k;//Declaring the k with type King
    public Queen q;//Declaring the q with type Queen
    public Bishop b1;//Declaring the b1 with type Bishop
    public Bishop b2;//Declaring the b2 with type Bishop
    public Rook r1;//Declaring the r1 with type Rook
    public Rook r2;//Declaring the r2 with type Rook
    public Pawn p1;//Declaring the p1 with type Pawn
    public Pawn p2;//Declaring the p2 with type Pawn
    public Pawn p3;//Declaring the p3 with type Pawn
    public Pawn p4;//Declaring the p4 with type Pawn
    public Pawn p5;//Declaring the p5 with type Pawn
    public Pawn p6;//Declaring the p6 with type Pawn
    public Pawn p7;//Declaring the p7 with type Pawn
    public Pawn p8;//Declaring the p8 with type Pawn
    

    /**
     * Constructor for objects of class chessGame that Places 
     */
    public chessGame(String player1,String player2)
    {
        // initialise instance variables
        
       board= new ChessBoard();//Initialize the chess board
       
       this.player1 = player1;
       this.player2 = player2;
        
       N1=new Knight("Player1", new ChessLocation(0,1),this,'N');//Initialize a new knight and add it to your board (hint: this all can be done 
       board.placePieceAt(N1,new ChessLocation(0,1)); //in one statement by calling the Knight constructor and using the “this” keyword)
       
       
       N2=new Knight("Player1", new ChessLocation(0,6),this,'N');//Initialize a new knight and add it to your board (hint: this all can be done
       board.placePieceAt(N2,new ChessLocation(0,6));//in one statement by calling the Knight constructor and using the “this” keyword)
        
       K=new King("Player1",new ChessLocation(0,4),this,'K');//Initialize a new King and add it to your board (hint: this all can be done
       board.placePieceAt(K,new ChessLocation(0,4));//in one statement by calling the King constructor and using the “this” keyword)
       
       Q=new Queen("Player1",new ChessLocation(0,3),this,'Q');//Initialize a new Queen and add it to your board (hint: this all can be done
       board.placePieceAt(Q,new ChessLocation(0,3));//in one statement by calling the Queen constructor and using the “this” keyword)
       
       B1=new Bishop("Player1",new ChessLocation(0,2),this,'B');//Initialize a new Bishop and add it to your board (hint: this all can be done
       board.placePieceAt(B1,new ChessLocation(0,2));//in one statement by calling the Bishop constructor and using the “this” keyword)
       
       B2=new Bishop("Player1",new ChessLocation(0,5),this,'B');//Initialize a new Bishop and add it to your board (hint: this all can be done
       board.placePieceAt(B2,new ChessLocation(0,5));//in one statement by calling the Bishop constructor and using the “this” keyword)
       
       R1=new Rook("Player1",new ChessLocation(0,0),this,'R');//Initialize a new Rook and add it to your board (hint: this all can be done
       board.placePieceAt(R1,new ChessLocation(0,0));//in one statement by calling the Rook constructor and using the “this” keyword)
       
       R2=new Rook("Player1",new ChessLocation(0,7),this,'R');//Initialize a new Rook and add it to your board (hint: this all can be done
       board.placePieceAt(R2,new ChessLocation(0,7));//in one statement by calling the Rook constructor and using the “this” keyword)
       
       P1=new Pawn("Player1",new ChessLocation(1,0),this,'1');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(P1,new ChessLocation(1,0));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       P2=new Pawn("Player1",new ChessLocation(1,1),this,'P');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(P2,new ChessLocation(1,1));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       P3=new Pawn("Player1",new ChessLocation(1,2),this,'P');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(P3,new ChessLocation(1,2));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       P4=new Pawn("Player1",new ChessLocation(1,3),this,'P');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(P4,new ChessLocation(1,3));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       P5=new Pawn("Player1",new ChessLocation(1,4),this,'P');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(P5,new ChessLocation(1,4));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       P6=new Pawn("Player1",new ChessLocation(1,5),this,'P');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(P6,new ChessLocation(1,5));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       P7=new Pawn("Player1",new ChessLocation(1,6),this,'P');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(P7,new ChessLocation(1,6));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       P8=new Pawn("Player1",new ChessLocation(1,7),this,'P');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(P8,new ChessLocation(1,7));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       //player2
       
       n1=new Knight("Player2", new ChessLocation(7,1),this,'n');//Initialize a new knight and add it to your board (hint: this all can be done 
       board.placePieceAt(n1,new ChessLocation(7,1)); //in one statement by calling the Knight constructor and using the “this” keyword)
       
       
       n2=new Knight("Player2", new ChessLocation(7,6),this,'n');//Initialize a new knight and add it to your board (hint: this all can be done
       board.placePieceAt(n2,new ChessLocation(7,6));//in one statement by calling the Knight constructor and using the “this” keyword)
        
       k=new King("Player2",new ChessLocation(7,4),this,'k');//Initialize a new King and add it to your board (hint: this all can be done
       board.placePieceAt(k,new ChessLocation(7,4));//in one statement by calling the King constructor and using the “this” keyword)
       
       q=new Queen("Player2",new ChessLocation(7,3),this,'q');//Initialize a new Queen and add it to your board (hint: this all can be done
       board.placePieceAt(q,new ChessLocation(7,3));//in one statement by calling the Queen constructor and using the “this” keyword)
       
       b1=new Bishop("Player2",new ChessLocation(7,2),this,'b');//Initialize a new Bishop and add it to your board (hint: this all can be done
       board.placePieceAt(b1,new ChessLocation(7,2));//in one statement by calling the Bishop constructor and using the “this” keyword)
       
       b2=new Bishop("Player2",new ChessLocation(7,5),this,'b');//Initialize a new Bishop and add it to your board (hint: this all can be done
       board.placePieceAt(b2,new ChessLocation(7,5));//in one statement by calling the Bishop constructor and using the “this” keyword)
       
       r1=new Rook("Player2",new ChessLocation(7,0),this,'r');//Initialize a new Rook and add it to your board (hint: this all can be done
       board.placePieceAt(r1,new ChessLocation(7,0));//in one statement by calling the Rook constructor and using the “this” keyword)
       
       r2=new Rook("Player2",new ChessLocation(7,7),this,'r');//Initialize a new Rook and add it to your board (hint: this all can be done
       board.placePieceAt(r2,new ChessLocation(7,7));//in one statement by calling the Rook constructor and using the “this” keyword)
       
       p1=new Pawn("Player2",new ChessLocation(6,0),this,'p');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(p1,new ChessLocation(6,0));//in one statement by calling the Pawn constructor and using the “this” keyword)    
       
       p2=new Pawn("Player2",new ChessLocation(6,1),this,'p');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(p2,new ChessLocation(6,1));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       p3=new Pawn("Player2",new ChessLocation(6,2),this,'p');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(p3,new ChessLocation(6,2));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       p4=new Pawn("Player2",new ChessLocation(6,3),this,'p');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(p4,new ChessLocation(6,3));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       p5=new Pawn("Player2",new ChessLocation(6,4),this,'p');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(p5,new ChessLocation(6,4));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       p6=new Pawn("Player2",new ChessLocation(6,5),this,'p');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(p6,new ChessLocation(6,5));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       p7=new Pawn("Player2",new ChessLocation(6,6),this,'p');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(p7,new ChessLocation(6,6));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       p8=new Pawn("Player2",new ChessLocation(6,7),this,'p');//Initialize a new Pawn and add it to your board (hint: this all can be done
       board.placePieceAt(p8,new ChessLocation(6,7));//in one statement by calling the Pawn constructor and using the “this” keyword)
       
       
    }
    /**
     * Getter Method for return the chessboard when asked for it
     */
    public ChessBoard getBoard()
    {
        return board;//return statement for the board
    }
    
}
