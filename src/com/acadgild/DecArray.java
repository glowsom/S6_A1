package com.acadgild;
/**
 * Session 6 Assignment 1
 */
public class DecArray {

	public static void main(String[] args) {
		/* TODO Declare an integer array of size 10.
		 * Initialize using for loop with 1 to 10,
		 * and print all even numbers from an array.
		 * 
		 * I am assuming the problem isn't looking for
		 * 3 different sets of code to demonstrate different
		 * aspects of arrays rather than efficiency.
		 * (The whole problem could be done in one for loop
		 * without making several calls to array functions) 
		 */
		
		//Declaring array of size 10
		int[] dec = new int[10];
		
		/*
		 * Initializing array requires an offset, since index ranges from
		 * 0 - 9, and elements must range from 1-10
		 */
		for (int i=0; i<dec.length; i++)
			dec[i]= i+1; //i+1 accounts for the offset
		
		for (int i=0; i<dec.length; i++){
			/*
			 * Assuming the placement of array elements is unknown,
			 * this if-statement will check each element in the array to
			 * evaluate whether it's even, before printing it
			 */
			if(dec[i]%2==0)
				System.out.print(dec[i]+ "\t");
		}
		
	}

}
