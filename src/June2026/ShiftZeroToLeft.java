package June2026;

public class ShiftZeroToLeft {
    public static void main(String[] args){
        String str = "010100010110110";
        iris_shiftZeroToLeft(str);
    }

    private static void iris_shiftZeroToLeft(String str) {
        StringBuilder zero = new StringBuilder();
        StringBuilder nonZero = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                zero.append('0');
            }
            else{
                nonZero.append(str.charAt(i));
            }
        }
        System.out.println(nonZero.append(zero));
    }
}
