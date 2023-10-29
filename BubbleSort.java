
public class BubbleSort extends Sort {

	
	StopWatch timer = new StopWatch();
	 
  	 public long sort(int array[])
	{
  		int n = array.length;
  		timer.WatchCheck();
  		bubbleSort(array,n);
   	 	long timeSortBase = timer.timing();
   	 	return timeSortBase;
	}
	  
		    static void bubbleSort(int arr[], int n)
		    {
		        int i, j, temp;
		        boolean swapped;
		        for (i = 0; i < n - 1; i++) {
		            swapped = false;
		            for (j = 0; j < n - i - 1; j++) {
		                if (arr[j] > arr[j + 1]) {
		                     
		                    // Swap arr[j] and arr[j+1]
		                    temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                    swapped = true;
		                }
		            }
		 
		            if (swapped == false)
		                break;
		        }
		    }
		 
		    // Function to print an array
		    static void printArray(int arr[], int size)
		    {
		        int i;
		        for (i = 0; i < size; i++)
		            System.out.print(arr[i] + " ");
		        System.out.println();
		    }
		 
	
		}

