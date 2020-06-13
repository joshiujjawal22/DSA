/*
*
*	Find number of Subarray sum less than K.
*
*/

class SumLessThanK{

	//  Function to find Sum of 
	// Subarray less than K
	static int SubarraySumLessThanK(int[] nums,int k){
		int sum=1;
        int c=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=k && j<=i) sum-=nums[j++];
            c+=i-j+1;
        }
        return c;
	}

	public static void main(String args[]){

		int a[]={10,5,2,6};
		int k=10;
		int c=SubarraySumLessThanK(a,k);

		System.out.println("Count of Subarray which have sum less than K: "+ c);

	}
}