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
            QuickSortWorld world = (QuickSortWorld)this.getWorld();
            // GameStateManager gameStateManager = world.getGameStateManager();
            GameStateManager gameStateManager = GameStateManager.getInstance();
            System.out.println("Number: " + gameStateManager.getState());
            gameStateManager.setState(50);
        }
    }    
    private void setPivot() {
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        List<Pivot> p = world.getObjects(Pivot.class);
        
        for (Pivot i: p) {
              world.removeObject(i);
          }
        
        Pivot pivot = new Pivot();
        world.addObject(pivot, world.getEndX(), 250);
        world.setPivotIndex();
        world.setPivot();
        world.setPivotX();
    }
}
