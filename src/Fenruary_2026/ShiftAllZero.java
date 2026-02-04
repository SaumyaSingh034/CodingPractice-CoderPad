package Fenruary_2026;

public class ShiftAllZero {
    public static void main(String[] args){
            String str = "010100010110110";
            shiftZeroToLeft(str);

    }

    private static void shiftZeroToLeft(String str) {
        StringBuilder zeros = new StringBuilder();
        StringBuilder nonZeros = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c == '0')
                zeros.append(c);
            else
                nonZeros.append(c);
        }
        System.out.println(zeros.append(nonZeros));
    }
}
