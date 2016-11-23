import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Done here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Done extends StepButton
{
    /**
     * Act - do whatever the Done wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Done()
    {
        GreenfootImage image = getImage() ;
        image.scale( 250, 80 ) ; 
    }
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
            GameStateManager gameStateManager = GameStateManager.getInstance();
            System.out.println("Number: " + gameStateManager.getState());
            this.doneFunction();
        }
    }    
    private void doneFunction() {
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        List<MinionShort> minionShort = world.getObjects(MinionShort.class);
        List<MinionTall> minionTall = world.getObjects(MinionTall.class);
        List<Pivot> pivot = world.getObjects(Pivot.class);
        int pivotX = world.getPivotX();
        int pivotIndex = world.getPivotIndex();
        int shortIndex = minionShort.get(0).getIndex();
        int shortX = minionShort.get(0).getLocationX();
        int[] list =  world.list;
        int tmp = list[pivotIndex];
        list[pivotIndex] = list[shortIndex];
        list[shortIndex] = tmp;
        world.updateList();
        pivot.get(0).moveTo(shortX);
        minionShort.get(0).moveTo(pivotX);
        Greenfoot.delay(20);
        Stack<Integer> stack = world.stack;
        if (shortIndex - 1 > world.getStartIndex()) {
            stack.push(world.getStartIndex());
            stack.push(shortIndex - 1);
        }
        if (shortIndex + 1 < world.getEndIndex()) {
            stack.push(shortIndex + 1);
            stack.push(world.getEndIndex());
        }
        if (stack.isEmpty()) {
            System.out.println("********done*********");
            return;
        }
        int rightIndex = stack.pop();
        int leftIndex = stack.pop();
        world.setStartIndex(leftIndex);
        world.setEndIndex(rightIndex);
        world.setStartX(leftIndex);
        world.setEndX(rightIndex);
        minionShort.get(0).moveTo(world.getStartX());
        minionTall.get(0).moveTo(world.getEndX());
        minionShort.get(0).setIndex(world.getStartIndex());
        minionTall.get(0).setIndex(world.getEndIndex());
        minionShort.get(0).setLocationX(world.getStartX());
        minionTall.get(0).setLocationX(world.getEndX());
    }
}
