import java.util.*;

/* Trapping rain water using stacks.
* Given an array with non-negative 
* integers where width of each bar is 1. 
*
* Input:[0,1,0,2,1,0,1,3,2,1,2,1]
  Output:6
* Complexity:O(n)
*/

class trapping_of_water{
	// Driver Code
	public static void main(String args[]){
	
		int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int result = water_trap(a);
		System.out.println("Water trapped = "+ result);

	}

	// Function to find water trapped.
	static int water_trap(int a[]){
		Stack<Integer> stk = new Stack<Integer>();

		int curr = 0;

		// Skip starting zeroes
		while(a.length < curr && a[curr] == 0){
			++curr;
		}

		int filled_water = 0; 

        while (curr < a.length) {  

            while (!stk.isEmpty() && a[curr] >= a[stk.peek()]) {  

               int b = stk.pop();  
               if (stk.isEmpty()) 
               break;  
               filled_water += ((curr - stk.peek() - 1) * (Math.min(a[curr], a[stk.peek()]) - a[b]));  
            } 

            stk.push(curr);  
            ++curr;  
        }
      	return filled_water;
    }
}
