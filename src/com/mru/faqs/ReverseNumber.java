package com.mru.faqs;

import java.util.Arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 153;
		
		int rev = 0;
		
		while(num!=0) {
			int last = num%10;
			rev = rev*10 + last;
			num=num/10;
		}
		 System.out.println("Reverse Number : "+rev);
	}

}
