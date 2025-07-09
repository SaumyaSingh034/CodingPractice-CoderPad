package CodePardFinal;

public class Power10 {
    public static void main(String[] args){
        int number = 10;
        for(int i=1;i<=number; i*=10){
            if(i == number)
                System.out.println("true");
        }
    }
}
