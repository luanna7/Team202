import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pivot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pivot extends Minions
{
    /**
     * Act - do whatever the Pivot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Pivot()
    {
        GreenfootImage image = getImage() ;
        image.scale( 30, 30 ) ; 
    }
    /*public void setPivot() {
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        int startX = world.getStartX();
        int endX = world.getEndX();
        int middle = startX + (endX - startX) / 2;
        this.moveTo(middle);
    }*/
    
    public void act() 
    {
        // Add your action code here.
    }  
    
}
