import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exchanger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exchanger extends Actor
{
    /**
     * Act - do whatever the Exchanger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    // function to display location exchange of two actors on the same X-axle
    
    public void move(Actor left, Actor right) 
    {
        int dist = 0;
        
        int radius = (right.getX() - left.getX()) / 2;
        int centerX = right.getX() - radius;
        int centerY = left.getY();
        
        while (dist < 180){
         
         dist += 10;
         double ra = Math.toRadians(dist);
         double rb = Math.toRadians(180-dist);
         int newaX = (int)(Math.cos(ra) * radius);
         int newaY = (int)(Math.sin(ra) * radius);
         int newbX = (int)(Math.cos(rb) * radius);
         int newbY = (int)(Math.sin(rb) * radius);
         
         left.setLocation(centerX + newbX, centerY - newbY);
         right.setLocation(centerX + newaX, centerY - newaY);
         Greenfoot.delay(1);
         
        }
        
    }    
}
