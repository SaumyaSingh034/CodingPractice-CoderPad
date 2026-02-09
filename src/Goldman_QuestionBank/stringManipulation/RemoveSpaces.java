package Goldman_QuestionBank.stringManipulation;

public class RemoveSpaces {
    public static void main(String[] args){
        String str = "Automation Test Engineer";
        removeSpacesAndPrintIndex(str);
    }

    private static void removeSpacesAndPrintIndex(String str) {
        str = str.replaceAll(" ", "");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ---> "+i);
        }
    }
}
