
import java.io.*; 

class squareroot { 
	
	// Function to find square root 
	// of given number upto given 
	// precision 
	static float squareRoot(int number, int precision) 
	{ 
		if(number==0 || number==1) return number;

		int start = 1, end = number; 
		int mid; 

		// variable to store the answer 
		double ans = 0.0; 

		// Computing integer part of sqaure root
		while (start < end) 
		{ 
			mid = start + ( end-start+1 ) / 2; 
			

			// incrementing start if mid is smaller 
			if ( mid <= number/mid) { 
				start = mid; 
				ans = mid; 
			} 

			// decrementing end if mid is greater
			else { 
				end = mid - 1; 
			} 
		} 

		// For computing fractional partm upto some precision
		double increment = 0.1; 
		for (int i = 0; i < precision; i++) { 
			while (ans * ans <= number) { 
				ans += increment; 
			} 

			
			ans = ans - increment; 
			increment = increment / 10; 
		} 
		return (float)ans; 
	} 

 
	public static void main(String[] args) 
	{ 
		
		System.out.println(squareRoot(50000000, 3)); 

		System.out.println(squareRoot(50, 4)); 
	} 
} 

