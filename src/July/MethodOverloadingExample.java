package July;

public class MethodOverloadingExample {
    public static void main(String[] args){
        System.out.println(calculate(1, 2));
    }

    public static int calculate(int a, int b){
        return a+b;
    }

    public static String calculate(String data, String data2){
        return data+data2;
    }

    public static long calculate(long num){
        return num;
    }


    public static String calculate(String disp){
        return disp;
    }
}
