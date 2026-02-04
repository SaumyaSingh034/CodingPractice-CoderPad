package Fenruary_2026;

public class RemoveTrailingZero {
    public static void main(String[] args) {
        String input = "0000012350609";
        removeTrailingZeros(input);
    }

    private static void removeTrailingZeros(String input) {
        int index = 0;
        for(char c : input.toCharArray()){
            if(c!='0'){
                break;
            }else{
                index++;
            }
        }
        System.out.println(input.substring(index));
    }

}