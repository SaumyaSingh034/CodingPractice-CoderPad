package June;

public class Power10 {
    public static void main(String[] args){
        int number = 100;
        System.out.println(isPower10Muliplte(number));
    }

    private static boolean isPower10Muliplte(int number) {
        for(int i=1;i<=number;i*=10){
            if(i == number)
                return true;
            if(i > Integer.MAX_VALUE/10)
                return false;
        }
        return false;
    }
}
