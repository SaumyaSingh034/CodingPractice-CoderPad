package CodePardFinal;

public class StringReverseManipulation {
    public static void main(String[] args){
        String str = "I Love Java";
        reverseStringManipulation(str);
    }

    private static void reverseStringManipulation(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb);
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
