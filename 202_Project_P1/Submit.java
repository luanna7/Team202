import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class submit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Submit extends StepButton
{
    /**
     * Act - do whatever the submit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Submit()
    {
        GreenfootImage image = getImage() ;
        image.scale( 100, 100 ) ; 
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
           QuickSortWorld world = (QuickSortWorld)this.getWorld();
           System.currentTimeMillis();
           long timeEnd = System.currentTimeMillis();
           long timeBegan = world.getTimeBegan();
           long secondsPassed = (timeEnd - timeBegan) /1000;
           int num = world.getNumber();
           String name = world.getPlayerName();
           System.out.println("time:" + secondsPassed);
           System.out.println("digits:" + num);
           System.out.println("name:" + name);
        } // Add your action code here.
    }    
    public void submitMethod() {
         //world.drawList(list);
         int i = 3;
    }    
}
