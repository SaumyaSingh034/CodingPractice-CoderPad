package January_2026;

public class ShiftVowels {
    public static void main(String[] args){
        /*
         Move vowels to the left, consonants in the middle, special chars to the right
         */

        String input = "saumya@9112abcdefgh6755lknmo&%^singh";
        System.out.println(arrange(input));
    }

    private static String arrange(String input) {
        StringBuilder vowel = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for(char c : input.toCharArray()){
            if (isVowel(c)) {
                vowel.append(c);

            }else if(Character.isLetter(c)) {
                consonants.append(c);
            }
            else{
                specialChars.append(c);
            }
        }
        return vowel.append(consonants).append(specialChars).toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c=='i' || c =='o' || c =='u';
    }
}
