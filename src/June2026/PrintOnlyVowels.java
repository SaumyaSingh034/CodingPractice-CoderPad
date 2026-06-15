package June2026;

public class PrintOnlyVowels {
    public static void main(String[] args){
        String str = "saumyasingh";

        printOnlyVowels56(str);
    }

    private static void printOnlyVowels56(String str) {
        for(char c : str.toLowerCase().toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.print(c+" ");
            }
        }

    }
}
