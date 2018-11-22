package com.basicprograms.example;

/**
 * 
 * @author DEEPAK J A
 *
 */

public class BinarySearch {

	public static void main(String[] args) {
		
		//Note : binary Search can be done using a SORTED array
		int a[] = {10,20,30,40,50,60,70,80,90};
		int x = 50; // value to be searched
		
		int i = binarySearch(a,x);
		
		if(i==-1){
			System.out.println("Not Found");
		}else {
			System.out.println("Found");
		}
	}

	private static int binarySearch(int arr[], int x) {
		int l = 0;
		int r = arr.length-1;
		
		while(l <= r){
			
			int mid = (l + r)/2; //calculate mid value
			
			if(arr[mid] < x ){  // if x is greater than mid then it should be in right part of array
				l = mid + 1;
			} else if (arr[mid] > x){ // if x is lesser than mid it should be in left part of array
				r = mid - 1;
			} else {
				return mid; //found
			}
		}
		return -1; //not found
	}
}

