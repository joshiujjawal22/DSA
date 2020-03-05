import java.util.*;
class Main{
	public static void main(String args[]){
	    
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int currentRanks[]=new int[n]; 
		int c=1;
		currentRanks[0]=1;
		for(int i=0;i<n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
		    currentRanks[i]=(a[i]==a[i-1])?currentRanks[i-1]:currentRanks[i-1]+1;
		}
		System.out.println(Arrays.toString(currentRanks));
	}
}
