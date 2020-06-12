
/*
*
* Element appear only once in sorted array
*
*/

public class eleOnlyOnce
{ 
    
    public static int onlyonce(int[] nums) 
    { 

        int l=0,r=nums.length-1;

        while(l<=r){

            // Find the mid point 
            int mid=(l+r)/2;
            if(l==r) return l;
            

            // If mid is even then element at mid must be  
            // equal to mid+1 then output element on the
            // right side, else on left side 
            else if(mid % 2 == 0) { 
                if(nums[mid] == nums[mid+1]) 
                    l=mid+2; 
                else
                    r=mid; 
            } 
        
             // If mid is odd then element at mid must be  
            // equal to mid-1 then output element on the
            // right side, else on left side 
            else{ 
                if(nums[mid] == nums[mid-1]) 
                   l=mid+1; 
                else
                    r=mid-1; 
            } 
        }
            return -1;
    }

  
    public static void main(String[] args)  
    { 
        int[] arr = {1, 1, 2, 4, 4, 5, 5, 6, 6}; 
        int res=onlyonce(arr); 
        if(res==-1) System.out.println("Not found");
        else System.out.println("Element is " + arr[res]);
    }     
} 