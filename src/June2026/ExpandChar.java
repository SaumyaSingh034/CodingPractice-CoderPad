package June2026;

public class ExpandChar {
    public static void main(String[] args){
        String str = "a2b3c4";
        expandString(str);

    }

    private static void expandString(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 1; i<str.length();i+=2){
            int digit = Character.getNumericValue(str.charAt(i));
            while(digit>0){
                result.append(str.charAt(i-1));
                digit--;
            }
        }
        System.out.println(result);
    }
}
