package July;

public class IsPower10 {
    public static void main(String[] args){
        int number = 100;
        System.out.println(isPowerOf10Check(number));
    }

    private static boolean isPowerOf10Check(int number) {
        for(int i=1;i<=number;i*=10){
            if(i==number){
                return true;
            }
            else if(i > Integer.MAX_VALUE/10)
                return false;
        }
        return false;
    }
}
