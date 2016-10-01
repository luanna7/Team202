import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ten extends Number
{
    /**
     * Act - do whatever the ten wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ten()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ; 
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            this.ten();
        } // Add your action code here.
    }    
    public void ten() {
         Number a = new Number();
         int[] list = a.pickRandomNum(10);
         QuickSortWorld world = (QuickSortWorld)this.getWorld();
         world.drawList(list);
    }   
}
