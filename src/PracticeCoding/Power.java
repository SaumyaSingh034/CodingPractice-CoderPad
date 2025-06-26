package PracticeCoding;

public class Power {
    public static void main(String[] args){
        System.out.println(isPower123(100));

    }

    private static boolean isPower123(int x) {
        for(int i=1;i<=x;i*=10){
            if(i == x)
                return true;
            if(i > Integer.MAX_VALUE/10)
                return false;
        }
        return false;

    }
}
