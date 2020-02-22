// With using another variable:

// import java.util.*;
// class main{
// 	public static void main(String[] args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		int a[][]=new int[n][n];
// 		int a_a[][]=new int[n][n];
// 		for(int i=0;i<n;i++)
// 		{
// 			for(int j=0;j<n;j++)
// 			{
// 				a[i][j]=sc.nextInt();
// 			}
// 		}
//  	int p=n;
//     for(int i=0;i<n;i++){
    	
//       for(int j=0;j<n;j++){
//         a_a[j][p-1]=a[i][j];
        
//       }
//       p--;
      
//     }
//     for(int i=0;i<n;i++){
//       for(int j=0;j<n;j++){
//          System.out.print(a_a[i][j]+" ");

//       }
//       System.out.println();
//     }
    
//   }
    
    
// }



// Without using another variable:




import java.util.*;
class main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
int temp=0;
		for(int i=0;i<n/2;i++)
		{	
			for(int j=i;j<n-i-1;j++)
			{	
				temp=a[i][j];
				a[i][j]=a[n-j-1][i];
				a[n-j-1][i]=a[n-i-1][n-j-1];
				a[n-i-1][n-j-1]=a[j][n-i-1];
				a[j][n-i-1]=temp;
			}
		}


    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
         System.out.print(a[i][j]+" ");

      }
      System.out.println();
    }
    
  }
    
    
}



