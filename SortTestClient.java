import Helper.java;
import MergeSort.java;

public class SortTestClient 
{
	public static  void MergeSortTest()
	{
	MergeSort merging = new MergeSort();
		Helper help = new Helper();
      
        WatchCheck timer0 = new WatchCheck();
        try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			
		}
        double time0 = timer0.timing();
        System.out.println("Timing from creation to sleep of 1 milisecond is " +time0 + " milisecond ");
        
        
        int[] testDupAscend = help.getDupAscendingArray(30);
        int[] testAscend = help.getAscendingArray(30);
        int[] testDupDescend = help.getDupAscendingArray(30);
        int[] testDescend = help.getDescendingArray(30);
        int[] testDupRandom = help.getMoreRandomArray(30);
        int[] testRandom = help.getLessRandomArray(30);
        
        System.out.println("Testd descending array with duplicates is");
        help.printArray(testDupDescend);
        merging.sortMerge(testDupDescend);
        System.out.print("When Sorted it is ");
        help.printArray(testDupDescend);
        System.out.println("");
        
        System.out.println("Test descending array is");
        help.printArray(testDescend);
        merging.sortMerge(testDupDescend);
        System.out.print("When Sorted it is ");
        help.printArray(testDescend);
        System.out.println("");
        
        System.out.println("Test ascending array with duplicates is");
        help.printArray(testDupAscend);
        merging.sortMerge(testDupAscend);
        System.out.print("When Sorted it is ");
        help.printArray(testDupAscend);
        System.out.println("");
        
        System.out.println("Test ascending array is");
        help.printArray(testAscend);
        merging.sortMerge(testAscend);
        System.out.print("When Sorted it is ");
        help.printArray(testAscend);
        System.out.println("");
        
        System.out.println("Test random array with duplicates is");
        help.printArray(testDupRandom);
        merging.sortMerge(testDupRandom);
        System.out.print("When Sorted it is ");
        help.printArray(testDupRandom);
        System.out.println("");
        
        System.out.println("Test random array is");
        help.printArray(testRandom);
        merging.sortMerge(testRandom);
        System.out.print("When Sorted it is ");
        help.printArray(testRandom);
        System.out.println("");
        int[] arraydr1 = help.getMoreRandomArray(1000);
        int[] arraydr2 = help.getMoreRandomArray(2000);
        int[] arraydr3 = help.getMoreRandomArray(4000);
        int[] arraydr4 = help.getMoreRandomArray(8000);
        int[] arraydr5 = help.getMoreRandomArray(16000);
        int[] arraydr6 = help.getMoreRandomArray(32000);
        
        int[] arrayr1 = help.getLessRandomArray(1000);
        int[] arrayr2 = help.getLessRandomArray(2000);
        int[] arrayr3 = help.getLessRandomArray(4000);
        int[] arrayr4 = help.getLessRandomArray(8000);
        int[] arrayr5 = help.getLessRandomArray(16000);
        int[] arrayr6 = help.getLessRandomArray(32000);
        
        int[] arraya1 = help.getAscendingArray(1000);
        int[] arraya2 = help.getAscendingArray(2000);
        int[] arraya3 = help.getAscendingArray(4000);
        int[] arraya4 = help.getAscendingArray(8000);
        int[] arraya5 = help.getAscendingArray(16000);
        int[] arraya6 = help.getAscendingArray(32000);
        
        int[] arrayd1 = help.getDescendingArray(1000);
        int[] arrayd2 = help.getDescendingArray(2000);
        int[] arrayd3 = help.getDescendingArray(4000);
        int[] arrayd4 = help.getDescendingArray(8000);
        int[] arrayd5 = help.getDescendingArray(16000);
        int[] arrayd6 = help.getDescendingArray(32000);
        
        int[] arrayda1 = help.getDupAscendingArray(1000);
        int[] arrayda2 = help.getDupAscendingArray(2000);
        int[] arrayda3 = help.getDupAscendingArray(4000);
        int[] arrayda4 = help.getDupAscendingArray(8000);
        int[] arrayda5 = help.getDupAscendingArray(16000);
        int[] arrayda6 = help.getDupAscendingArray(32000);
        
