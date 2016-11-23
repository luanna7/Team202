/**
 * Write a description of class GameStateManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStateManager  
{
    // instance variables - replace the example below with your own
    private static GameStateManager instance;
    private int state;
    
    /**
     * Constructor for objects of class GameStateManager
     */
    public GameStateManager()
    {
        this.state = 20;
    }
    
    public static GameStateManager getInstance()
    {
        if (instance == null)
        {
            instance = new GameStateManager();
        }
        return instance;
    }
    
    public int getState()
    {
        return this.state;
    }
    
    public void setState(int s)
    {
        this.state = s;
    }
}
