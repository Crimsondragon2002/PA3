/**
* Authors: Joshua Buscher and Muhammed-Sharif Adepetu
* Project: Programming assignment 3- complexity and sorting
* 
* This method implements testing for the two sorting algorithms created, and allows for expermentation for the hypothesis that duplicate values affect the runtime of sorting algorthims to occur
*/

public class SortTestClient 
{
	
	static Sort merge = new MergeSort();
	static Sort bubble = new BubbleSort();
	static Helper help = new Helper();
	StopWatch timer = new StopWatch();
	
    static int[] testDupAscend = help.getDupAscendingArray(50);
    static int[] testAscend = help.getAscendingArray(50);
    static int[] testDupDescend = help.getDupDescendingArray(50);
    static int[] testDescend = help.getDescendingArray(50);
    static int[] testDupRandom = help.getMoreRandomArray(50);
    static int[] testRandom = help.getLessRandomArray(50);
	

	

/*
* This starts the testing of the bubble sort algorithm
*/        
public static void BubbleSortTest(){
	System.out.println("Testing Bubble Sort!! \n");
	TestClient(bubble, "bubble sort");
}
/*
*This starts the testign of the merge sort algorithm
*/ 
public static void MergeSortTest(){
	System.out.println("Testing Merge Sort!! \n");
	TestClient(merge, "merge sort");
}
/*
*This tests the chosen sorting algorithm, and does experiments to check if using duplicate values affects runtime
* @param SortType - the type of algorthim that is sorted
* @param Sort - name of the algorithm type that the sorted algorthm belongs to
*/
public static void TestClient(Sort SortType, String Sort){
     
    
    System.out.println("Test " + Sort + " descending array with duplicates");
    help.printArray(testDupDescend);
    double testTime1 = SortType.sort(testDupDescend);
    System.out.print("When Sorted it is \n");
    help.printArray(testDupDescend);
    System.out.println("The sort calculation took " + testTime1 + " microseconds" );
    System.out.println("");
    
    System.out.println("Test " + Sort + " descending array:");
    help.printArray(testDescend);
    double testTime2 =SortType.sort(testDupDescend);
    System.out.print("When Sorted it is \n");
    help.printArray(testDescend);
    System.out.println("The sort calculation took " + testTime2 + " microseconds" );
    System.out.println("");
    
    System.out.println("Test ascending array with duplicates:");
    help.printArray(testDupAscend);
    double testTime3 =SortType.sort(testDupAscend);
    System.out.print("When Sorted it is \n");
    help.printArray(testDupAscend);
    System.out.println("The sort calculation took " + testTime3  + " microseconds");
    System.out.println("");
    
    System.out.println("Test ascending array:");
    help.printArray(testAscend);
    double testTime4 =SortType.sort(testAscend);
    System.out.print("When Sorted it is \n");
    help.printArray(testAscend);
    System.out.println("The sort calculation took " + testTime4  + " microseconds");
    System.out.println("");
    
    System.out.println("Test random array with duplicates:");
    help.printArray(testDupRandom);
    double testTime5 = SortType.sort(testDupRandom);
    System.out.print("When Sorted it is \n");
    help.printArray(testDupRandom);
    System.out.println("The sort calculation took " + testTime5 + " microseconds" );
    System.out.println("");
    
    System.out.println("Test random array:");
    help.printArray(testRandom);
    double testTime6 =SortType.sort(testRandom);
    System.out.print("When Sorted it is \n");
    help.printArray(testRandom);
    System.out.println("The sort calculation took " + testTime6 + " microseconds" );
    System.out.println("");
   
  
    for(int i=1; i<7; i++) {
    int Multiplyer=(int) Math.pow(i,2);
    int elements = 2000*Multiplyer;
    
    int[] array1 = help.getMoreRandomArray(elements);
    double time = SortType.sort(array1);
    System.out.println("Time taken for " + Sort + " to sort the duplicate random array with " + elements+ " elements: " + time + "microseconds");

    
    int[] array2 = help.getLessRandomArray(elements); 
    time = SortType.sort(array2);
    System.out.println("Time taken for " + Sort + " to sort the random array with " + elements+ " elements: " + time + "microseconds");

    int[] array3 = help.getAscendingArray(elements);
    time = SortType.sort(array3);
    System.out.println("Time taken for " + Sort + " to sort the ascending array with " + elements+ " elements: " + time + "microseconds");
  
    int[] array4 = help.getDescendingArray(elements);
    time = SortType.sort(array4);
    System.out.println("Time taken for " + Sort + " to sort the descending array with " + elements+ " elements: " + time + "microseconds");

    int[] array5 = help.getDupAscendingArray(elements);
    time = SortType.sort(array5);
    System.out.println("Time taken for " + Sort + " to sort the ascending duplicate array with " + elements + " elements: " + time + "microseconds");

    int[] array6 = help.getDupDescendingArray(elements);
    time = SortType.sort(array6);
    System.out.println("Time taken for " + Sort + " to sort the descending duplicate array with " + elements +  " elements: " + time + "microseconds");
}
}

public static void main(String args[])
{
MergeSortTest();
BubbleSortTest();
}
}
