package com.basicprograms.example;

/**
 * 
 * @author DEEPAK J A
 *
 */

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {20,31,62,74,23,55,98};
		int x = 98; // number to be searched
		
		int i = linearSearch(a,x);
		
		if(i==-1){
			System.out.println("Not Found");
		}else {
			System.out.println("Found");
		}
	}

	private static int linearSearch(int arr[], int x) {
		
		for (int i=0 ; i<arr.length ; i++) {
			if(arr[i]==x){
				return 1; //found
			}
		}
		return -1; //not found
	}
}
