import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class FindBig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindBig extends StepButton
{
    /**
     * Act - do whatever the FindBig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FindBig()
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 80 ) ; 
    }
    
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
            this.findBig();
        }
    }
    private void findBig() {
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        List<MinionTall> minionTall = world.getObjects(MinionTall.class);
        int start = world.getStartIndex();
        int pivot = world.getPivot();
        int[] list = world.list;
        int tallIndex = minionTall.get(0).getIndex();
        while (tallIndex >= start && list[tallIndex] > pivot) {
            int location = minionTall.get(0).getLocationX();
            System.out.println("new Location: " + location);
            location -= 30;
            System.out.println("new Location: " + location);
            minionTall.get(0).moveTo(location);
            minionTall.get(0).setLocationX(location);
            tallIndex--;
            minionTall.get(0).setIndex(tallIndex);
            Greenfoot.delay(20);
        }
    }
}
