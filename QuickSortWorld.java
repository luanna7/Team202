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
    int numTagHeight = 30;
    int numTagWidth = 30;
    int startX = 0;
    int endX = 0;
    int startIndex = 0;
    int endIndex = 0;
    int pivot = 0;
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
        
        addObject(new InitialNum("5"), 745, 300);
        addObject(new InitialNum("10"), 745, 400);
        addObject(new InitialNum("20"), 745, 500);
        
        addObject(new SetPivotButton(), 600, 450);
        addObject(new FindSmall(), 600, 500);
        addObject(new FindBig(), 600, 550);
        addObject(new Swap(), 600, 600);
        
    }
    public int getStartX() {
        return startX;
    }
    public int getEndX() {
        return endX;
    }
    public int getStartIndex() {
        return startIndex;
    }
    public int getEndIndex() {
        return endIndex;
    }
    public void setStartX(int x) {
        startX = x;
    }
    public void setEndX(int x) {
        endX = x;
    }
    public void setStartIndex(int x) {
        startIndex = x;
    }
    public void setEndIndex(int x) {
        endIndex = x;
    }
    public void getPivot(){
        return pivot;
    }
     public void getPivot(int x){
        pivot = x;
    }
    public void drawList(int[] list) {
        int size = list.length;
        startX = 400 - size / 2 * numTagWidth;
        endX = (size - 1) * numTagWidth + startX;
        startIndex = 0;
        endIndex = size - 1;
        int pivot = list[(size - 1) / 2];
        System.out.println(pivot);
        addObject(new MinionShort(), startX, 200);
        addObject(new MinionTall(), endX, 200);
        addObject(new Pivot(), startX + (size - 1) * numTagWidth / 2, 200);
        int start = startX;
        for (int i = 0; i < size; i++) {
            addObject(new NumberTag(String.valueOf(list[i])), start, 300);
            start += numTagWidth;
        }
    }
}
