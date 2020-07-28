/*Program to check whether the expression is balanced or not.
*
* Input:{}{}
  Output:Balanced
*
* Input:({})
  Output:Balanced
*
* Input:{}{
  Output:Either the expression is invalid or unbalanced
*/
  
import java.util.*;
import java.io.*;


class Main{

	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		String expr=sc.next();	//To scan the expression

		boolean result=check(expr);

		if(result) System.out.println("Balanced");
		else System.out.println("Either the expression is invalid or unbalanced");

		
	}

	// Function to check whether the expression is balanced or not
	static boolean check(String expr){

		Stack<Character> s=new Stack<Character>(); //Stack class
		
		for(int i=0;i<expr.length();i++)
		{
			if(expr.charAt(i)=='{' || expr.charAt(i)=='[' || expr.charAt(i)=='(') {s.push(expr.charAt(i));}

			else if(!s.isEmpty()) {

				if(expr.charAt(i)=='}' && s.peek()=='{') s.pop();
				else if(expr.charAt(i)==']' && s.peek()=='[') s.pop();
				else if(expr.charAt(i)==')' && s.peek()=='(') s.pop();
				else return false; // If it doesn't satisfy the above balancing condition. 
			}
			else return false;	//If stack is empty
		}
		if(s.isEmpty()) return true; // Stack must be empty
		else return false;
	}
}