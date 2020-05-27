/*
* 
*   To find the minimum product of subset in the given array
*   Complexity: O(n)
*   Counted as greedy algo
*/

class minproductofsubset { 
  
    static int minProdsubset(int a[], int n) { 

        // If only one element in the array
        if (n == 1) return a[0];

       int negmax = Integer.MIN_VALUE; 
        int posmin = Integer.MAX_VALUE; 
        int count_neg = 0, count_zero = 0; 
        int product = 1; 
          
        for (int i = 0; i < n; i++) 
        { 
              
           // Count occurence of zero in the array
            if(a[i] == 0){ 
                count_zero++; 
                continue; 
            } 
              
        // Count negative values
        // Keep the value of maximum negative 
        if(a[i] < 0) 
        { 
                count_neg++; 
                negmax = Math.max(negmax, a[i]); 
            } 
              
            // find the minimum positive number 
            if(a[i] > 0 && a[i] < posmin) 
            posmin = a[i]; 
              
            product *= a[i]; 
        } 
          
        // if there are all zeroes 
        // or zero is present but no  
        // negative number is present 
        if (count_zero == n ||  
            (count_neg == 0 && count_zero > 0)) 
            return 0; 
              
        // If there are all positive 
        if (count_neg == 0) 
            return posmin; 
              
        // If there are even number except  
        // zero of negative numbers  
        if (count_neg % 2 == 0 && count_neg != 0) 
        { 
      
            // Otherwise result is product of 
            // all non-zeros divided by maximum 
            // valued negative. 
            product = product / negmax; 
        } 
          
        return product; 
    } 
 
    public static void main(String[] args) { 
        int a[] = {-1,-3,5,6,7}; 
        int n = a.length; 
        System.out.println("Minimum product of the subset in the given array is "+minProdsubset(a, n)); 

    } 
} 