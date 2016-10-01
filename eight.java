import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eight extends Number
{
    /**
     * Act - do whatever the eight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public eight()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ; 
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            this.eight();
        } // Add your action code here.
    }    
    public void eight() {
         Number a = new Number();
         int[] list = a.pickRandomNum(8);
         QuickSortWorld world = (QuickSortWorld)this.getWorld();
         world.drawList(list);
    }
}
