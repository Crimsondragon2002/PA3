/*
*Author: Muhammed-Sharif Adepetu
* Project: Programming assignment 3- Complexity and sorting
* This method creates a bubble sort algorthm for further testing and experimentation
*/
public class BubbleSort extends Sort {

	
	StopWatch timer = new StopWatch();
	 /*
	 * calls the bubble sort algorthm using an array and the length of the given array
	 * @param array[] - the array to be sorted
  	 * @returns the time it took to sort the array
	 */
  	 public long sort(int array[])
	{
  		int n = array.length;
  		timer.WatchCheck();
  		bubbleSort(array,n);
   	 	long timeSortBase = timer.timing();
   	 	return timeSortBase;
	}
	  	/*
		* uses bubble sorting to sort an array
		*@param arr[] the array to be sorted
  		*@param n- length of the array to be tested
		*@returns sorted array
		*/
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
		 
		  
	
		}

