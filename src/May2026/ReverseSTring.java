package May2026;

public class ReverseSTring {
    public static void main(String[] args){
        String str = "tester";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
