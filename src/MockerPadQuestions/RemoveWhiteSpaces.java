package MockerPadQuestions;

public class RemoveWhiteSpaces {
    public static void main(String[] args){
        String str = "Saumya   mock  coder    pad";
        String result = str.trim().replaceAll("\\s+"," ");
        System.out.println(result);
    }
}
