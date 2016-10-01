import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class five here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class five extends Number
{
    /**
     * Act - do whatever the five wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public five()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ; 
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            this.five();
        } // Add your action code here.
    }    
    public void five() {
         Number a = new Number();
         int[] list = a.pickRandomNum(5);
         QuickSortWorld world = (QuickSortWorld)this.getWorld();
         world.drawList(list);
    }
}
