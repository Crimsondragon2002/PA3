/*
* Author: Joshua Buscher
* Project: Programming assignment 3- Complexity and sorting
* This method creates functions that helps with testing the sorting algorthms, like creating assending and descending arrays, and printing arrays
/
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Helper {
	  /*
	  * prints a given array
          *@param array- array to be printed
	  */
	  public void printArray(int array[])
	    {
	        int n = array.length;
	        for (int i = 0; i < n; ++i)
		{
	            System.out.print(array[i] + "|");
		}
	        System.out.println();
	    }
	 /*
	 * creats a descending array with no duplicate values
	 * @param amount- size of array to be made/amount of cycles for creation
	 * @returns a descending array with no duplicate values
	 */
	    public int [] getDescendingArray(int amount) 
	    {
	    	
	        int [] decendArr = new int[amount];

	        for (int i=0; i < amount; i++) 
                {
	            decendArr[i] = (amount - 1) - i;
	        }

	        return decendArr;
	    }
	 /*
	 * creats a descending array with duplicate values
	 * @param amount- size of array to be made/amount of cycles for creation
	 *  @returns a descending array with duplicate values
	 */
	    public int [] getDupDescendingArray(int amount) 
            {
	    	
	        int [] descendArr = new int[amount];
	       int index = 0;

	        for (int i=0; i <= (amount); i++) 
		{
	        	if(index <= (amount-1)) 
			{
	            		descendArr[index] = (amount - 1) - i;
	        	}
	               if(index+1<=(amount-1)) 
			{
	           		 descendArr[index+1] = (amount - 1) - i;
	            	}
	            	index = index +2;
	            
	            
	        }
	        return descendArr;
	    }
	 /*
	 * creats a ascending array with no duplicate values
	 * @param amount- size of array to be made/amount of cycles for creation
	 * @returns a ascending array with no duplicate values
	 */
	    public int [] getAscendingArray(int amount) {
	        int [] ascendArr = new int[amount];

	        for (int i=0; i < amount; i++) {
	            ascendArr[i] = i;
	        }

	        return ascendArr;
	    }
	 /*
	 * creats a ascending array with  duplicate values
	 * @param amount- size of array to be made/amount of cycles for creation
	 * @returns a ascending array with duplicate values
	 */
	    public int [] getDupAscendingArray(int amount) 
	   {
	    	int [] ascendArr = new int[amount];
	    	int index = 0;
	    	for (int i =0; i <= (amount); i++)
	    	{
	    		if(index <= amount-1) 
			{
	    		
	    		ascendArr[index]=i;
	    		}
	    		if(index+1<=(amount-1)) 
			{
	    			ascendArr[index+1]=i;
	    		}
	    		index= index +2;
	    		
	    	}
	    	return ascendArr;	
	    }

	 /*
	 * creats a random array with  duplicate values
	 * @param amount- size of array to be made/amount of cycles for creation
	 * @returns a random array with duplicate values
	 */
	    public int [] getMoreRandomArray(int amount) 
	    {

	    	 Integer [] randomArr = new Integer[amount];
	    	 int index =0;
	    	 for (int i=0; i <= (amount); i++) 
		{
		           if(index <= (amount-1)) 
			     {	
		            randomArr[index] = (amount - 1) - i;
		             }
		            if(index+1<=(amount-1))
			    {
		            randomArr[index+1] = (amount - 1) - i;
		            }
		            index = index +2;
		            
		            
		        }

		       Collections.shuffle(Arrays.asList(randomArr));

		        int newRandomArr [] = new int[amount];

		        for (int i=0; i < amount; i++) 
			{
		            newRandomArr[i] = randomArr[i];
		        }

		       return newRandomArr;
	    }
	    
	   /*
	 * creats a random array with no duplicate values
	 * @param amount- size of array to be made/amount of cycles for creation
	 * @returns a random array with no duplicate values
	 */   
	    public int [] getLessRandomArray(int amount) 
	   {
	    	
	        Integer [] randomArr = new Integer[amount];

	        for (int i=0; i < amount; i++) 
		{
	            randomArr[i] = (amount - 1) - i;
	        }

	       Collections.shuffle(Arrays.asList(randomArr));

	        int newRandomArr [] = new int[amount];

	        for (int i=0; i < amount; i++)
   		{
	            newRandomArr[i] = randomArr[i];
	        }

	       return newRandomArr;
	    }
	    
}
