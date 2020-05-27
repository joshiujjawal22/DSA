/*
* 
*   To find the maximum product of subset in the given array
*   Complexity: O(n)
*   Counted as greedy algo
*/

class maxproductofsubset { 
  
    static int maxProdsubset(int a[], int n) { 
    	// If only one element in the array
        if (n == 1) { 
            return a[0]; 
        } 
  
        
        int max_neg = Integer.MIN_VALUE; 
        int negcount = 0, zeroCount = 0; 
        int prod = 1; 
        for (int i = 0; i < n; i++) { 
  
            // Count occurence of zero in the array
            if (a[i] == 0) { 
                zeroCount++; 
                continue; 
            } 
  
            // Count negative values
            // Keep the value of maximum negative
            if (a[i] < 0) { 
                negcount++; 
                max_neg = Math.max(max_neg, a[i]); 
            } 
  
            prod = prod * a[i]; 
        } 
  
        // if all values are zero in array 
        if (zeroCount == n) { 
            return 0; 
        } 
  
        // If there are odd number of negative numbers 
        if (negcount % 2 == 1) { 
  
            // If there is only one negative and all other elements are zero
            if (negcount == 1
                    && zeroCount > 0
                    && zeroCount + negcount == n) { 
                return 0; 
            } 
  
       	
            prod = prod / max_neg; 
        } 
  
        return prod; 
    } 
 
    public static void main(String[] args) { 
        int a[] = {-2,-3,-5,6,7}; 
        int n = a.length; 
        System.out.println("Maximum product of the subset in the given array is "+maxProdsubset(a, n)); 
  
    } 
} 