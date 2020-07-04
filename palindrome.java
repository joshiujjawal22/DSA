/*
*
*   Program to check whether the given string is palindrome or not,
*   considering only alphanumeric characters and ignoring cases.
*
*   Input: "rock n kcor"
    Output: Yes, This is a palindrome.
*
*/



class palindrome {


    public static void main(String[] args) {

        String s="A man, a plan, a canal: Panama";

        if(checkpalindrome(s)) System.out.println("Yes, This is a palindrome");
        else System.out.println("No, This is not a palindrome");
    }


    // Function to check palindrome
    public static boolean checkpalindrome(String s) {
        if(s==null){
        return false;
    }
 
    s = s.toLowerCase();    //to convert string in lowercase.
 
    int i=0;
    int j=s.length()-1;
 
    while(i<j){
        while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') 
                    || (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
            i++;
        }
 
        while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') 
                    || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
            j--;
        }
 
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
 
        i++;
        j--;
    }
 
    return true;
    }
}