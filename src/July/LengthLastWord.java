package July;

public class LengthLastWord {
    public static void main(String[] args){
        String str = "Hi My name is Saumya Singh and I am an Automation Test Engineer";
        findLengthofLastWord(str);
    }

    private static void findLengthofLastWord(String str) {
        String[] words = str.split("\\s+");
        System.out.println(words[words.length-1].length());

    }
}
