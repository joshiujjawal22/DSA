/*To multiply both the strings 
* without using any built in like 
* Big-Integer library.
*/


import java.util.*;

class multiply_strings {

    // Driver Code
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Enter strings to multiply
        String n1=sc.next();
        String n2=sc.next();
        //  Result in string form
        String result=multiply(n1,n2);

        System.out.println(result);
    }

    // Function to multiply two strings
    static String multiply(String num1, String num2) {

        // Converted string to string builder to reverse the string
        // using in built reverse() function of string builder .
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();
     
        int[] d = new int[num1.length()+num2.length()];
     
        // Multiply each digit and sum at the corresponding positions
        for(int i=0; i<n1.length(); i++){
            for(int j=0; j<n2.length(); j++){
                d[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
            }
        }
     
        StringBuilder sb = new StringBuilder();
     
        //calculate each digit
        for(int i=0; i<d.length; i++){
            int mod = d[i]%10;
            int carry = d[i]/10;

            // Adding carry in next position
            if(i+1<d.length){
                d[i+1] += carry;
            }
            // Inserting value of mod in string
            sb.insert(0, mod);
        }
            
        // if first character is zero length of string 
        // is more than one delete first characater.
        while(sb.charAt(0) == '0' && sb.length()> 1){
            sb.deleteCharAt(0);
        }
        
        // Returning string in string format
        return sb.toString();
            
    }
}