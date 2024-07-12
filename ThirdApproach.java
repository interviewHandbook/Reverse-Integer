package com.interviewprep.leetcode.medium.reverseinteger;

public class ThirdApproach {

	public static void main(String[] args) {
		
		//int x = 1534236469;
		int x = 123;
		
		ThirdApproach ta = new ThirdApproach();
		int rev = ta.reverse(x);
		
		System.out.println(rev);
	}
	
	public int reverse(int x) {

		// if x is zero then return
		if(x == 0 ) {

			return 0;
		}

		// declare rev - this will contain our answer
		long rev = 0;
		
		// check if given integer is negative or not
		boolean neg = false;

		if(x < 0) {

			x = x * -1;
			neg = true;
		}

		// generate the reversed integer on the go
		while (x > 0) {

			rev = rev * 10 + (x % 10);

			x = x / 10;

		} 

		// if rev exceeds max limits, then return 0
		if(rev > Integer.MAX_VALUE) {

			return 0;
		}
		
		// if input was negative then return negative reversed integer
		if(neg) {

			rev = rev * -1;
		}

		return (int)rev;
	}

}
