package CodePardFinal;

public class StaticCheck {
    static int i = 5;
    public static void main(String[] args){
        System.out.println(i+" ");
        add(i);
        System.out.println(i+" "); //5

    }

    private static int add(int i) {
        i += 5;
        return i;
    }

}
