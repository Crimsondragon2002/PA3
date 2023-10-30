/*
* Author: Joshua Buscher
* Project: Programming assignment 3- complexity and sorting
* This method creates a merge sort algorithm for further testing and experimentation
*/
class MergeSort extends Sort

{
	StopWatch timer = new StopWatch();
 	/*
	* Calls the function that sorts a given array using its length, and returns the time it takes to sort
	* @param array[] - the array that is sorted
	* @returns the time it takes for sorting to occur
	/
   	 public long sort(int array[])
	{
   		 	timer.WatchCheck();
    	 	sortMerge(array, 0, array.length-1);
    	 	long timeSortBase = timer.timing();
    	 	return timeSortBase;
	}
	/*
	* uses a merge sort algorithm to sort the given array
	* @param array[] - the array to be sorted
	* @param left - the left of the array to be sorted 
	* @param right - the right of the array to be sorted
	*/
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
	 /*
	* uses merges the parts of an array in order to sort it
	* @param array[] - the array to be sorted
	* @param left - the left of the array to be sorted 
 	* @param middle - the middle of the array to be sorted
	* @param right - the right of the array to be sorted
	*/
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
 
  
}
