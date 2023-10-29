import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Helper {
	  public void printArray(int array[])
	    {
	        int n = array.length;
	        for (int i = 0; i < n; ++i)
		{
	            System.out.print(array[i] + "|");
		}
	        System.out.println();
	    }
	    public int [] getDescendingArray(int amount) 
	    {
	    	
	        int [] decendArr = new int[amount];

	        for (int i=0; i < amount; i++) 
                {
	            decendArr[i] = (amount - 1) - i;
	        }

	        return decendArr;
	    }
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
	    public int [] getAscendingArray(int amount) {
	        int [] ascendArr = new int[amount];

	        for (int i=0; i < amount; i++) {
	            ascendArr[i] = i;
	        }

	        return ascendArr;
	    }
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