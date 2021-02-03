/**
 * 
 *
 * @author salterd
 * @version 1.0.0 2020-03-04 Initial implementation
 *
 */
public class Board
    {

    Position[] spots ;
    int turn ;
    
    /**
     * 
     * Instantiates a new, empty board with none of the spaces contained, with the turn set to 1 (x)
     * spots initialized in order tl,tm,tr,ml,mm,mr,bl,bm,br
     * 
     */
    public Board()
        {
        
        this.spots = new Position[9] ;
        for(int i = 0; i < 9; i++)
            {
            this.spots[i] = new Position() ;
            }
          
        this.turn = 1 ;
        
        }
    
    public void resetGame()
        {
        for(Position pos : spots)
            {
            pos.clearPosition();
            }
        }
    
    public static void main(String[] args)
        {
        
        Board game = new Board() ;
        while(true)
            {
            
            }
    
        }
    
    }
