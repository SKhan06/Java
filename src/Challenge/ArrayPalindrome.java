package Challenge;

public class ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to Array of Palindrome checking ");
        int[] numArray = ArrayUtility.inputArray();
        boolean  pali = palindrome(numArray);
        System.out.println("Palindrome number : " + pali);

     }

     public static boolean palindrome(int[] num){
        int i = 0;

        while (i<num.length/2){
            if (num[i] != num[num.length -1 -i]){
                return false;
            }
            i++;
        }
        return true;

     }
}
