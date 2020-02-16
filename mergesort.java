class mergesort{
	// void merge(int arr[], int l, int m, int r) 
 //    { 
        
 //        int n1 = m - l + 1; 
 //        int n2 = r - m; 
  
 //        int L[] = new int [n1]; 
 //        int R[] = new int [n2]; 
  
        
 //        for (int i=0; i<n1; ++i) 
 //            L[i] = arr[l + i]; 
 //        for (int j=0; j<n2; ++j) 
 //            R[j] = arr[m + 1+ j]; 
  
  
        
 //        int i = 0, j = 0; 
  
        
 //        int k = l; 
 //        while (i < n1 && j < n2) 
 //        { 
 //            if (L[i] <= R[j]) 
 //            { 
 //                arr[k] = L[i]; 
 //                i++; 
 //            } 
 //            else
 //            { 
 //                arr[k] = R[j]; 
 //                j++; 
 //            } 
 //            k++; 
 //        } 
  
        
 //        while (i < n1) 
 //        { 
 //            arr[k] = L[i]; 
 //            i++; 
 //            k++; 
 //        }
 //        while (j < n2) 
 //        { 
 //            arr[k] = R[j]; 
 //            j++; 
 //            k++; 
 //        } 
 //    } 
	void merge(int arr[], int l, int m, int r) 
	{
		int s=r-l+1;
		int temp[]=new int[s];
		int p1=l;
		int p2=m+1;
		int p3=0;
		while(p1<=m && p2<=r)
		{
			if(arr[p1]<=arr[p2])
			{
				temp[p3]=arr[p1];
				p3++;
				p1++;
			}
			else 
			{
				temp[p3]=arr[p2];
				p3++;
				p2++;
			}
		}
		while(p1<=m)
		{
			temp[p3]=arr[p1];
			p3++;
			p1++;
		}
		while(p2<=r)
		{
			temp[p3]=arr[p2];
			p2++;
			p3++;
		}
		int j=0;
		for(int i=l;i<=r;++i) {
			arr[i]=temp[j];
			j++;
		}


	}
	void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
             
            int m = (l+r)/2; 
  
             
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            merge(arr, l, m, r); 
        } 
    }
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }  
	public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        mergesort ob = new mergesort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 
