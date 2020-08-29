import java.util.*;

/*
* Perfect Squares
* Find least number of perfect squares
* which is required to make sum equals 
* to n.
*/

class perfect_sqaure{

	public static void main(String[] args) {
		int n=13;
		int answer=p_square(n);
		System.out.println("Sum of minimum number of perfect sqaure required to make "+n+" is = "+answer);
	}

	static int p_square(int n){
		int a[]=new int[n+1];
        
        for(int i=1;i<=n;i++){
            a[i]=Integer.MAX_VALUE;
        }
        
        int m=(int)Math.sqrt(n);
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==j*j) a[i]=1;
                else if(i>j*j){
                    a[i]=Math.min(a[i],a[i-j*j]+1);
                }
            }
        }
        return a[n];
	}
}