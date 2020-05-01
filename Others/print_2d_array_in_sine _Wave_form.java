import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		    for(int j=0;j<n;j++) 
		        a[i][j]=sc.nextInt();
		      
		for(int i=0;i<n;i++)
		    {   int j=0;
		        while(i%2==0 && j<m){System.out.print(a[j][i]+" ");j++;}
		        j=m-1;
		        while(i%2!=0 && j>=0){System.out.print(a[j][i]+" ");j--;}
		    }
		        
		
	}
}
