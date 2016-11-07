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
    public SetPivotButton()
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 80 ) ; 
    }

    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
            this.setPivot();
        }
    }    
    private void setPivot() {
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        List<Pivot> p = world.getObjects(Pivot.class);
        for (Pivot i: p) {
              world.removeObject(i);
          }
       
        List<MinionShort> small = world.getObjects(MinionShort.class);
        
        int start = small.get(0).getLocationX();
        int startindex = small.get(0).getIndex();
        
        List<MinionTall> big = world.getObjects(MinionTall.class);
        int end = big.get(0).getLocationX();
        int endindex = big.get(0).getIndex();
        
        int mid = start + (end - start)/2;
        
        Pivot pivot = new Pivot();
        world.addObject(pivot, mid, 200);
        world.setPivotIndex();
        
        //int p = world.getPivotX();
        //pivot.get(0).moveTo(p);
    }
}
