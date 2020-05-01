import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	
	    double h=sc.nextDouble();
	    double n=sc.nextDouble();
	    double m=sc.nextDouble();
	    
	    System.out.println(Math.ceil((h-m)/(n-m)));
	
		
	}
}