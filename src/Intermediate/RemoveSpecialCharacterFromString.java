package Intermediate;

public class RemoveSpecialCharacterFromString {
    public static void main(String[] args){
        String str = "Saumya@Singh(844561710@#$)";
        removeSpecialCharacter(str);
        removeSpecialCharacterUsingRegex(str);
    }

    private static void removeSpecialCharacterUsingRegex(String str) {
        str  = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }

    private static void removeSpecialCharacter(String str) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                result.append(c);
            } else if (Character.isDigit(c)) {
                result.append(c);

            }
        }
        System.out.println(result);
    }
}
