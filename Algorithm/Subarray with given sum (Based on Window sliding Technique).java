import java.util.*;

/*
* 
*	To find the subarray with given sum
*	Complexity: O(n)
*	Only for positive integer
*
* 	Based on Window Sliding Technique
*
*	Test Cases:
*	Input:
	5
	1 10 5 9 8
	17
*	Output:
	Sum found between indexes 3 & 4.

*
*/

class subarraywithgivensum 
{ 

	 public static void main(String[] args)  
    { 
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Size of an array"); 
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Input array");
        for(int i=0;i<n;i++)  a[i] = sc.nextInt();

        System.out.println("Enter Sum");
        int sum = sc.nextInt(); 

        findSubArray(a, n, sum); 
    } 

    
    static int findSubArray(int arr[], int n, int sum)  
    { 
        int curr = arr[0], start = 0, i; 
  
        
        for (i = 1; i <= n; i++)  
        { 
            // Remove element from starting
            while (curr > sum && start < i-1) 
            { 
                curr = curr - arr[start]; 
                start++; 
            } 
              
            
            if (curr == sum)  
            { 
                int p = i-1; 
                System.out.println("Sum found between indexes" + start + " and " + p); 
                return 1; 
            } 
              
            
            if (i < n) 
            curr = curr + arr[i]; 
              
        } 
  
        System.out.println("No subarray found with given sum"); 
        return 0; 
    } 
  
   
} 