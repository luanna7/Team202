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
        QuickSortWorld world = (QuickSortWorld)this.getworld();
        List<MinionShort> minionShort = world.getObejct(MinionShort.class);
        int pivot = world.getPivot();
        int[] list = world.list;
        int shortIndex = minionShort.get(0).getIndex();
        while (list[shortIndex] < pivot) {
            int location = minionShort.get(0).getLocation();
            location += world.numTagWidth;
            minionShort.get(0).moveTo(location);
            minionShort.get(0).set(location);
            shortIndex++;
            minionShort.get(0).setIndex(shortIndex);
        }

    }
    
}
