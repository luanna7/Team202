import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)) {
            this.findBig();
        }
    }
    private void findBig() {
        int list = world.List;
        if(list[MinionTall.getIndex()] < list[Pivot.getIndex()]) {
          int x = MinionTall.getIndex();
          x++;
          MinionTall.setIndex(x);
        }
    }
}
