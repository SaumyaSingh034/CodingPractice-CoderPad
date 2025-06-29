package June;

import java.util.stream.StreamSupport;

public class MissingNumber {
    public static void main(String[] args){
        int[] number = {1,2,4,6};
        for(int i=1;i<number.length;i++){
            int c = number[i];
            int p = number[i-1];//1
            for(int j=p+1;j<c;j++){
                System.out.println(j+" ");
            }
        }
    }
}
