package CodePardFinal;

public class FindNonRepatChar {
    public static void main(String[] args){
        String str = "Saumya";
        checkFirstNonRepeatingCharacter(str);
    }

    private static void checkFirstNonRepeatingCharacter(String str) {
        if(str == null || str.isEmpty())
            throw new IllegalArgumentException("");
        for(char c : str.toCharArray()){
            
        }
    }
}
