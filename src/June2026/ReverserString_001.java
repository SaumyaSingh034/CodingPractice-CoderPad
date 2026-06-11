package June2026;

public class ReverserString_001 {
    public static void main(String[] args){
        String str = "PayPay";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
