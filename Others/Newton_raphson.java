import java.util.*;
class newton_raphson
{public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	double num=sc.nextDouble();
	System.out.println("Guess a number >= (entered_number/2) ");
	double g=sc.nextDouble(); // take guess (num/2);
 double approx=0.01;
 while((g*g)-num>=approx){
 	g=g-((Math.pow(g,2)-num))/(2*g);
 }
 System.out.println(g);
}
}