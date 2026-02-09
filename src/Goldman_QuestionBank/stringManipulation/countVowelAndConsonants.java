package Goldman_QuestionBank.stringManipulation;

public class countVowelAndConsonants {
    public static void main(String[] args){
        String str = "goldmansachsinterviewprocess";
        String str1 = "saumya";
        countVowelAndConsonants(str);
        countVowelAndConsonants(str1);
    }

    public static void countVowelAndConsonants(String input){
        int countVowel = 0;
        int countConsonants = 0;

        for(char c : input.toLowerCase().toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c== 'u'){
                countVowel++;
            }
            else {
                countConsonants++;
            }
        }
        System.out.println("Vowels : "+countVowel);
        System.out.println("Consonats : "+countConsonants);
    }
}
