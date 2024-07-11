package com.interviewprep.leetcode.medium.reverseinteger;

public class FirstApproach {

	public static void main(String[] args) {
		
		//int x = 1534236469;
		int x = 123;
		
		FirstApproach fa = new FirstApproach();
		int rev = fa.reverse(x);
		
		System.out.println(rev);

	}

	public int reverse(int x) {
        
		// if x is zero then return
		if(x == 0 ) {
			
			return 0;
		}
		
		// declare rev - this will contain our answer
		int rev = 0;
		
		// check if given integer is negative or not
		boolean neg = false;
		
		// if negative - then make it positive
		if(x < 0) {
			
			x = x * -1;
			neg = true;
		}
		
		// declare empty string
		String str = "";
		while (x > 0) {
	 		
			// append the remainder to the string
     		str = str + Integer.toString(x % 10) ;
     		
     		// divide given integer by 10 and update it
     		x = x / 10;

	 	} 
		
		// parse string back to int 
		try {
			rev = Integer.parseInt(str.toString());
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
