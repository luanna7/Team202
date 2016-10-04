import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

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
    public int numTagHeight = 50;
    public int numTagWidth = 50;
    int startX = 0;
    int endX = 0;
    int startIndex = 0;
    int endIndex = 0;
    int pivot = 0;
    int pivotIndex = 0;
    int pivotX = 0;
    public int[] list;
    
    private QuickSortProcess quicksortprocess;
    private TestFindSmall testFindSmall;
    private TestSwap testSwap;
    
    public QuickSortWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
    private void prepare() {
        addObject(new Number(), 80, 500);

        addObject(new five(), 200, 550);
        addObject(new eight(), 300, 550);
        addObject(new ten(), 400, 550);

        addObject(new SetPivotButton(), 650, 100);
        addObject(new FindSmall(), 650, 200);
        addObject(new FindBig(), 650, 300);
        addObject(new Swap(), 650, 400);
        addObject(new Done(), 650, 500);
        this.quicksortprocess = new QuickSortProcess(0);
        addObject(this.quicksortprocess,62,62);
        testFindSmall = new TestFindSmall();
        addObject(testFindSmall,583,570);
        this.testSwap = new TestSwap();
        addObject(testSwap,679,572);
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
    public int getPivot() {
        return pivot;
    }
    public int getPivotIndex() {
        return pivotIndex;
    }
    public int getPivotX() {
        return pivotX;
    }
    public int[] getList() {
        return this.list;
    }
    public TestFindSmall getTestFindSmall()
    {
        return this.testFindSmall;
    }
    public TestSwap getTestSwap()
    {
        return this.testSwap;
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
    public void setPivot() {
        pivot = list[pivotIndex];
    }
    public void setPivotIndex() {
        pivotIndex = (startIndex + endIndex) / 2;
    }
    public void setPivotX() {
        pivotX = startX + (endIndex - startIndex) * numTagWidth / 2;
    }
    public void drawList(int[] list) {
        this.list = list;
        int size = list.length;
        startX = 70;//400 - size / 2 * numTagWidth;
        endX = startX + (size - 1)*numTagWidth; //(size - 1) * numTagWidth + startX;
        
        //NumberTag num = new NumberTag(String.valueOf(list));
        
        startIndex = 0;
        endIndex = size - 1;
        setPivotIndex();
        setPivot();
        setPivotX();
        //System.out.println(pivot);
        
        MinionShort minionShort = new MinionShort();
        addObject(minionShort, startX, 200);
        minionShort.setLocationX(startX);
        minionShort.setIndex(startIndex);
        System.out.println("ShortLocation: " + startX);
  
        MinionTall minionTall = new MinionTall();
        addObject(minionTall, endX, 200);
        minionTall.setLocationX(endX);
        minionTall.setIndex(endIndex);
        
        /*Pivot pivot = new Pivot();
        addObject(pivot, pivotX, 200);
        pivot.setLocationX(pivotX);
        pivot.setIndex(pivotIndex);*/
        int start = startX;
        for (int i = 0; i < size; i++) {
            System.out.println("1:"+ start);
            addObject(new NumberTag(String.valueOf(list[i])), start + 40, 200);
            start += numTagWidth;
        }
    }
    
    public void updateList() {
         List<NumberTag> num = getObjects(NumberTag.class);
         for (NumberTag j: num) {
              removeObject(j);
            }
       int start = startX;
        for (int i = 0; i <= endIndex; i++) {
            System.out.println("2:" + start);
            addObject(new NumberTag(String.valueOf(list[i])), start + 40, 200);
            start += numTagWidth;
        }
    }
}
