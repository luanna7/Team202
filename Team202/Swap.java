import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Swap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swap extends StepButton
{
    /**
     * Act - do whatever the Swap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Swap()
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 80 ) ; 
    }
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
            this.swap();
        }
    }
    private void swap() {
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        List<MinionShort> mshort = world.getObjects(MinionShort.class);
        List<MinionTall> mtall = world.getObjects(MinionTall.class);
        int right = mtall.get(0).getIndex();
        int left = mshort.get(0).getIndex();
        int[] list =  world.list;
        int tmp = list[right];
        list[right] = list[left];
        list[left] = tmp;
        world.updateList();
    }
}
