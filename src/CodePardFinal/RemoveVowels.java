package CodePardFinal;

public class RemoveVowels {
    public static void main(String[] args){
        String str = "SaumyaSingh";
        str = str.replaceAll("[aeiou]","");
        System.out.println(str);
    }
}
