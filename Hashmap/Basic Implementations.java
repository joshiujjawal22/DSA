/*Program to illustrate the 
* basic implementation of
* hashmap i.e put,get,containskey
*/

// Library used to import hashmap.
import java.util.HashMap; 

public class HashMap_Implementation { 
	public static void main(String[] args) 
	{ 
		// Create a hashmap
		HashMap<String, String> map 
			= new HashMap<>(); 

		// Put function to add ("Keys","Values") in hashmap
		map.put("Ujjawal", "Joshi"); 
		map.put("Ankur", "Lohiya"); 
		map.put("Chetan", "Batra"); 


		// To print size of hashmap using size() function
		System.out.println("Size of map is:- "+ map.size()); 

		// To print content of hashmap 
		System.out.println("Map in format of (Keys=Values):\n"+map);
		
		
	} 
} 
