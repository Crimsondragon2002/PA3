import java.io.*;
import java.util.*;


class MergeSort{
 
   
	 public void sortMerge(int array[], int left, int right)
	    {
		 	Helper help = new Helper();
	        if (left< right) {
	 

	            int middle = left+ (right - left) / 2;
	 

	            sortMerge(array, middle + 1, right);
	            sortMerge(array, left, middle);
	           
	 
	      
	            merge(array, left, middle, right);
	        }
	        
	    }
	 
    public void merge(int array[], int left, int middle, int right)
    {
    	
    	int rightMid = right - middle;
        int leftMid = middle - left+ 1;
        
 
        int RightArray[] = new int[rightMid];
        int LeftArray[] = new int[leftMid];
       
 

        for (int i = 0; i < leftMid; ++i)
            LeftArray[i] = array[left+ i];
        for (int indexSecond = 0; indexSecond < rightMid; ++indexSecond)
            RightArray[indexSecond] = array[middle + 1 + indexSecond];
        
  
        

  
        int indexFirst = 0, indexSecond = 0;
 
  
        int indexThird = left;
        while (indexFirst < leftMid && indexSecond < rightMid) {
            if (LeftArray[indexFirst] <= RightArray[indexSecond]) {
            	
                array[indexThird] = LeftArray[indexFirst];
                indexFirst++;
            }
            else {
            	
                array[indexThird] = RightArray[indexSecond];
                indexSecond++;
            }
            indexThird++;
        }
 
        while (indexFirst < leftMid) {
        	
            array[indexThird] = LeftArray[indexFirst];
            indexFirst++;
            indexThird++;
            
        }
        while (indexSecond < rightMid) {
        	
            array[indexThird] = RightArray[indexSecond];
            indexSecond++;
            indexThird++;
        }
       
 
     
        
        
    }
 
  
 
    // Driver code
    public static void main(String args[])
    {
    	

    }
}
