package com.mru.faqs;
import java.util.Scanner;
public class AddAndSeperate {

	public static void main(String[] args) {
		System.out.print("Enter array length");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] arr = new int[n];

		for(int i = 0;i<n;i++) {
			System.out.print("Enter array element for"+i+"th position:");
			arr[i] = scanner.nextInt();
		}
		for(int element:arr) {
			System.out.print(element+" ");
		}
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
