import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int ele=sc.nextInt();
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		System.out.println(lowerbound(a,0,n-1,ele));
	    System.out.println(upperbound(a,0,n-1,ele));
	}
	    
	    static int upperbound(int a[],int l,int r,int ele){
	        int ans=0;
	        while(l<=r){
	            int mid=(l+r)/2;
	            if(a[mid]==ele){
	                ans=mid;
	                l=mid+1;
	            }
	            else if(a[mid]>ele) r=mid-1;
	            else l=mid+1;
	        }
	        return ans;
	    }
	    static int lowerbound(int a[],int l,int r,int ele){
	        int ans=0;
	        while(l<=r){
	            int mid=(l+r)/2;
	            if(a[mid]==ele){
	                ans=mid;
	                r=mid-1;
	            }
	            else if(a[mid]>ele) r=mid-1;
	            else l=mid+1;
	        }
	        return ans;
	    
	
}
}
