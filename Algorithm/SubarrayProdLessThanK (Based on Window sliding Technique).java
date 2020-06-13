/*
*
*	Find number of Subarray Product less than K.
*
*/

class ProdLessThanK{

	//  Function to find Product of 
	// Subarray less than K
	static int SubarrayProdLessThanK(int[] nums,int k){
		int prod=1;
        int c=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            while(prod>=k && j<=i) prod/=nums[j++];
            c+=i-j+1;
        }
        return c;
	}

	public static void main(String args[]){

		int a[]={10,5,2,6};
		int k=100;
		int c=SubarrayProdLessThanK(a,k);

		System.out.println("Number of Subarray less than K: "+ c);

	}
}