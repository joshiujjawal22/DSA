import java.util.Scanner;

/*
* 	Window Sliding Technique
*	To find maximum sum of subarray with k size
*	Complexity: O(n)
*
*	Input:
	a[]={5,2,3,-1,10};
	k=3;

*	Output:12
*
*	Explanation:Sum of (3,-1,10)	

*/

class maxSubarray{

public static void main(String[] args) {

	int a[]={5,2,3,-1,10};
	int k=3;

	int max=maxSubarr(a,k);

	System.out.println(max);

}


static int maxSubarr(int a[],int k){
	int sum=0;
	
	for(int i=0;i<k;i++) 
		sum+=a[i];

	int max=sum;

	for(int i=k;i<a.length;i++){
		sum+=a[i]-a[i-k];
		if(max<sum) max=sum;
	}

	return max;

}


}