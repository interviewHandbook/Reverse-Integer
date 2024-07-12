package com.interviewprep.leetcode.medium.reverseinteger;

public class SecondApproach {

	public static void main(String[] args) {
		
		int x = 123;
		
		SecondApproach sa = new SecondApproach();
		int rev = sa.reverse(x);
		
		System.out.println(rev);
	}

	public int reverse(int x) {

		// if x is zero then return
		if(x == 0) {

			return 0;
		}
		
		// declare rev - this will contain our answer
		int rev = x;

		// check if given integer is negative or not
		boolean neg = false;

		if(x < 0) {

			x = x * -1;
			neg = true;
		}

		// convert given integer to string
		String str = String.valueOf(x);

		// convert to StringBuilder and reverse
		StringBuilder revStr = new StringBuilder(str).reverse();

		// convert back to integer
		try {
			rev = Integer.parseInt(revStr.toString());
		}
		catch(Exception e) {
			return 0;
		}
		
		// if input was negative then return negative reversed integer
		if(neg) {
			
			rev = rev * -1;
		}


		return rev;
	}
}
