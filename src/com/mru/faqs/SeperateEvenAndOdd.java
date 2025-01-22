package com.mru.faqs;

public class SeperateEvenAndOdd {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int even = 0,odd = 0;
		for(int element:arr) {
			if(element%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		int[] arr1 = new int[even];
		int[] arr2 = new int[odd];
		int even_index=0,odd_index=0;
		for(int element:arr) {
			if(element%2==0) {
				arr1[even_index++]=element;
			}else {
				arr2[odd_index++]=element;
			}
		}
		System.out.println("Even Number: ");
		for(int element:arr1) {
			System.out.print(element);
		}
		System.out.println();
		
		System.out.println("Odd Number: ");
		for(int element:arr2) {
			System.out.print(element);
	}

}
}