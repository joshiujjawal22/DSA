
/*
*
* Program to find factorial using recursion.
*
*/

class fact{
	public static void main(String args[]){
		int factorial=fact(10);

		System.out.println(factorial);
	}

// Recursive function to evaluate factorial
static int fact(int n)
{
    if (n <= 1) // base case
        return 1;
    else    
        return n*fact(n-1);    
}
}