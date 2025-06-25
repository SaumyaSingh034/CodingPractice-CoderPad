package InterviewPreparation;

import java.util.Arrays;

public class ShiftAllZeroToRigit {
    public static void main(String[] args){
        String str = "010100010110110";
        shiftZeroToRight(str);
    }

    private static void shiftZeroToRight(String str) {
        char[] ch = str.toCharArray();
        int right = 0;
        int left = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] != '0'){
                ch[left++] = ch[i];
            }
        }
        for(int i=left;i< ch.length;i++){
            ch[i] = '0';
        }
        System.out.println(Arrays.toString(ch));
    }
}
