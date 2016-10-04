import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickSortProcess here.
 * 
 * @author (Hui Wan) 
 * @version (Version 1)
 */
public class QuickSortProcess extends Actor
{
    private int startX;
    private int endX;
    private int[] list;
    private int pivot;
    private int temp_result;
    private TestFindSmall testFindSmall;
    private TestSwap testSwap;
    
    public QuickSortProcess()
    {
        QuickSortWorld qworld; 
        qworld = (QuickSortWorld)this.getWorld();
        
        this.startX = 0;
        this.endX = qworld.getEndIndex();
        this.list = qworld.getList();
        //this.test = qworld.getTestButton();
        this.pivot = qworld.getPivotIndex();
        //this.next = qworld.getNextButton();
        this.temp_result = -1;
        
        int i;
        for (i = 0; i < list.length; i++)
        {
            System.out.print(this.list[i] + " ");
        }
        System.out.println("");
    }
    
    // just for test
    public QuickSortProcess(int junitTest)
    {
        
        
        this.startX = 0;
        this.endX = 9;
        this.list = new int[] {7, 3, 1, 6, 5, 8, 23, 21, 12, 10};
        //this.next = qworld.getNextButton();
        //this.test = qworld.getTestButton();
        //this.next = (NextButton)button;
        this.pivot = 8;
        this.temp_result = -1;
       
        
        int i;
        for (i = 0; i < list.length; i++)
        {
            System.out.print(this.list[i] + " ");
        }
        System.out.println("");
    }
    
    /**
     * Act - do whatever the QuickSortProcess wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if (Greenfoot.mousePressed(this.test))
        //{
        //    System.out.println("QuickSort begins from here.");
        //    this.quickSort(this.list, 0, this.endX, this.pivot); 
        //}
        QuickSortWorld qworld; 
        qworld = (QuickSortWorld)this.getWorld();
        this.testFindSmall = qworld.getTestFindSmall();
        this.testSwap = qworld.getTestSwap();
        if (Greenfoot.mouseClicked(this))
        {
            this.temp_result = this.quickSort(this.list, 0, this.endX, this.pivot);
        }
    } 
    
    public int quickSort()
    {
        int result = -1;
        result = this.quickSort(this.list, 0, this.endX, this.pivot);
        return result;
    }
    
    public int quickSort(int[] nums, int start, int end, int pivotIndex)
    {
        int x = 0;
        if (start < end) {
            x = this.getLocation(nums, start, end, pivotIndex);
            
            this.setStartX(x + 1);
            System.out.println("minionShort stands at " + this.startX);
           
            this.setEndX(x - 1);
            System.out.println("minionTall stands at " + this.endX);
            
            this.pivot = (this.startX + this.endX)/2;
            System.out.println("pivot stands at " + this.pivot);
            
            quickSort(nums, 0, this.endX, this.pivot); // x - 1;
            quickSort(nums, this.startX, end, this.pivot); // x + 1;
            return 0;
        }
        return -1;
    }
    
    public int getLocation(int[] nums, int start, int end, int pivotIndex) {
        int i = start - 1,  j = 0;
        int x = 0;
        x = nums[pivotIndex];
        exchange(nums, pivotIndex, end);
        System.out.println("Exchange pivot and the end: " + nums[pivotIndex] + " " + nums[end]);

        for (j = i + 1; j < end; j++) {
            // 把一个比目标元素小的新发现元素同第一部分(共四部分)的最后一个元素交换,即并入第一部分
            // exchange a smaller element with the last one in the forth part, making it imerged into the first part
            //while (!this.next.getFlag());
            //this.next.setFlag(false);
            while (!Greenfoot.mouseClicked(this.testFindSmall)); // FindSmall button block here;
           
            if (nums[j] <= x) {
                i++;
                
                while (!Greenfoot.mouseClicked(this.testSwap)); //SwapButton block here;
                //while (!this.next.getFlag());
                //this.next.setFlag(false);
                System.out.println("minionShort go one step: " + nums[i]);
                System.out.println("minionTall find a smaller data: " + nums[j]);                
                exchange(nums, i ,j);
                System.out.println("Exchange minionShort and minionTall: " + nums[i] + " " + nums[j]);
            }
            System.out.println("minionTall go ahead for one step: " + nums[j + 1]);
            
        }
        System.out.println("miniTall go one step: " + nums[i + 1]);  
        exchange(nums, i + 1, end); // swap persons
        System.out.println("Exchange pivot to the proper position: " + nums[i] + " " + nums[j]);
        System.out.println("The right of the pivot is " + (i + 1));
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
