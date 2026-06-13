package June2026;

public class RemoveTrailingZero {
    public static void main(String[] args){
        String str = "0000012350609";
        iris_removeTrailingZero(str);
    }

    private static void iris_removeTrailingZero(String str) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                index = i;
                break;
            }
        }
        System.out.println(str.substring(index));
    }
}
