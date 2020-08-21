import java.util.*;

/* Program to find most water contained by container
*  Note:All the integers should be non-negative.
*
* Input:[1,8,6,2,5,4,8,3,7]
  Output:Most water contained by container is 49
*/


class container_with_most_water{
	// Driver Code
	public static void main(String[] args) {
		int container[]={1,8,6,2,5,4,8,3,7};

		int result=water_container(container);

		System.out.println("Most water contained by container is "+ result);
	}

	// Function of Container with most water
	static int water_container(int cont[]){
		int l=0;
        int r=cont.length-1;
        int max=0;
        // To find container with
        // maximum height.
        while(l<r){
            max=Math.max(max,(r-l)*Math.min(cont[l],cont[r]));
            if(cont[l]<cont[r]) l++;
            else r--;
        }
        return max;
	}
}