import java.util.Scanner;
import java.util.Arrays;
class threesum{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Number to be find");
		int n_find=sc.nextInt();
		Arrays.sort(a);
		for(int i=0;i<n;i++)

		{	
			int l=i+1,r=n-1;
			while(l<r){
				if(a[i]+a[l]+a[r]==n_find) {System.out.println(a[i]+" "+ a[l]+" "+a[r]);break;} //if you want all the triplets write l++;r--; insted of break; 
				else if(a[i]+a[l]+a[r]<n_find) l++;
				else r--;
			}
		}
		

		
	}
}