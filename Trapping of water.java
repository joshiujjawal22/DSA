//--------------------------------Trapping of water in n^2 complexity-------------------------------------------------
import java.util.Scanner;
class trapping_of_water{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int Filled_water=0;
	for(int i=0;i<n;i++)
	{	int first=a[i];
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

		Filled_water=Filled_water+(min-a[i]);

	}
	System.out.println(Filled_water);

}


}
