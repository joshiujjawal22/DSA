import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
			int found=find(a);
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(found==a[i]) c++;
		}
		if(c>n/2) System.out.println("Majority element is "+found);
		else System.out.println("No Majority element");
			
}
static int find(int a[])
{
	int index=0;
	int count=1;
	for(int i=1;i<a.length;i++)
	{
		if(a[index]==a[i]) count++;
		else count--;
		if(count==0) {
			index=i;
			count=1;
		} 
	}
	return a[index];
}

}