/*Program to illustrate the 
* basic implementation of
* hashmap i.e put(),get(),
* containskey(),isEmpty(),
* size(),iteration in hashmap
*/

// Library used to import hashmap.
import java.util.*; 

public class HashMap_Implementation { 
	public static void main(String[] args) 
	{ 
		// Create a hashmap
		HashMap<String, String> map 
			= new HashMap<>(); 

		// To check the hashmap 
		// is empty or not
		// using isEmpty() function
		System.out.println("If map is empty it returns "+map.isEmpty());

		// Put function to add 
		// ("Keys","Values") in hashmap
		map.put("Ujjawal", "Joshi"); 
		map.put("Ankur", "Lohiya"); 
		map.put("Chetan", "Batra"); 


		// To print size of hashmap 
		// using size() function
		System.out.println("Size of map is:- "+ map.size()); 

		// To print content of hashmap 
		System.out.println("Map in format of (Keys=Values):\n"+map);

		// To check the hashmap 
		// is empty or not 
		// using isEmpty() function
		System.out.println("If map is not empty it returns "+map.isEmpty());

		// To get the value using get("keys") function:
		System.out.println(map.get("Ujjawal"));

		// To check whether the hashmap contains a key or not
		// Using containsKey("Value")
		// if key is found it returns true else false
		System.out.println(map.containsKey("Joshi"));

		// To iterate the map using entryset(),getkey()
		// and getValue() function
		System.out.println("Print using Iteration");
		for (Map.Entry<String, String> e : map.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue());
	} 
} 
