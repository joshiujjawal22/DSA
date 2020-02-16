// To find n=(2^a)+l; further find=2*l+1;

import java.util.Scanner;
class Josephus{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //No. of people
		int start=1;
		while(n>=start*2) start*=2; 
		int l=n-start;

		System.out.println("Last man stand " + (2*(l)+1)); 
	}
}