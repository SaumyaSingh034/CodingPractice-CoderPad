package July2026;

public class CGICodeingQues_001 {
    public static void main(String[] args) {
        /*Check if all ‘a’ come before ‘b’ in the string.
                Input: “aaabb” → true
                Input: “ababa” → false

         */
        String input = "aaabbaaaab";
        String input1 = "aaabb";
        String input2 = "ababa";
        String input3 = "aaaa";
        System.out.println(stringValidation(input));
        System.out.println(stringValidation(input1));
        System.out.println(stringValidation(input2));
        System.out.println(stringValidation(input3));
    }

    private static boolean stringValidation(String input) {
           for(int i=0;i<input.length()-1;i++){
               if(input.charAt(i) == 'b' && input.charAt(i+1) == 'a'){
                       return false;
               }
           }
        return true;
    }
}
