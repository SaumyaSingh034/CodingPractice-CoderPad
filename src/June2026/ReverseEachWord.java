package June2026;

public class ReverseEachWord {
    public static void main(String[] args){
        String str = "Java Selenium Automation";
        reverseEachWord(str);
    }

    private static void reverseEachWord(String str) {
        String[] words = str.split("\\s+");

        StringBuilder result = new StringBuilder();


//        for(String s : words){
//            StringBuilder reverseWords = new StringBuilder(s);
//            result.append(reverseWords.reverse()).append(" ");
//        }
//        System.out.println(result.toString().trim());

        for(String word : words){
            System.out.print(new StringBuilder(word).reverse() +" ");
        }
    }
}
