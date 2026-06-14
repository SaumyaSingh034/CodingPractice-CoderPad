package June2026;

public class RevesreEachWordOFString {
    public static void main(String[] args){
        String str = "Java Selenium TestNG Python Cucumber";
        reverseEachWordOfStringTest9(str);
    }

    private static void reverseEachWordOfStringTest9(String str) {
        StringBuilder result = new StringBuilder();
        for(String word : str.split("\\s+")){

            result.append( new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
