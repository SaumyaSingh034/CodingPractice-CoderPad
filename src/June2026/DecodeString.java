package June2026;

public class DecodeString {
    public static void main(String[] args){
        String str = "a2b3c4";
        // aabbbcccc
        decodeString9(str);
    }

    private static void decodeString9(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=1;i<str.length();i+=2){
            int num = Character.getNumericValue(str.charAt(i)); //2
            while(num>0){
                result.append(str.charAt(i-1));
                num--;
            }
        }
        System.out.println(result);
    }
}
