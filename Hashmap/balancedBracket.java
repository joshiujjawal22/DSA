/*Program to check whether the expression is balanced or not using hashmap
*
* Input:{}{}
  Output:True
*
* Input:({})
  Output:True
*
* Input:{}{
  Output:False
*/

import java.util.*;

public class BalancedBracketUsingHashmap {

    // Function to check whether the expression is valid or not.
    static boolean isValid(String s) {
        // Hashmap
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        // Stack
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                stk.push(c);
            } else if(!stk.empty() && map.get(stk.peek())==c){
                stk.pop();
            } else {
                return false;
            }
        }
        return stk.empty();
    }

    public static void main(String[] args) {

        String s="[{}{}]";

        boolean result=isValid(s);
        System.out.println(result);
    }

}