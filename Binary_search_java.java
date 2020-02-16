// class BinarySearch { 
//     
//     int binarySearch(int arr[], int x) 
//     { 
//         int l = 0, r = arr.length - 1;
//         int c=0; 
//         while (l <= r) { 
//             int m = l + (r - l) / 2; //(r+l)/2; 
//             c++;
//             System.out.println(c);
  
//             
//             if (arr[m] == x) 
//                 return m; 
  
//             
//             if (arr[m] < x) 
//                 l = m + 1; 
  
//         
//             else
//                 r = m - 1; 
//         } 
   
//         return -1; 
//     } 
  
//      
//     public static void main(String args[]) 
//     { 
//         BinarySearch ob = new BinarySearch(); 
//         int arr[] = { 2, 3, 4, 10, 40,42,50,60 }; 
//         int n = arr.length; 
//         int x = 40; 
//         int result = ob.binarySearch(arr, x); 
//         if (result == -1) 
//             System.out.println("Element not present"); 
//         else
//             System.out.println("Element found at "
//                                + "index " + result); 
//     } 
// } 



class BinarySearch{

static int Binary_search(int arr[],int l,int r,int e_to_be_find)
{
    if (r >= l) { 
        int mid =(r+l) /2 ; //l+(r-l)/2; 
  
        
        if (arr[mid] == e_to_be_find) 
            return mid; 
  
        
        if (arr[mid] > e_to_be_find) 
            return Binary_search(arr, l, mid - 1, e_to_be_find); 
  
        else
        return Binary_search(arr, mid + 1, r, e_to_be_find); 
    } 
  
    return -1; 
} 
  
public static void main(String args[]) 
{ 
    int arr[] = { 10,12,16,18,25,26,27 }; 
    int n = arr.length; 
    int e_to_be_find = 27; 
    int result = Binary_search(arr, 0, n - 1, e_to_be_find); 
    if(result==-1) System.out.println("Element not Present");
    else System.out.println(result);
    
} 
}
