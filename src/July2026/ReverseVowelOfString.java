package July2026;

import java.util.Arrays;

public class ReverseVowelOfString {
    public static void main(String[] args){
        String input = "hello";
        reverseOnlyVowels(input);
    }

    private static void reverseOnlyVowels(String input) {
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("Input String is empty");
        }
        int left = 0;
        int right = input.length()-1;
        char[] arr = input.toLowerCase().toCharArray();
        while(left < right){
            if(isVowel(arr[left])){
                if( isVowel(arr[right])) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                }
                right--;
            }
            left++;
        }
        System.out.println(new String(arr));



    }

    private static boolean isVowel(char c) {
        return c == 'a' || c =='e' || c=='i' || c=='o' || c=='u';
    }
}