        int[] arraydd1 = help.getDupDescendingArray(1000);
        int[] arraydd2 = help.getDupDescendingArray(2000);
        int[] arraydd3 = help.getDupDescendingArray(4000);
        int[] arraydd4 = help.getDupDescendingArray(8000);
        int[] arraydd5 = help.getDupDescendingArray(16000);
        int[] arraydd6 = help.getDupDescendingArray(32000);
        

        WatchCheck timer1 = new WatchCheck();
        merging.sortMerge(arraydr1);
        double time1 = timer1.timing();
        System.out.println("The time it took to sort the duplicate random array 1  is " + time1 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer2 = new WatchCheck();
        merging.sortMerge(arraydr2);
        double time2 = timer2.timing();
        System.out.println("The time it took to sort the duplicate random array 2 is " + time2 + " miliseconds");
        System.out.println("");
        

        WatchCheck timer3 = new WatchCheck();
        merging.sortMerge(arraydr3);
        double time3 = timer3.timing();
        System.out.println("The time it took to sort the duplicate random array 3 is " + time3 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer4 = new WatchCheck();
        merging.sortMerge(arraydr4);
        double time4 = timer4.timing();
        System.out.println("The time it took to sort t+he duplicate random array 4 is " + time4 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer5 = new WatchCheck();
        merging.sortMerge(arraydr5);
        double time5 = timer5.timing();
        System.out.println("The time it took to sort the duplicate random array 5 is " + time5 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer6 = new WatchCheck();
        merging.sortMerge(arraydr6);
        double time6 = timer6.timing();
        System.out.println("The time it took to sort the duplicate random array 6 is " + time6 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer7 = new WatchCheck();
        merging.sortMerge(arrayr1);
        double time7 = timer7.timing();

        System.out.println("The time it took to sort the random array 1  is " + time7 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer8 = new WatchCheck();
        merging.sortMerge(arrayr2);
        double time8 = timer8.timing();
        System.out.println("The time it took to sort the random array 2 is " + time8 + " miliseconds");
        System.out.println("");

        WatchCheck timer9 = new WatchCheck();
        merging.sortMerge(arrayr3);
        double time9 = timer9.timing();
        System.out.println("The time it took to sort the random array 3 is " + time9 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer10 = new WatchCheck();
        merging.sortMerge(arrayr4);
        double time10 = timer10.timing();
        System.out.println("The time it took to sort the random array 4 is " + time10 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer11 = new WatchCheck();
        merging.sortMerge(arrayr5);
        double time11 = timer11.timing();
        System.out.println("The time it took to sort the random array 5 is " + time11 + " miliseconds");
        System.out.println("");

        WatchCheck timer12 = new WatchCheck();
        merging.sortMerge(arrayr6);
        double time12 = timer12.timing();
        System.out.println("The time it took to sort the random array 6 is " + time12 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer13 = new WatchCheck();
        merging.sortMerge(arraya1);
        double time13 = timer13.timing();
        System.out.println("The time it took to sort the ascending array 1 is " + time13 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer14 = new WatchCheck();
        merging.sortMerge(arraya2);
        double time14 = timer14.timing();
        System.out.println("The time it took to sort the ascending array 2 is " + time14 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer15 = new WatchCheck();
        merging.sortMerge(arraya3);
        double time15 = timer15.timing();
        System.out.println("The time it took to sort the ascending array 3 is " + time15 + " miliseconds");
        System.out.println("");
        

        WatchCheck timer16 = new WatchCheck();
        merging.sortMerge(arraya4);
        double time16 = timer16.timing();
        System.out.println("The time it took to sort the ascending array 4 is " + time16 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer17 = new WatchCheck();
        merging.sortMerge(arraya5);
        double time17 = timer17.timing();
        System.out.println("The time it took to sort the ascending array 5 is " + time17 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer18 = new WatchCheck();
        merging.sortMerge(arraya6);
        double time18 = timer10.timing();
        System.out.println("The time it took to sort the ascending array 6 is " + time18 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer19 = new WatchCheck();
        merging.sortMerge(arrayda1);
        double time19 = timer19.timing();
        System.out.println("The time it took to sort the ascending duplicate array 1 is " + time19 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer20 = new WatchCheck();
        merging.sortMerge(arrayda2);
        double time20 = timer20.timing();
        System.out.println("The time it took to sort the ascending duplicate array 2 is " + time20 + " miliseconds");
        System.out.println("");

        WatchCheck timer21 = new WatchCheck();
        merging.sortMerge(arrayda3);
        double time21 = timer21.timing();
        System.out.println("The time it took to sort the ascending duplicate array 3 is " + time21 + " miliseconds");
        System.out.println("");

        WatchCheck timer22 = new WatchCheck();
        merging.sortMerge(arrayda4);
        double time22 = timer22.timing();
        System.out.println("The time it took to sort the ascending duplicate array 4 is " + time22 + " miliseconds");
        System.out.println("");

        WatchCheck timer23 = new WatchCheck();
        merging.sortMerge(arrayda5);
        double time23 = timer23.timing();
        System.out.println("The time it took to sort the ascending duplicate array 5 is " + time23 + " miliseconds");
        System.out.println("");

        WatchCheck timer24 = new WatchCheck();
        merging.sortMerge(arrayda6);
        double time24 = timer24.timing();
        System.out.println("The time it took to sort the ascending duplicate array 6 is " + time24 + " miliseconds");
        System.out.println("");

        WatchCheck timer25 = new WatchCheck();
        merging.sortMerge(arrayd1);
        double time25 = timer25.timing();
        System.out.println("The time it took to sort the descending array 1 is " + time25 + " miliseconds");
        System.out.println("");

        WatchCheck timer26 = new WatchCheck();
        merging.sortMerge(arrayd2);
        double time26 = timer26.timing();
        System.out.println("The time it took to sort the descending array 2 is " + time26 + " miliseconds");
        System.out.println("");

        WatchCheck timer27 = new WatchCheck();
        merging.sortMerge(arrayd3);
        double time27 = timer27.timing();
        System.out.println("The time it took to sort the descending array 3 is " + time27 + " miliseconds");
        System.out.println("");

        WatchCheck timer28 = new WatchCheck();
        merging.sortMerge(arrayd4);
        double time28 = timer28.timing();
        System.out.println("The time it took to sort the descending array 4 is " + time28 + " miliseconds");
        System.out.println("");

        WatchCheck timer29 = new WatchCheck();
        merging.sortMerge(arrayd5);
        double time29 = timer29.timing();
        System.out.println("The time it took to sort the descending array 5 is " + time29 + " miliseconds");
        System.out.println("");

        WatchCheck timer30 = new WatchCheck();
        merging.sortMerge(arrayd6);
        double time30 = timer30.timing();
        System.out.println("The time it took to sort the descending array 6 is " + time30 + " miliseconds");
        System.out.println("");

        WatchCheck timer31 = new WatchCheck();
        merging.sortMerge(arraydd1);
        double time31 = timer31.timing();
        System.out.println("The time it took to sort the descending duplicate array 1 is " + time31 + " miliseconds");
        System.out.println("");

        WatchCheck timer32 = new WatchCheck();
        merging.sortMerge(arraydd2);
        double time32 = timer32.timing();
        System.out.println("The time it took to sort the descending duplicate array 2 is " + time32 + " miliseconds");
        System.out.println("");

        WatchCheck timer33 = new WatchCheck();
        merging.sortMerge(arraydd3);
        double time33 = timer33.timing();
        System.out.println("The time it took to sort the descending duplicate array 2 is " + time33 + " miliseconds");
        System.out.println("");

        WatchCheck timer34 = new WatchCheck();
        merging.sortMerge(arraydd4);
        double time34 = timer34.timing();
        System.out.println("The time it took to sort the descending duplicate array 2 is " + time34 + " miliseconds");
        System.out.println("");

        WatchCheck timer35 = new WatchCheck();
        merging.sortMerge(arraydd5);
        double time35 = timer35.timing();
        System.out.println("The time it took to sort the descending duplicate array 2 is " + time35 + " miliseconds");
        System.out.println("");
        
        WatchCheck timer36 = new WatchCheck();
        merging.sortMerge(arraydd6);
        double time36 = timer36.timing();
        System.out.println("The time it took to sort the descending duplicate array 2 is " + time36 + " miliseconds");
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
