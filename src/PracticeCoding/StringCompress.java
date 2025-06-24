package PracticeCoding;

public class StringCompress {
    public static void main(String[] args){
        String abc = "a2b3c4";
        compressString(abc);

    }

    private static void compressString(String input) {
        StringBuilder sb = new StringBuilder();
        char[] ch = input.toCharArray();
        for(int i=1;i< ch.length;i++){
            if(Character.isDigit(ch[i])){
                int digit = Character.getNumericValue(ch[i]);
                for(int j=0;j<digit;j++){
                    sb.append(ch[i-1]);
                }
            }
        }
        System.out.println(sb.toString());

    }
}