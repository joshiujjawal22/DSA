/*
*
* Fibonacci using Recursion.
*
*/


class Fibonacci{
	public static int fibRec(int n){

	if(n == 0){
		return 0;
	}

	if(n == 1 || n == 2){
			return 1;
		}

	return fibRec(n-2) + fibRec(n-1);
	}

    public static void main(String args[]) {
	int maxNumber = 10;
	System.out.println("Fibonacci Series upto "+ maxNumber + " numbers:");
	for(int i = 0; i < maxNumber; i++){
			System.out.print(fibRec(i) +" ");
		}
	}
}