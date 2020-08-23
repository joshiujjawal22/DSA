import java.util.Scanner;

/* Trapping rain water using array.
* Given an array with non-negative 
* integers where width of each bar is 1. 
*
* Input:[0,1,0,2,1,0,1,3,2,1,2,1]
  Output:6
* Complexity:O(n²)
*/

class trapping_of_water{
	// Driver Code
	public static void main(String args[]){
	
		int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
		int result=water_trap(a);
		System.out.println("Water trapped = "+ result);

	}

	// Function to find water trapped.
	static int water_trap(int a[]){
		int filled_water=0;
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{	
			int first=a[i];
			for(int j=0;j<i;j++)
			{
				if(a[j]>first) first=a[j];
			}

			int second=a[i];
			for(int j=i+1;j<n;j++)
			{
				if(a[j]>second) second=a[j];
			}

			int min;
			if(first>second) min=second;
			else min=first;

			filled_water=filled_water+(min-a[i]);
		}
		return filled_water;

	}
}



