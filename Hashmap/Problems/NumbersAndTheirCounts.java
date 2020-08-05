// Count repeated numbers
// in an array using hashmap

import java.util.*;

class numberCounts{

	public static void main(String args[]){

		int a[]={2,5,10,10,10,5,2,34};

		HashMap <Integer,Integer> map=new HashMap<>();

		// To put values in hashmap
		for(int i=0;i<a.length;i++)
		{
			Integer count=map.get(a[i]);
			if(count==null) 
				map.put(a[i],1);
			else {
				map.put(a[i],++count);
			}
		}

		// Traversal in map
		for (Map.Entry<Integer,Integer> e : map.entrySet()) 
            System.out.println("Frequency of "+e.getKey()+" is "+ e.getValue());
	}
}