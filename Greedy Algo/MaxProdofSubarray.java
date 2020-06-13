 /*
 *
 * Maximum Product of Subarray.
 *
 */
  
class MaxProdSubarray { 
  
    // Function to find maximum product subarray 
    static int maxProd(int arr[], int n) 
    { 
          
        // Variables to store max and min product 
        int minVal = arr[0]; 
        int maxVal = arr[0]; 
      
        int maxProduct = arr[0]; 
      
        for (int i = 1; i < n; i++) 
        { 
      
            // When multiplied by -ve number, 
            // swap maxval and minval
            if (arr[i] < 0) 
            { 
                int temp = maxVal; 
                maxVal = minVal; 
                minVal =temp; 
              
            } 
      
            // maxVal and minVal stores the 
            // product of subarray till ith value i.e arr[i].
            maxVal = Math.max(arr[i], maxVal * arr[i]); 
            minVal = Math.min(arr[i], minVal * arr[i]); 
      
            // Max Product of array. 
            maxProduct = Math.max(maxProduct, maxVal); 
        } 
      
        // Return maximum product found in array. 
        return maxProduct; 
    } 
    
    public static void main (String[] args) 
    { 
        int arr[] = { 1,12,1,0,-5 }; 
        int n = arr.length; 
      
        System.out.println( "Maximum Subarray product is "
                                    + maxProd(arr, n));
                            
    } 
} 