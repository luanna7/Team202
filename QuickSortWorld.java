import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    InitialNum num5 = new InitialNum("5");
    InitialNum num10 = new InitialNum("10");
    InitialNum num20 = new InitialNum("20");
    int numTagHeight = 30;
    int numTagWidth = 30;
    public QuickSortWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    private void prepare() {
        Messages message = new Messages();
        message.setMessage("Pick a number: ");
        addObject(message, 240, 550);
        
        //addObject(new InitialNum("5"), 745, 300);
        //addObject(new InitialNum("10"), 745, 400);
        //addObject(new InitialNum("20"), 745, 500);
        
        addObject(num5, 745, 300);
        addObject(num10, 745, 400);
        addObject(num20, 745, 500);
        
    }
    public void drawList(int[] list) {
        int size = list.length;
        int startX = 400 - size / 2 * numTagWidth;
        addObject(new MinionShort(), startX, 200);
        addObject(new MinionTall(), startX + numTagWidth * size, 200);
        for (int i = 0; i < size; i++) {
            addObject(new NumberTag(String.valueOf(list[i])), startX, 300);
            startX += numTagWidth;
        }
    }
}
