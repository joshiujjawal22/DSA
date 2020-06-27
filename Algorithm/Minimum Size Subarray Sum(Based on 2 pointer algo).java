/*
*	All integers must be positive
*	Problem name: Minimum Size Subarray Sum.	
*	Find the minimal length of a contiguous subarray of which the sum ≥ s
*
*	Test case:
	Input: s = 7, nums = [2,3,1,2,4,3]
	Output: 2
	Explanation: the subarray [4,3] has the minimal length under the problem constraint.
*
*/

class minimum_subarray{

	static int minimum_subarray_sum(int a[],int s){
		int n=a.length;
       int res=Integer.MAX_VALUE;
       int l=0;
       int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            while(sum>=s){
                res=Math.min(res,i+1-l);
                sum-=a[l++];
            }
            }
        if(res!=Integer.MAX_VALUE) return res;
        else return -1;   
	}

	// Main
	public static void main(String args[]){

		int a[]={2,3,1,2,4,3};
		int s=7;
		
		int ans=minimum_subarray_sum(a,s);
		System.out.println(ans);
	}
}