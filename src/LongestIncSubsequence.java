//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LongestIncSubsequence {
	
	public static void main(String[] args) {
	
		//Creating an array of random integers
		//Size of array: input
		//Random numbers: 0 - 14
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = scan.nextInt(),  nums = 15;
		int[] list = new int[size];
		Random rand = new Random();
		
		//Filling up the array with random integers
		for(int i = 0; i < size; i++) {
			int randInt = rand.nextInt(nums);
			list[i] = randInt;
		}
		
		//Displaying array
		System.out.println("Array: " + Arrays.toString(list));
		
		//Displaying length of longest subsequence after calling method
		System.out.println("The length of the Longest Subsequence is: " + longestSubsequence(list));
	}
	
	//Method to find the length of the longest subsequence
	public static int longestSubsequence(int[] list) {
		
		//Initializing count
		int count = 1;
		
		//Creating result array
   	    int[] result = new int[list.length];
   	    
   	    //ArrayList to attempt finding numbers of the increasing subsequence
   	    //ArrayList<Integer> numList = new ArrayList<Integer>();
   	    
   	    //for loop to iterate through the array
    	for(int i = 0; i < list.length; i++){
	        result[i] = 1;
	        //Nested loop to iterate through rest of array from i
		    for(int j = 0; j <= i; j++){
		    	//checking if the next number is bigger than the previous number
	            if(list[j] < list[i]){	
	            	//after finding max between i and j store into result[i]
				    result[i] = Math.max(result[i], result[j] + 1);
				    //obtain count to find biggest length of subsequence
		            count = Math.max(result[i], count);
	            }
		    }
    	}
    	
    	//initially this was meant to print the ArrayList 
    	/*
    	for(int i = 0; i < numList.size(); i++) {
    		System.out.print(numList.get(i) + " ");
    	}
    	*/
    	
    	//Return length 
    	return count;
	}
}
