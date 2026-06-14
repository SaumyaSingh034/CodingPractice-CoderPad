package June2026;

public class StringPermutation9 {
    public static void main(String[] args){
        String str = "ABC";
        caculatePermutations8(str, "");
    }

    private static void caculatePermutations8(String str, String answer) {
        if(str.length() == 0){
            System.out.println(answer+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i); //A
            String left = str.substring(0, i); //A
            String right = str.substring(i+1);//C
            String rest = left + right;
            caculatePermutations8(rest, answer+ch);
        }
    }
}
