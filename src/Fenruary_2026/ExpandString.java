package Fenruary_2026;

public class ExpandString {
    public static void main(String[] args){
        String s = "a2b3c6";
        customizedString(s);

    }

    private static void customizedString(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
           if(Character.isDigit(s.charAt(i))){
               int charNum = i-1;
               int count = Character.getNumericValue(s.charAt(i));
               while(count>0){
                   result.append(s.charAt(charNum));
                   count--;
               }
            }
        }
        System.out.println(result);
    }

}
