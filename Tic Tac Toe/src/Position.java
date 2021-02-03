/**
 * 
 * @author salterd
 * @version 1.0.0 2020-03-04 Initial implementation
 *
 */
public class Position
    {
    Shape shape ;    
    boolean filled ;
    
    /**
     * Creates an empty position
     */
    public Position()
        {
        this.shape = null ;
        this.filled = false ;
        
        }
    
    /**
     * Fills the position with a shape
     */
    public int fillPosition( Shape shape )
        {
        if( !this.filled )
            {
            this.shape = shape ;
            this.filled = true ;
            return 1 ;
            }
        
        return 0 ;
        }
    
    /**
    * Clears the position for the next game 
    */
    public void clearPosition()
        {
        this.shape = null ;
        this.filled = false ;
        }

    }
