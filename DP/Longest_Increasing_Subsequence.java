import java.util.*;

/*
* To find Longest Increasing Subsequence(LIS)
* in array. 
* Input: [-1,1,0,2,3,5]
  Output: 5
* Complexity:O(n²)
* Method: DP
*/


class LIS{

	// Driver Code
	public static void main(String[] args) {
		int nums[]={-1,1,0,2,3,5}; 
		// Result
		int result=CountLIS(nums);
		// Print Result
		System.out.println(result);
	}

	// Function to find length of longest increasing subsequence.
	static int CountLIS(int nums[]){
		int n=nums.length; //Length of an array

		// New array to store length.
        int a[]=new int[n];

        // Fill 1 in all the indexes.
        for(int i=0;i<n;i++) a[i]=1;
        
        // Find maximum upto ith term
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]) 
                	a[i]=Math.max(a[i],a[j]+1);
            }
        }

       	int max=0;

       	// To find maximum 
        for(int i=0;i<n;i++){
            max=Math.max(max,a[i]);}
            
        return max;
	}


}