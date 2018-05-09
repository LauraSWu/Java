//checks if a word is a palindrome

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int length = word.length();
        char arr[] = (word.toLowerCase()).toCharArray();
        
        for (int i = 0; i < length/2; i++){
        	if (arr[i] != arr[length-1-i]){
        		return false;
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}