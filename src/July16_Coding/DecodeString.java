package July16_Coding;

public class DecodeString {
    public static void main(String[] args){
        String str = "a2b3";
        decodeString(str);
    }

    private static void decodeString(String str) {
        StringBuilder result = new StringBuilder();
        char[] charData = str.toCharArray();
        for(int i=1;i<charData.length;i+=2){
            int count = Character.getNumericValue(charData[i]);
            while(count>0){
                result.append(charData[i-1]);
                count--;
            }

        }
        System.out.println(result);

    }
}
