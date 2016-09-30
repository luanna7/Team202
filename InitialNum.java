import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class InitialNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InitialNum extends Actor
{
    /**
     * Act - do whatever the InitialNum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int num;
    public InitialNum(String str) {
        GreenfootImage image = getImage() ;
        image.scale( 120, 25 ) ;
        
        image.setColor(java.awt.Color.BLACK);
        image.drawString(str, 0, 9); 
        num = Integer.valueOf(str);
    }
    public void act() 
    {
        // Add your action code here.
        QuickSortWorld world = (QuickSortWorld)this.getWorld();
        if (Greenfoot.mousePressed(this)) {
            int[] list = pickRandomNum(num);
            world.drawList(list);
        }
    }    
    private int[] pickRandomNum(int n) {
        int[] list = new int[n];
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * (n)) + 1;
            while (set.contains(num)) {
                num = (int) (Math.random() * (n)) + 1;
            }
            set.add(num);
            list[i] = num;
        }
        return list;
    }   
}
