import java.util.*;
class main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
			Arrays.sort(a);
		int min=a[(m-1)]-a[0];
		for(int i=1;i<n-(m-1);i++)
		{
			if(a[i+(m-1)]-a[i]<min && min>0)  min=a[i+(m-1)]-a[i];
		}
		System.out.println(min);
	}
}
