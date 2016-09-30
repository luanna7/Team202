import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PartitionButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindSmall extends StepButton
{
    /**
     * Act - do whatever the PartitionButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
            this.findSmall();
        }
    }
    private void findSmall() {
        
    }
    
}
