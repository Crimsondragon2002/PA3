import Helper.java;
import MergeSort.java;

public class SortTestClient 
{
	MergeSort merging = new MergeSort();
	Helper help = new Helper();
        WatchCheck timer0 = new WatchCheck();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			
		}
        double time0 = timer0.timing();
        System.out.println("Timing from creation to sleep of 1000000 microseconds, or one second is " +time0 + " microsecond ");
        
        int[] testDupAscend = help.getDupAscendingArray(50);
        int[] testAscend = help.getAscendingArray(50);
        int[] testDupDescend = help.getDupDescendingArray(50);
        int[] testDescend = help.getDescendingArray(50);
        int[] testDupRandom = help.getMoreRandomArray(50);
        int[] testRandom = help.getLessRandomArray(50);
        
        System.out.println("Test descending array with duplicates is");
        help.printArray(testDupDescend);
        double testTime1 = merging.sortMerge(testDupDescend);
        System.out.print("When Sorted it is ");
        help.printArray(testDupDescend);
        System.out.println("The sort calculation took " + testTime1 + " microseconds" );
        System.out.println("");
        
        System.out.println("Test descending array is");
        help.printArray(testDescend);
        double testTime2 =merging.sortMerge(testDupDescend);
        System.out.print("When Sorted it is ");
        help.printArray(testDescend);
        System.out.println("The sort calculation took " + testTime2 + " microseconds" );
        System.out.println("");
        
        System.out.println("Test ascending array with duplicates is");
        help.printArray(testDupAscend);
        double testTime3 =merging.sortMerge(testDupAscend);
        System.out.print("When Sorted it is ");
        help.printArray(testDupAscend);
        System.out.println("The sort calculation took " + testTime3  + " microseconds");
        System.out.println("");
        
        System.out.println("Test ascending array is");
        help.printArray(testAscend);
        double testTime4 =merging.sortMerge(testAscend);
        System.out.print("When Sorted it is ");
        help.printArray(testAscend);
        System.out.println("The sort calculation took " + testTime4  + " microseconds");
        System.out.println("");
        
        System.out.println("Test random array with duplicates is");
        help.printArray(testDupRandom);
        double testTime5 = merging.sortMerge(testDupRandom);
        System.out.print("When Sorted it is ");
        help.printArray(testDupRandom);
        System.out.println("The sort calculation took " + testTime5 + " microseconds" );
        System.out.println("");
        
        System.out.println("Test random array is");
        help.printArray(testRandom);
        double testTime6 =merging.sortMerge(testRandom);
        System.out.print("When Sorted it is ");
        help.printArray(testRandom);
        System.out.println("The sort calculation took " + testTime6 + " microseconds" );
        System.out.println("");
        int n = 2;
        int[] arraydr1 = help.getMoreRandomArray(8000);
        int[] arraydr2 = help.getMoreRandomArray(16000);
        int[] arraydr3 = help.getMoreRandomArray(32000);
        int[] arraydr4 = help.getMoreRandomArray(64000);
        int[] arraydr5 = help.getMoreRandomArray(128000);
        int[] arraydr6 = help.getMoreRandomArray(256000);
        
        int[] arrayr1 = help.getLessRandomArray(8000);
        int[] arrayr2 = help.getLessRandomArray(16000);
        int[] arrayr3 = help.getLessRandomArray(32000);
        int[] arrayr4 = help.getLessRandomArray(64000);
        int[] arrayr5 = help.getLessRandomArray(128000);
        int[] arrayr6 = help.getLessRandomArray(256000);
        
        int[] arraya1 = help.getAscendingArray(8000);
        int[] arraya2 = help.getAscendingArray(16000);
        int[] arraya3 = help.getAscendingArray(32000);
        int[] arraya4 = help.getAscendingArray(64000);
        int[] arraya5 = help.getAscendingArray(128000);
        int[] arraya6 = help.getAscendingArray(256000);
        
        int[] arrayd1 = help.getDescendingArray(8000);
        int[] arrayd2 = help.getDescendingArray(16000);
        int[] arrayd3 = help.getDescendingArray(32000);
        int[] arrayd4 = help.getDescendingArray(64000);
        int[] arrayd5 = help.getDescendingArray(128000);
        int[] arrayd6 = help.getDescendingArray(256000);
        
        int[] arrayda1 = help.getDupAscendingArray(8000);
        int[] arrayda2 = help.getDupAscendingArray(16000);
        int[] arrayda3 = help.getDupAscendingArray(32000);
        int[] arrayda4 = help.getDupAscendingArray(64000);
        int[] arrayda5 = help.getDupAscendingArray(128000);
        int[] arrayda6 = help.getDupAscendingArray(256000);
        
        int[] arraydd1 = help.getDupDescendingArray(8000);
        int[] arraydd2 = help.getDupDescendingArray(16000);
        int[] arraydd3 = help.getDupDescendingArray(32000);
        int[] arraydd4 = help.getDupDescendingArray(64000);
        int[] arraydd5 = help.getDupDescendingArray(128000);
        int[] arraydd6 = help.getDupDescendingArray(256000);

        double time1 = merging.sortMerge(arraydr1);
        System.out.println("The time it took to sort the duplicate random array 1  is " + time1 + " microseconds");
        System.out.println("");

        double time2 = merging.sortMerge(arraydr2);
        System.out.println("The time it took to sort the duplicate random array 2 is " + time2 + " microseconds");
        System.out.println("");

        double time3 = merging.sortMerge(arraydr3);
        System.out.println("The time it took to sort the duplicate random array 3 is " + time3 + " microseconds");
        System.out.println("");

        double time4 = merging.sortMerge(arraydr4);
        System.out.println("The time it took to sort the duplicate random array 4 is " + time4 + " microseconds");
        System.out.println("");

        double time5 = merging.sortMerge(arraydr5);
        System.out.println("The time it took to sort the duplicate random array 5 is " + time5 + " microseconds");
        System.out.println("");

        double time6 = merging.sortMerge(arraydr6);
        System.out.println("The time it took to sort the duplicate random array 6 is " + time6 + " microseconds");
        System.out.println("");

        double time7 = merging.sortMerge(arrayr1);
        System.out.println("The time it took to sort the random array 1  is " + time7 + " microseconds");
        System.out.println("");
 
        double time8 = merging.sortMerge(arrayr2);
        System.out.println("The time it took to sort the random array 2 is " + time8 + " microseconds");
        System.out.println("");

        double time9 = merging.sortMerge(arrayr3);
        System.out.println("The time it took to sort the random array 3 is " + time9 + " microseconds");
        System.out.println("");

        double time10 = merging.sortMerge(arrayr4);
        System.out.println("The time it took to sort the random array 4 is " + time10 + " microseconds");
        System.out.println("");

        double time11 = merging.sortMerge(arrayr5);
        System.out.println("The time it took to sort the random array 5 is " + time11 + " microseconds");
        System.out.println("");

        double time12 = merging.sortMerge(arrayr6);
        System.out.println("The time it took to sort the random array 6 is " + time12 + " microseconds");
        System.out.println("");
        
        double time13 =  merging.sortMerge(arraya1);
        System.out.println("The time it took to sort the ascending array 1 is " + time13 + " microseconds");
        System.out.println("");
        
        double time14 = merging.sortMerge(arraya2);
        System.out.println("The time it took to sort the ascending array 2 is " + time14 + " microseconds");
        System.out.println("");
        
        double time15 = merging.sortMerge(arraya3);
        System.out.println("The time it took to sort the ascending array 3 is " + time15 + " microseconds");
        System.out.println("");

        double time16 = merging.sortMerge(arraya4);
        System.out.println("The time it took to sort the ascending array 4 is " + time16 + " microseconds");
        System.out.println("");

        double time17 = merging.sortMerge(arraya5);
        System.out.println("The time it took to sort the ascending array 5 is " + time17 + " microseconds");
        System.out.println("");

        double time18 =  merging.sortMerge(arraya6);
        System.out.println("The time it took to sort the ascending array 6 is " + time18 + " microseconds");
        System.out.println("");

        double time19 = merging.sortMerge(arrayda1);
        System.out.println("The time it took to sort the ascending duplicate array 1 is " + time19 + " microseconds");
        System.out.println("");

        double time20 = merging.sortMerge(arrayda2);
        System.out.println("The time it took to sort the ascending duplicate array 2 is " + time20 + " microseconds");
        System.out.println("");

        double time21 = merging.sortMerge(arrayda3);
        System.out.println("The time it took to sort the ascending duplicate array 3 is " + time21 + " microseconds");
        System.out.println("");

        double time22 = merging.sortMerge(arrayda4);
        System.out.println("The time it took to sort the ascending duplicate array 4 is " + time22 + " microseconds");
        System.out.println("");

        double time23 = merging.sortMerge(arrayda5);
        System.out.println("The time it took to sort the ascending duplicate array 5 is " + time23 + " microseconds");
        System.out.println("");

        double time24 = merging.sortMerge(arrayda6);
        System.out.println("The time it took to sort the ascending duplicate array 6 is " + time24 + " microseconds");
        System.out.println("");

        double time25 = merging.sortMerge(arrayd1);
        System.out.println("The time it took to sort the descending array 1 is " + time25 + " microseconds");
        System.out.println("");

        double time26 = merging.sortMerge(arrayd2);
        System.out.println("The time it took to sort the descending array 2 is " + time26 + " microseconds");
        System.out.println("");

        double time27 = merging.sortMerge(arrayd3);
        System.out.println("The time it took to sort the descending array 3 is " + time27 + " microseconds");
        System.out.println("");

        double time28 =  merging.sortMerge(arrayd4);
        System.out.println("The time it took to sort the descending array 4 is " + time28 + " microseconds");
        System.out.println("");

        double time29 =  merging.sortMerge(arrayd5);
        System.out.println("The time it took to sort the descending array 5 is " + time29 + " microseconds");
        System.out.println("");

        double time30 = merging.sortMerge(arrayd6);
        System.out.println("The time it took to sort the descending array 6 is " + time30 + " microseconds");
        System.out.println("");

        double time31 =  merging.sortMerge(arraydd1);
        System.out.println("The time it took to sort the descending duplicate array 1 is " + time31 + " microseconds");
        System.out.println("");

        double time32 = merging.sortMerge(arraydd2);
        System.out.println("The time it took to sort the descending duplicate array 2 is " + time32 + " microseconds");
        System.out.println("");

        double time33 = merging.sortMerge(arraydd3);
        System.out.println("The time it took to sort the descending duplicate array 3 is " + time33 + " microseconds");
       
        System.out.println("");

        double time34 = merging.sortMerge(arraydd4);
        System.out.println("The time it took to sort the descending duplicate array 4 is " + time34 + " microseconds");
        System.out.println("");

        double time35 = merging.sortMerge(arraydd5);
        System.out.println("The time it took to sort the descending duplicate array 5 is " + time35 + " microseconds");
        System.out.println("");
        
        double time36 = merging.sortMerge(arraydd6);
        System.out.println("The time it took to sort the descending duplicate array 6 is " + time36 + " microseconds");
        System.out.println("");
	}
public static void BubbleSortTest
{
//Bubble Testing goes here
}
	public static void main(String args[])
	{
		MergeSortTest();
    BubbleSortTest();
	}
}
