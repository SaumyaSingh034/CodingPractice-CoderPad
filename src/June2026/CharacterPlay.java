package June2026;

public class CharacterPlay {
    public static void main(String[] args){
        String str = "aceg";
        playWithCharacter(str);
    }

    private static void playWithCharacter(String str) {
        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){
           int asciiValue = c;
            asciiValue += 1;
            char newChar = (char) asciiValue;
            result.append(newChar);

        }

        System.out.println(result);
    }
}
