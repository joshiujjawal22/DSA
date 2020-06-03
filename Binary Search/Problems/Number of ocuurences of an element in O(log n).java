import java.util.*;
class Main{
	public static void main(String[] args){
	int a[]={5,7,7,7,7,8,8};
	int target=7;
	int l_l=0,r_l=a.length-1;
	int l_u=0,r_u=a.length-1;
	int a_u=0;
	int a_l =0;
	while(l_l<=r_l)
	{
		int mid=(l_l+r_l)/2;
		if(a[mid]==target) {
			a_l=mid;
				r_l=mid-1;}
		else if(a[mid]>target)
			r_l=mid-1;
		else l_l=mid+1;

	}
	while(l_u<=r_u)
	{
		int mid=(l_u+r_u)/2;
		if(a[mid]==target) {
			a_u=mid;
				l_u=mid+1;}
		else if(a[mid]>target)
			r_u=mid-1;
		else l_u=mid+1;

	}
	System.out.println(a_u-a_l+1);

	}
}
