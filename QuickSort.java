import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSort extends Actor
{
    private int startX;
    private int endX;
    
    public QuickSort()
    {
        QuickSortWorld qworld; 
        qworld = (QuickSortWorld)this.getWorld();
        
        this.startX = 0;
        this.endX = qworld.getEndIndex();
    }
    
    /**
     * Act - do whatever the QuickSort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public int quickSortProcess(int[] nums, int start, int end)
    {
        int x = 0;
        if (start < end) {
            x = this.getLocation(nums, start, end);
            this.setStartX(x - 1);
            this.setEndX(x + 1);
            quickSortProcess(nums, 0, this.endX); // x - 1;
            quickSortProcess(nums, this.startX, end); // x + 1;
            return 0;
        }
        return -1;
    }
    
    public int getLocation(int[] nums, int start, int end) {
        int i = start - 1,  j = 0;
        int x = 0;
        x = nums[end];

        for (j = i + 1; j < end; j++) {
            // 把一个比目标元素小的新发现元素同第一部分(共四部分)的最后一个元素交换,即并入第一部分
            // exchange a smaller element with the last one in the forth part, making it imerged into the first part
            if (nums[j] <= x) {
                i++;
                exchange(nums, i ,j);
            }
        }
        exchange(nums, i + 1, end); // swap persons

        return i + 1;
    }

    public int exchange(int[] nums, int i, int j)
    {
        int temp = 0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return 0;
    }
    
    public void setStartX(int x)
    {
        this.startX = x;
    }
    
    public int getStartX()
    {
        return this.startX;
    }
    
    public void setEndX(int x)
    {
        this.endX = x;
    }
    
    public int getEndX()
    {
        return this.endX;
    }
}
