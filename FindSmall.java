import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
     public FindSmall()
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 80 ) ; 
    }
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
            this.findSmall();
        }
    }
    private void findSmall() {
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        List<MinionShort> minionShort = world.getObjects(MinionShort.class);
        int end = world.getEndIndex();
        int pivot = world.getPivot();
        int[] list = world.list;
        int shortIndex = minionShort.get(0).getIndex();
        while (shortIndex <= end && list[shortIndex] < pivot) {
            int location = minionShort.get(0).getLocationX();
            System.out.println("new Location: " + location);
            location += 30;
            System.out.println("new Location: " + location);
            minionShort.get(0).moveTo(location);
            minionShort.get(0).setLocationX(location);
            shortIndex++;
            minionShort.get(0).setIndex(shortIndex);
            Greenfoot.delay(10);
        }
    }
    
}
