import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class SetPivotButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SetPivotButton extends StepButton
{
    /**
     * Act - do whatever the SetPivotButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
            this.setPivot();
        }
    }    
    private void setPivot() {
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        List<Pivot> pivot = world.getObjects(Pivot.class);
        int p = world.getPivotX();
        
        pivot.get(0).moveTo(p);
    }
}
